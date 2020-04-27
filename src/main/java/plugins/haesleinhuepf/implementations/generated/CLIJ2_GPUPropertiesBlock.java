package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GPUProperties;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GPUPropertiesBlock extends AbstractCLIJ2Block {
   
    /**
     * Reads out properties of the currently active GPU writes it to the 
     *  results table in the columns 'GPUName', 'Global_memory_in_bytes' and 'OpenCL_Version'.
     */
    public CLIJ2_GPUPropertiesBlock() {
        super(new GPUProperties());
    }

}
