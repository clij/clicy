package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.ListAvailableGPUs;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_ListAvailableGPUsBlock extends AbstractCLIJxBlock {
   
    /**
     * Reads out properties of the currently active GPU writes it to the results table in the columns 'GPUName', 'Memory_in_bytes' and 'OpenCL_Version'.
     */
    public CLIJx_ListAvailableGPUsBlock() {
        super(new ListAvailableGPUs());
    }

}
