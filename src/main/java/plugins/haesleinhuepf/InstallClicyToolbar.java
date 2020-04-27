package plugins.haesleinhuepf;

import icy.preferences.WorkspaceLocalPreferences;
import icy.sequence.Sequence;
import icy.workspace.WorkspaceLoader;
import ij.IJ;
import ij.gui.WaitForUserDialog;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.coremem.enums.NativeTypeEnum;
import plugins.adufour.ezplug.EzComponent;
import plugins.adufour.ezplug.EzPlug;
import plugins.adufour.ezplug.EzVarText;
import plugins.tprovoost.scripteditor.main.ScriptEditorPlugin;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;

public class InstallClicyToolbar extends EzPlug {

    @Override
    public void clean() {

    }

    @Override
    public void execute() {
    }

    @Override
    protected void initialize() {
        try {
            installToolbar();
        } catch (Exception e) {
            IJ.log(e.getMessage());
            StackTraceElement[] s = e.getStackTrace();
            for (StackTraceElement el : s) {
                IJ.log(el.toString());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new InstallClicyToolbar().installToolbar();
    }

    private void installToolbar() throws IOException {
        IJ.log("Installing " + WorkspaceLoader.WORKSPACE_PATH + "/clij2.xml");
        File destinationFile = new File(WorkspaceLoader.WORKSPACE_PATH + "/clij2.xml");

        ClassLoader classLoader = getClass().getClassLoader();

        //File file = new File(classLoader.getResource("clij2.xml"));

        //File is found
        //IJ.log("File Found : " + file.exists());

        //Read File Content
        //String content = new String(Files.readAllBytes(file.toPath()));
        //IJ.log(content);


        InputStream fin = null;
        OutputStream fout = null;

        fin = classLoader.getResourceAsStream("clij2.xml");
                //new BufferedInputStream(classLoader.getResourceAsStream("clij2.xml"));

                //getClass().getResourceAsStream("clij2.xml");
        fout = new BufferedOutputStream(new FileOutputStream(destinationFile));



        // java.io.InputStream
        InputStream inputStream = fin;
        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        for (String line; (line = reader.readLine()) != null;) {
            System.out.println("Reading: " + line);
            fout.write(line.getBytes());
        }

        /*
        byte[] readBytes = new byte[1024];
        int bytecount = 0;


        while((bytecount = fin.read(readBytes)) != -1)
        {

            System.out.println("Reading: " + new String(readBytes));
            fout.write(readBytes, 0, bytecount);

        }*/
        fout.close();

        WorkspaceLocalPreferences.setWorkspaceEnable("clij2", true);

        IJ.log("Clicy toolbar installed successfully. Please restart Icy.");
    }
}