package plugins.haesleinhuepf;


import icy.plugin.PluginDescriptor;
import icy.plugin.abstract_.Plugin;
import icy.plugin.interface_.PluginBundled;
import icy.plugin.interface_.PluginLibrary;
import ij.measure.ResultsTable;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.macro.AbstractCLIJPlugin;
import net.haesleinhuepf.clij.macro.CLIJOpenCLProcessor;
import net.haesleinhuepf.clij.macro.documentation.OffersDocumentation;
import net.haesleinhuepf.clij2.CLIJ2;
import net.haesleinhuepf.clij2.utilities.HasAuthor;
import net.haesleinhuepf.clij2.utilities.HasLicense;
import plugins.adufour.blocks.lang.Block;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.*;
import plugins.adufour.workbooks.*;
import org.apache.poi.ss.usermodel.Workbook;

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
        initializeSpecialCases(plugin);
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
        if (!executeSpecialCases(clij2, plugin, parameterValues)) {
            if (plugin instanceof CLIJOpenCLProcessor) {
                ((CLIJOpenCLProcessor) plugin).executeCL();
            }
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


    private final String WORKBOOK = "Workbook";

    private void initializeSpecialCases(AbstractCLIJPlugin plugin) {
        if (plugin instanceof net.haesleinhuepf.clij2.plugins.StatisticsOfBackgroundAndLabelledPixels || plugin instanceof net.haesleinhuepf.clij2.plugins.StatisticsOfImage || plugin instanceof net.haesleinhuepf.clij2.plugins.StatisticsOfLabelledPixels) {
            outputParameters.add(WORKBOOK, new VarWorkbook("Workbook","Sheet1"));
        }
    }

    private boolean executeSpecialCases(CLIJ2 clij2, AbstractCLIJPlugin plugin, Object[] args) {
        ResultsTable table = new ResultsTable();
        ClearCLBuffer input = (ClearCLBuffer) args[0];

        if (plugin instanceof net.haesleinhuepf.clij2.plugins.StatisticsOfBackgroundAndLabelledPixels) {
            ClearCLBuffer labelmap = (ClearCLBuffer) args[1];
            net.haesleinhuepf.clij2.plugins.StatisticsOfBackgroundAndLabelledPixels.statisticsOfBackgroundAndLabelledPixels(clij2, input, labelmap, table );
        } else if (plugin instanceof net.haesleinhuepf.clij2.plugins.StatisticsOfImage) {
            net.haesleinhuepf.clij2.plugins.StatisticsOfImage.statisticsOfImage(clij2, input, table );
        } else if (plugin instanceof net.haesleinhuepf.clij2.plugins.StatisticsOfLabelledPixels) {
            ClearCLBuffer labelmap = (ClearCLBuffer) args[1];
            net.haesleinhuepf.clij2.plugins.StatisticsOfLabelledPixels.statisticsOfLabelledPixels(clij2, input, labelmap, table );
        } else {
            return false;
        }

        // Create an empty workbook
        Workbook workbook = Workbooks.createEmptyWorkbook();

        // Get a (possibly new) sheet
        IcySpreadSheet sheet = Workbooks.getSheet(workbook, "Sheet 1");

        // Set the header row (all at once, easier to write!)
        sheet.setRow(0, table.getHeadings()); // etc.

        for (int row = 0; row < table.size(); row++) {
            for (String header : table.getHeadings()) {
                int column = table.getColumnIndex(header);
                double value = table.getValueAsDouble(column, row);
                sheet.setValue(row + 1, column, value);
            }
        }

        outputParameters.get(WORKBOOK).setValue(workbook);

        //Workbooks.show(wb, “Workbook test”, false);
        return true;
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

    public AbstractCLIJPlugin getCLIJ2Plugin() {
        return plugin;
    }


}
