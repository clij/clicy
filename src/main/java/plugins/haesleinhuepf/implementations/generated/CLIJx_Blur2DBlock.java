package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.Blur2D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_Blur2DBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes the Gaussian blurred image of an image given two sigma values in X and Y. Thus, the filterkernel can have non-isotropic shape.
     * 
     * The implementation is done separable. In case a sigma equals zero, the direction is not blurred.
     */
    public CLIJx_Blur2DBlock() {
        super(new Blur2D());
    }

}
