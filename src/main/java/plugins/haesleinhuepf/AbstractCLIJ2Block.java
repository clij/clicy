package plugins.haesleinhuepf;


import icy.plugin.PluginDescriptor;
import icy.plugin.abstract_.Plugin;
import icy.plugin.interface_.PluginBundled;
import icy.plugin.interface_.PluginLibrary;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.macro.AbstractCLIJPlugin;
import net.haesleinhuepf.clij.macro.CLIJOpenCLProcessor;
import net.haesleinhuepf.clij.macro.documentation.OffersDocumentation;
import net.haesleinhuepf.clij2.CLIJ2;
import net.haesleinhuepf.clij2.utilities.HasAuthor;
import net.haesleinhuepf.clij2.utilities.HasLicense;
import plugins.adufour.blocks.lang.Block;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.Var;
import plugins.adufour.vars.lang.VarBoolean;
import plugins.adufour.vars.lang.VarDouble;
import plugins.adufour.vars.lang.VarString;

public abstract class AbstractCLIJ2Block extends Plugin implements Block, PluginLibrary, PluginBundled {

    AbstractCLIJPlugin plugin;
    public VarList inputParameters;
    public VarList outputParameters;

    PluginDescriptor descriptor;

    public AbstractCLIJ2Block(AbstractCLIJPlugin plugin) {
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
            boolean byref = false;
            if (parameterType.contains("ByRef")) {
                parameterType = parameter[1];
                parameterName = parameter[2];
                byref = true;
            }

            if (parameterType.compareTo("Image") == 0) {
                if (parameterName.toLowerCase().contains("destination") || byref) {
                    outputParameters.add(parameterName, new VarClearCLBuffer(parameterName));
                } else {
                    inputParameters.add(parameterName, new VarClearCLBuffer(parameterName));
                }
            } else if (parameterType.compareTo("Number") == 0) {
                if (byref) {
                    outputParameters.add(parameterName, new VarDouble(parameterName, 2));
                } else {
                    inputParameters.add(parameterName, new VarDouble(parameterName, 2));
                }
            } else if (parameterType.compareTo("String") == 0) {
                if (byref) {
                    outputParameters.add(parameterName, new VarString(parameterName, ""));
                } else {
                    inputParameters.add(parameterName, new VarString(parameterName, ""));
                }
            } else if (parameterType.compareTo("Boolean") == 0) {
                if (byref) {
                    outputParameters.add(parameterName, new VarBoolean(parameterName, true));
                } else {
                    inputParameters.add(parameterName, new VarBoolean(parameterName, true));
                }
            }
        }
    }

    @Override
    public String getMainPluginClassName()
    {
        return CLIJ2Blocks.class.getName();
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
        CLIJ2 clij2 = CLIJ2.getInstance((String) inputParameters.get("cl_device").getValue());


        String[] definedParameters = plugin.getParameterHelpText().split(",");
        Object[] parameterValues = new Object[definedParameters.length];
        Object[] parameterTypes = new Object[definedParameters.length];
        plugin.setClij(clij2.getClij());
        int i = 0;

        ClearCLBuffer firstInputBuffer = null;
        for (String definedParameter : definedParameters) {
            String[] parameter = definedParameter.trim().split(" ");
            String parameterType = parameter[0];
            String parameterName = parameter[1];
            boolean byref = false;
            if (parameterType.contains("ByRef")) {
                parameterType = parameter[1];
                parameterName = parameter[2];
                byref = true;
            }

            if (parameterType.compareTo("Image") == 0) {
                parameterTypes[i] = ClearCLBuffer.class;
                if (parameterName.toLowerCase().contains("destination") || byref) {
                    //outputParameters.add(parameterName, new VarClearCLBuffer(parameterName));
                    parameterValues[i] = null;
                } else {
                    parameterValues[i] = inputParameters.get(parameterName).getValue();
                    if (firstInputBuffer == null) {
                        firstInputBuffer = (ClearCLBuffer) parameterValues[i];
                    }
                }
            } else if (parameterType.compareTo("Number") == 0) {
                parameterTypes[i] = Double.class;
                if (!byref) {
                    parameterValues[i] = inputParameters.get(parameterName).getValue();
                }
            } else if (parameterType.compareTo("String") == 0) {
                parameterTypes[i] = String.class;
                if (!byref) {
                    parameterValues[i] = inputParameters.get(parameterName).getValue();
                }
            } else if (parameterType.compareTo("Boolean") == 0) {
                parameterTypes[i] = Boolean.class;
                if (!byref) {
                    parameterValues[i] = inputParameters.get(parameterName).getValue();
                }
            }
            i++;
        }

        plugin.setArgs(parameterValues);
        for (int j = 0; j < parameterValues.length; j++) {
            if (parameterValues[j] == null) {
                if (parameterTypes[j] == ClearCLBuffer.class) {
                    parameterValues[j] = plugin.createOutputBufferFromSource(firstInputBuffer);
                    Recorder.recordCreate((ClearCLBuffer)parameterValues[j]);
                } else if (parameterTypes[j] == Double.class) {
                    parameterValues[j] = new Double[1];
                } else if (parameterTypes[j] == String.class) {
                    parameterValues[j] = new String[1];
                } else if (parameterTypes[j] == Boolean.class) {
                    parameterValues[j] = new Boolean[1];
                }
            }
        }
        if (plugin instanceof CLIJOpenCLProcessor) {
            ((CLIJOpenCLProcessor) plugin).executeCL();
        }
        Recorder.recordCommand(plugin.getName(), parameterValues);

        i = 0;
        for (String definedParameter : definedParameters) {
            String[] parameter = definedParameter.trim().split(" ");
            String parameterType = parameter[0];
            String parameterName = parameter[1];
            boolean byref = false;
            if (parameterType.contains("ByRef")) {
                parameterType = parameter[1];
                parameterName = parameter[2];
                byref = true;
            }

            if (parameterType.compareTo("Image") == 0) {
                if (parameterName.toLowerCase().contains("destination") || byref) {
                    outputParameters.get(parameterName).setValue(parameterValues[i]);
                }
            } else if (parameterType.compareTo("Number") == 0) {
                if (byref) {
                    outputParameters.get(parameterName).setValue(((Double[])parameterValues[i])[0]);
                }
            } else if (parameterType.compareTo("String") == 0) {
                if (byref) {
                    outputParameters.get(parameterName).setValue(((String[])parameterValues[i])[0]);
                }
            } else if (parameterType.compareTo("Boolean") == 0) {
                if (byref) {
                    outputParameters.get(parameterName).setValue(((Boolean[])parameterValues[i])[0]);
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
