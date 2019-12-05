package plugins.haesleinhuepf;


import icy.plugin.PluginDescriptor;
import icy.plugin.abstract_.Plugin;
import icy.plugin.interface_.PluginBundled;
import icy.plugin.interface_.PluginLibrary;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.macro.AbstractCLIJPlugin;
import net.haesleinhuepf.clij.macro.CLIJOpenCLProcessor;
import net.haesleinhuepf.clij.macro.documentation.OffersDocumentation;
import net.haesleinhuepf.clijx.CLIJx;
import net.haesleinhuepf.clijx.utilities.HasAuthor;
import net.haesleinhuepf.clijx.utilities.HasLicense;
import plugins.adufour.blocks.lang.Block;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.Var;
import plugins.adufour.vars.lang.VarBoolean;
import plugins.adufour.vars.lang.VarDouble;
import plugins.adufour.vars.lang.VarString;

import java.net.URL;

public abstract class AbstractCLIJxBlock extends Plugin implements Block, PluginLibrary, PluginBundled {

    AbstractCLIJPlugin plugin;
    VarList inputParameters;
    VarList outputParameters;

    PluginDescriptor descriptor;

    public AbstractCLIJxBlock(AbstractCLIJPlugin plugin) {
        super();
        this.plugin = plugin;

        PluginDescriptor descriptor = super.getDescriptor();
        String description = "";
        if (plugin instanceof OffersDocumentation) {
            description = description + ((OffersDocumentation) plugin).getDescription() + "\n\n";
        }
        if (plugin instanceof HasLicense) {
            description = description + ((HasLicense) plugin).getLicense() + "\n\n";
        }
        descriptor.setDescription(description);

        descriptor.setIconUrl("plugins/haesleinhuepf/clij_logo.png");
        if (plugin instanceof HasAuthor) {
            descriptor.setAuthor(((HasAuthor) plugin).getAuthorName());
        } else {
            descriptor.setAuthor("Robert Haase");
        }
        descriptor.setEmail("rhaase@mpi-cbg.de");
        descriptor.setWeb("https://clij.github.io/clicy/");
        descriptor.setName(this.getName());

        inputParameters = new VarList();
        outputParameters = new VarList();
        inputParameters.add("cl_device", new VarString("cl_device", ""));

        String[] definedParameters = plugin.getParameterHelpText().split(",");
        for (String definedParameter : definedParameters) {
            String[] parameter = definedParameter.trim().split(" ");
            if (parameter.length < 2) {
                continue;
            }
            String parameterType = parameter[0];
            String parameterName = parameter[1];

            if (parameterType.compareTo("Image") == 0) {
                if (parameterName.toLowerCase().contains("destination")) {
                    outputParameters.add(parameterName, new VarClearCLBuffer(parameterName));
                } else {
                    inputParameters.add(parameterName, new VarClearCLBuffer(parameterName));
                }
            } else if (parameterType.compareTo("Number") == 0) {
                inputParameters.add(parameterName, new VarDouble(parameterName, 2));
            } else if (parameterType.compareTo("String") == 0) {
                inputParameters.add(parameterName, new VarString(parameterName, ""));
            } else if (parameterType.compareTo("Boolean") == 0) {
                inputParameters.add(parameterName, new VarBoolean(parameterName, true));
            }
        }
    }

    @Override
    public String getMainPluginClassName()
    {
        return CLIJxBlocks.class.getName();
    }

    @Override
    public void declareInput(VarList varList) {
        for (Var var : inputParameters) {
            varList.add(var.getName(), var);
        }
    }

    @Override
    public void declareOutput(VarList varList) {
        for (Var var : outputParameters) {
            varList.add(var.getName(), var);
        }
    }

    @Override
    public void run() {
        CLIJx clijx = CLIJx.getInstance((String) inputParameters.get("cl_device").getValue());

        String[] definedParameters = plugin.getParameterHelpText().split(",");
        Object[] parameterValues = new Object[definedParameters.length];
        plugin.setClij(clijx.getClij());
        int i = 0;

        ClearCLBuffer firstInputBuffer = null;
        for (String definedParameter : definedParameters) {
            String[] parameter = definedParameter.trim().split(" ");
            String parameterType = parameter[0];
            String parameterName = parameter[1];

            if (parameterType.compareTo("Image") == 0) {
                if (parameterName.toLowerCase().contains("destination")) {
                    //outputParameters.add(parameterName, new VarClearCLBuffer(parameterName));
                    parameterValues[i] = null;
                } else {
                    parameterValues[i] = inputParameters.get(parameterName).getValue();
                    if (firstInputBuffer == null) {
                        firstInputBuffer = (ClearCLBuffer) parameterValues[i];
                    }
                }
            } else if (parameterType.compareTo("Number") == 0) {
                parameterValues[i] = inputParameters.get(parameterName).getValue();
            } else if (parameterType.compareTo("String") == 0) {
                parameterValues[i] = inputParameters.get(parameterName).getValue();
            } else if (parameterType.compareTo("Boolean") == 0) {
                parameterValues[i] = inputParameters.get(parameterName).getValue();
            }
            i++;
        }

        plugin.setArgs(parameterValues);
        for (int j = 0; j < parameterValues.length; j++) {
            if (parameterValues[j] == null) {
                parameterValues[j] = plugin.createOutputBufferFromSource(firstInputBuffer);
            }
        }
        if (plugin instanceof CLIJOpenCLProcessor) {
            ((CLIJOpenCLProcessor) plugin).executeCL();
        }

        i = 0;
        for (String definedParameter : definedParameters) {
            String[] parameter = definedParameter.trim().split(" ");
            String parameterType = parameter[0];
            String parameterName = parameter[1];

            if (parameterType.compareTo("Image") == 0) {
                if (parameterName.toLowerCase().contains("destination")) {
                    outputParameters.get(parameterName).setValue(parameterValues[i]);
                }
            }
            i++;
        }
    }

    public void setDescriptor(PluginDescriptor descriptor) {
    }

    @Override
    public PluginDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return descriptor.getName();
    }
}
