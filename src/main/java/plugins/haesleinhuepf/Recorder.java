package plugins.haesleinhuepf;

import gnu.trove.map.custom_hash.TObjectLongCustomHashMap;
import icy.main.Icy;
import icy.script.ScriptEditor;
import icy.sequence.Sequence;
import ij.IJ;
import net.haesleinhuepf.clicy.CLICY;
import net.haesleinhuepf.clicy.converters.SequenceToClearCLBufferConverter;
import net.haesleinhuepf.clij.clearcl.ClearCL;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.coremem.enums.NativeTypeEnum;
import org.scijava.ui.swing.script.PromptPane;
import plugins.adufour.ezplug.*;
import plugins.haesleinhuepf.implementations.generated.CLIJx_AbsoluteBlock;
import plugins.tprovoost.scripteditor.main.ScriptEditorPlugin;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Recorder extends EzPlug {


    EzVarText commandList = new EzVarText("Commands");

    static TextArea area = null;

    public static String getBufferNameFromSequenceName(Sequence sequence) {
        String sequenceName = niceName("sequence", sequence);
        if (bufferNamesOfSequences.containsKey(sequenceName)) {
            String bufferName = bufferNamesOfSequences.get(sequenceName);
            //IJ.log("registering " + sequenceName + " with " + bufferName);
            return bufferName;
        } else {
            return null;
        }
    }

    @Override
    public void clean() {

    }

    @Override
    public void execute() {
        ScriptEditorPlugin.openInScriptEditor(area.getText() + "\n\n//Clean up memory\nclijx.clear();", niceName("new ", new Object()));
    }

    @Override
    protected void initialize() {
        if (area == null) {
            area = new TextArea();
        }

        addEzComponent(new EzComponent(""){
            @Override
            protected void addTo(Container container) {
                container.add(area);
                area.setPreferredSize(new Dimension(200, 150));
            }

            @Override
            public void setToolTipText(String s) {

            }
        });
    }


    public static void recordCommand(String command, Object[] args) {
        if (area != null) {
            initRecorder();
            String log = "clijx." + command.replace("CLIJx_", "").replace("CLIJ_", "") + "(";
            int count = 0;
            for (Object arg : args) {
                if (count > 0) {
                    log = log + ", ";
                }
                if (arg instanceof ClearCLBuffer) {
                    log = log + niceName("buffer", arg);
                } else if (arg instanceof String) {
                    log = log + "\"" + ((String) arg).replace("\"", "\\\"") + "\"";
                } else {
                    log = log + arg;
                }
                count++;
            }

            record(log + ");\n");
        }
    }

    public static void recordPush(Sequence sequence, ClearCLBuffer buffer) {
        initRecorder();
        String sequenceName = niceName("sequence", sequence);
        if (area != null) {
            if (!area.getText().contains(sequenceName + " = clijx.pull" )) {
                record("" + sequenceName + " = getSequence();\n");
            }
            String bufferName = niceName("buffer", buffer);
            record("" + bufferName + " = clijx.pushSequence(" + sequenceName + ");\n");
            //IJ.log("sequenceA " + sequenceName + bufferName);
            bufferNamesOfSequences.put(sequenceName, bufferName);
        }
    }

    public static void recordPull(Sequence sequence, ClearCLBuffer buffer) {
        initRecorder();
        String sequenceName = niceName("sequence", sequence);
        String bufferName = niceName("buffer", buffer);
        record("" + sequenceName + " = clijx.pullSequence(" + bufferName + ");\n");
        record("Icy.addSequence(" + sequenceName + ");\n");
        //IJ.log("sequenceB " + sequenceName + bufferName);
        bufferNamesOfSequences.put(sequenceName, bufferName);

    }

    public static void recordCreate(ClearCLBuffer buffer) {
        initRecorder();
        String type = "Float";
        if (buffer.getNativeType() == NativeTypeEnum.Byte) {
            type = "Byte";
        } else if (buffer.getNativeType() == NativeTypeEnum.UnsignedShort) {
            type = "UnsignedShort";
        }

        if (buffer.getDimension() == 2) {
            record(niceName("buffer", buffer) + " = clijx.create([" + buffer.getWidth() + ", " + buffer.getHeight() + "], clijx." + type + ");\n");
        } else {
            record(niceName("buffer", buffer) + " = clijx.create([" + buffer.getWidth() + ", " + buffer.getHeight() + ", " + buffer.getDepth() + "], clijx." + type + ");\n");
        }
    }

    public static void recordRelease(ClearCLBuffer buffer) {
        initRecorder();
        if (area != null) {
            record("clijx.release(" + niceName("buffer", buffer) + ");\n");
        }
    }

    public static void initRecorder() {
        if (area != null && !area.getText().contains("CLICY")) {
            niceNames.clear();
            bufferNamesOfSequences.clear();
            record("importClass(net.haesleinhuepf.clicy.CLICY);\n" +
                    "importClass(Packages.icy.main.Icy);\n" +
                    "clijx = CLICY.getInstance();\n");
        }
    }

    private static HashMap<String, String> bufferNamesOfSequences = new HashMap<>();
    private static HashMap<String, String> niceNames = new HashMap<>();
    public static String niceName(String type, Object object) {
        String key = object.toString();
        String value = "";
        if (niceNames.containsKey(key)) {
            value = niceNames.get(key);
        } else {
            value = type + (niceNames.size() + 1);
            niceNames.put(key, value);
        }
        return value;
    }

    public static void record(String text) {
        if (area != null) {
            area.append(text);
        }
    }
}