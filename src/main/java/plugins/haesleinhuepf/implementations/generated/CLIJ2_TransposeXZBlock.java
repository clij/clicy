package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.TransposeXZ;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_TransposeXZBlock extends AbstractCLIJ2Block {
   
    /**
     * Transpose X and Z axes of an image.
     * 
     * Parameters
     * ----------
     * input : Image
     *     The input image.
     * destination : Image
     *     The output image where results are written into.
     * 
     */
    public CLIJ2_TransposeXZBlock() {
        super(new TransposeXZ());
    }

}
