package net.haesleinhuepf.clicy.codegenerator;

import net.haesleinhuepf.clij.macro.CLIJMacroPlugin;
import net.haesleinhuepf.clij.macro.CLIJMacroPluginService;
import net.haesleinhuepf.clij.macro.documentation.OffersDocumentation;
import org.scijava.Context;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
                count++;
            }

            //break;
        }

        System.out.println("" + count + " wrappers generated.");

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

        File outputTarget = new File("src/main/java/plugins/haesleinhuepf/implementations/generated/" + klassName + ".java");

        try {
            FileWriter writer = new FileWriter(outputTarget);
            writer.write(builder.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
