package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ListAvailableGPUs;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ListAvailableGPUsBlock extends AbstractCLIJ2Block {
   
    /**
     * Reads out properties of the currently active GPU writes it to the results table in the columns 'GPUName', 'Memory_in_bytes' and 'OpenCL_Version'.
     */
    public CLIJ2_ListAvailableGPUsBlock() {
        super(new ListAvailableGPUs());
    }

}
