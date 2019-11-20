package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.GetGPUProperties;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_GetGPUPropertiesBlock extends AbstractCLIJxBlock {
   
    /**
     * Reads out properties of the currently active GPU writes it to the results table in the columns 'GPUName', 'Memory_in_bytes' and 'OpenCL_Version'.
     */
    public CLIJx_GetGPUPropertiesBlock() {
        super(new GetGPUProperties());
    }

}
