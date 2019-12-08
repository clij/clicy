package net.haesleinhuepf.clicy.codegenerator;

import net.haesleinhuepf.clij.macro.CLIJMacroPlugin;
import net.haesleinhuepf.clij.macro.CLIJMacroPluginService;
import net.haesleinhuepf.clij.macro.documentation.OffersDocumentation;
import org.scijava.Context;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CLIJxBlockGenerator {

    private static final String blocklist = new String(",pushArray," +
            "push," +
            "pushCurrentSlice," +
            "pushCurrentZStack," +
            "pullAsROI," +
            "pullBinary," +
            "pull," +
            "pullLabelsToROIManager," +
            "pullToROIManager," +
            "image2DToResultsTable," +
            "resultsTableToImage2D," +
            "stopwatch," +
            "release," +
            "help," +
            "clear," +
            "clinfo,").toLowerCase();

    public static void main(String ... args) {
        CLIJMacroPluginService service = new Context(CLIJMacroPluginService.class).getService(CLIJMacroPluginService.class);

        int count = 0;
        for (String name : service.getCLIJMethodNames()) {
            CLIJMacroPlugin plugin = service.getCLIJMacroPlugin(name);

            String fullClassName = plugin.getClass().getName();
            String simpleClassName = plugin.getClass().getSimpleName();

            String documentation = "";
            if (plugin instanceof OffersDocumentation) {
                documentation = ((OffersDocumentation) plugin).getDescription();
            }

            if (!blocklist.contains("," + simpleClassName.toLowerCase() + ",")) {
                generateWrapper(simpleClassName, fullClassName, documentation);
                generateButton(simpleClassName);
                count++;
            }

            //break;
        }

        System.out.println("" + count + " wrappers generated.");

    }

    private static void generateButton(String simpleClassName) {
        //

        try {
            String template = new String(Files.readAllBytes(Paths.get("src/main/java/plugins/haesleinhuepf/buttons/TemplateEzPlug.java")));
            template = template.replace("CLIJx_AbsoluteBlock", "CLIJx_" + simpleClassName + "Block");
            template = template.replace("class TemplateEzPlug", "class " + simpleClassName);

            writeFile("src/main/java/plugins/haesleinhuepf/buttons/" + simpleClassName + ".java", template);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void generateWrapper(String pluginClassname, String fullPluginClassName, String documentation) {

        String klassName = "CLIJx_" + pluginClassname + "Block";

        StringBuilder builder = new StringBuilder();
        builder.append("package plugins.haesleinhuepf.implementations.generated;\n");
        builder.append("import plugins.haesleinhuepf.AbstractCLIJxBlock;\n");
        builder.append("import " + fullPluginClassName + ";\n");

        builder.append("// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details\n");
        builder.append("public class " + klassName + " extends AbstractCLIJxBlock {\n");
        builder.append("   \n");

        builder.append("    /**\n");
        builder.append("     * " + documentation.replace("\n", "\n     * ") + "\n");
        builder.append("     */\n");

        builder.append("    public " + klassName + "() {\n");
        builder.append("        super(new " + pluginClassname + "());\n");
        builder.append("    }\n\n");

        builder.append("}\n");

        writeFile("src/main/java/plugins/haesleinhuepf/implementations/generated/" + klassName + ".java", builder.toString() );

    }

    private static void writeFile(String filename, String content) {
        File outputTarget = new File(filename);

        try {
            FileWriter writer = new FileWriter(outputTarget);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
