package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.NotEqualConstant;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_NotEqualConstantBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines if two images A and B equal pixel wise.
     * 
     * f(a, b) = 1 if a != b; 0 otherwise.Parameters
     * ----------
     * source : Image
     *     The image where every pixel is compared to the constant.
     * destination : Image
     *     The resulting binary image where pixels will be 1 only if source1 and source2 equal in the given pixel.
     * constant : float
     *     The constant where every pixel is compared to.
     * 
     */
    public CLIJ2_NotEqualConstantBlock() {
        super(new NotEqualConstant());
    }

}
