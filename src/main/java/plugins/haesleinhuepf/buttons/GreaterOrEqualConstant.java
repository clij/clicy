package plugins.haesleinhuepf.buttons;
import icy.sequence.Sequence;
import net.haesleinhuepf.clicy.CLICY;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import plugins.adufour.ezplug.*;
import plugins.adufour.vars.lang.Var;
import plugins.adufour.vars.lang.VarBoolean;
import plugins.adufour.vars.lang.VarDouble;
import plugins.adufour.vars.lang.VarString;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import plugins.haesleinhuepf.Recorder;
import plugins.haesleinhuepf.VarClearCLBuffer;
import plugins.haesleinhuepf.implementations.generated.CLIJx_GreaterOrEqualConstantBlock;

import javax.swing.*;
import java.util.ArrayList;

// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class GreaterOrEqualConstant extends EzPlug {

    AbstractCLIJxBlock plugin = new CLIJx_GreaterOrEqualConstantBlock();

    @Override
    public void clean() {
        // dialog closed
        ezVar = null;
    }

    @Override
    public void execute() {
        CLICY clijx = CLICY.getInstance((String) plugin.inputParameters.get("cl_device").getValue());
        Recorder.initRecorder();
        Recorder.record("\n// " + plugin.getName() + "\n");

        ArrayList<ClearCLBuffer> created = new ArrayList<>();
        int count = 0;
        for (Var var : plugin.inputParameters) {
            if (var instanceof VarClearCLBuffer) {
                Sequence sequence = (Sequence) ezVar.get(count).getValue();
                ClearCLBuffer buffer = clijx.pushSequence(sequence);
                Recorder.recordPush(sequence, buffer);
                var.setValue(buffer);
                created.add(((VarClearCLBuffer) var).getValue());
            }
            count++;
        }
        plugin.run();
        for (Var var : plugin.outputParameters) {
            if (var instanceof VarClearCLBuffer) {
                ClearCLBuffer buffer = ((VarClearCLBuffer) var).getValue();
                created.add(buffer);
                Sequence sequence = clijx.pullSequence(buffer);

                Recorder.recordPull(sequence, buffer);
                addSequence(sequence);

                SwingUtilities.invokeLater(() -> {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sequence.updateChannelsBounds(true);
                });

            }
        }
        for (ClearCLBuffer buffer : created) {
            clijx.release(buffer);
        }

    }

    ArrayList<EzVar> ezVar = null;

    @Override
    public void initialize() {
        ezVar = new ArrayList<>();
        for (Var var : plugin.inputParameters) {
            handleVar(var);
        }
        for (Var var : plugin.outputParameters) {
            handleVar(var);
        }
        if (plugin != null && plugin.getDescriptor() != null && plugin.getDescriptor().getDescription() != null) {
            addEzComponent(new EzLabel(plugin.getDescriptor().getDescription()));
        }
    }

    private void handleVar(Var var) {
        if (var instanceof VarClearCLBuffer) {
            EzVarSequence evs = new EzVarSequence(var.getName());
            addEzComponent(evs);
            ezVar.add(evs);
        } else if (var instanceof VarDouble) {
            EzVarDouble evs = new EzVarDouble(var.getName());
            addEzComponent(evs);
            ezVar.add(evs);
        } else if (var instanceof VarBoolean) {
            EzVarBoolean evs = new EzVarBoolean(var.getName(), ((VarBoolean) var).getDefaultValue());
            addEzComponent(evs);
            ezVar.add(evs);
        } else if (var instanceof VarString) {
            EzVarText evs = new EzVarText(var.getName());
            addEzComponent(evs);
            ezVar.add(evs);
        }
    }
}
