package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GetGPUProperties;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GetGPUPropertiesBlock extends AbstractCLIJ2Block {
   
    /**
     * Reads out properties of the currently active GPU and write it in the variables 'GPU_name', 
     * 'global_memory_in_bytes' and 'OpenCL_Version'.
     */
    public CLIJ2_GetGPUPropertiesBlock() {
        super(new GetGPUProperties());
    }

}
