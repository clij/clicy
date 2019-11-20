package plugins.haesleinhuepf;


import icy.plugin.abstract_.Plugin;
import icy.plugin.interface_.PluginBundled;
import icy.plugin.interface_.PluginLibrary;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.macro.AbstractCLIJPlugin;
import net.haesleinhuepf.clij.macro.CLIJOpenCLProcessor;
import net.haesleinhuepf.clijx.CLIJx;
import plugins.adufour.blocks.lang.Block;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.Var;
import plugins.adufour.vars.lang.VarBoolean;
import plugins.adufour.vars.lang.VarDouble;
import plugins.adufour.vars.lang.VarString;

public class AbstractCLIJBlock extends Plugin implements Block, PluginLibrary, PluginBundled {

    AbstractCLIJPlugin plugin;
    VarList inputParameters;
    VarList outputParameters;

    public AbstractCLIJBlock(AbstractCLIJPlugin plugin) {
        super();
        this.plugin = plugin;

        inputParameters = new VarList();
        outputParameters = new VarList();
        inputParameters.add("cl_device", new VarString("cl_device", ""));

        String[] definedParameters = plugin.getParameterHelpText().split(",");
        for (String definedParameter : definedParameters) {
            String[] parameter = definedParameter.trim().split(" ");
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
        return CLIJBlocks.class.getName();
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

    /*@Override
    public String getName() {
        return plugin.getName();
    }*/
}
