package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GaussianBlur2D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GaussianBlur2DBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes the Gaussian blurred image of an image given two sigma values in X and Y. 
     * 
     * Thus, the filterkernel can have non-isotropic shape.
     * 
     * The implementation is done separable. In case a sigma equals zero, the direction is not blurred.
     */
    public CLIJ2_GaussianBlur2DBlock() {
        super(new GaussianBlur2D());
    }

}
