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

        //ClassLoader classLoader = getClass().getClassLoader();

        //File file = new File(classLoader.getResource("clij2.xml"));

        //File is found
        //IJ.log("File Found : " + file.exists());

        //Read File Content
        //String content = new String(Files.readAllBytes(file.toPath()));
        //IJ.log(content);


        //InputStream fin = null;
        OutputStream fout = null;

        //fin = classLoader.getResourceAsStream("clij2.xml");
                //new BufferedInputStream(classLoader.getResourceAsStream("clij2.xml"));

                //getClass().getResourceAsStream("clij2.xml");
        fout = new BufferedOutputStream(new FileOutputStream(destinationFile));

        fout.write(new String("" +
                "<root description=\"CLIJ2\" name=\"clij2\">\n" +
                "<task name=\"CLIJ2 filters\">\n" +
                "<band name=\"CLIJ2\">\n" +
                "<item classname=\"plugins.haesleinhuepf.Recorder\" priority=\"top\"/>\n" +
                "</band>\n" +
                "<band name=\"Filter\">\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.GaussianBlur2D\" priority=\"top\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.GaussianBlur3D\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Mean2DBox\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Mean3DBox\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Minimum2DBox\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Minimum3DBox\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Maximum2DBox\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Maximum3DBox\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.LaplaceBox\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Sobel\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.VoronoiOctagon\" priority=\"med\"/>\n" +
                "</band>\n" +
                "<band name=\"Background\">\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.DifferenceOfGaussian2D\" priority=\"top\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.DifferenceOfGaussian3D\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.TopHatBox\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.BottomHatBox\" priority=\"med\"/>\n" +
                "</band>\n" +
                "</task>\n" +
                "<task name=\"CLIJ2 math\">\n" +
                "<band name=\"CLIJ2\">\n" +
                "<item classname=\"plugins.haesleinhuepf.Recorder\" priority=\"top\"/>\n" +
                "</band>\n" +
                "<band name=\"Math\">\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Absolute\" priority=\"top\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.AddImagesWeighted\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.AddImageAndScalar\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.DivideImages\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Invert\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.MultiplyImages\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.EqualizeMeanIntensitiesOfSlices\" priority=\"top\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Exponential\" priority=\"top\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Power\" priority=\"top\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Logarithm\" priority=\"top\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.EqualizeMeanIntensitiesOfSlices\" priority=\"top\"/>\n" +
                "</band>\n" +
                "<band name=\"Projections\">\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.MaximumZProjection\" priority=\"top\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.MeanZProjection\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.MinimumZProjection\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.StandardDeviationZProjection\" priority=\"med\"/>\n" +
                "</band>\n" +
                "</task>\n" +
                "<task name=\"CLIJ2 transformation / segmentation\">\n" +
                "<band name=\"CLIJ2\">\n" +
                "<item classname=\"plugins.haesleinhuepf.Recorder\" priority=\"top\"/>\n" +
                "</band>\n" +
                "<band name=\"Transformation\">\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.AffineTransform2D\" priority=\"top\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.AffineTransform3D\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ApplyVectorField2D\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ApplyVectorField3D\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Flip2D\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Flip3D\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.RotateClockwise\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.RotateCounterClockwise\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Resample\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.TransposeXY\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.TransposeXZ\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.TransposeYZ\" priority=\"med\"/>\n" +
                "</band>\n" +
                "<band name=\"Binary\">\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.BinaryAnd\" priority=\"top\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.BinaryOr\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.BinaryXOr\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.BinaryNot\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.BinarySubtract\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.BinaryEdgeDetection\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ErodeBox\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.DilateBox\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ClosingBox\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.OpeningBox\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Mask\" priority=\"med\"/>\n" +
                "</band>\n" +
                "<band name=\"Segmentation\">\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.AutomaticThreshold\" priority=\"top\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.Threshold\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdDefault\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdOtsu\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdHuang\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdIntermodes\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdIsoData\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdIJ_IsoData\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdLi\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdMaxEntropy\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdMean\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdMinError\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdMinimum\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdMoments\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdPercentile\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdRenyiEntropy\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdShanbhag\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdTriangle\" priority=\"low\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ThresholdYen\" priority=\"low\"/>\n" +
                "</band>\n" +
                "<band name=\"Labelling\">\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ConnectedComponentsLabelingBox\" priority=\"top\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.ExcludeLabelsOnEdges\" priority=\"med\"/>\n" +
                "<item classname=\"plugins.haesleinhuepf.buttons.StatisticsOfLabelledPixels\" priority=\"med\"/>\n" +
                "</band>\n" +
                "</task>\n" +
                "\n" +
                "</root>\n").getBytes()
        );

        // java.io.InputStream
        //InputStream inputStream = fin;
        //InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        //BufferedReader reader = new BufferedReader(streamReader);
        //for (String line; (line = reader.readLine()) != null;) {
        //    System.out.println("Reading: " + line);
        //    fout.write(line.getBytes());
        //}

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