package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.BlurBuffers3D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_BlurBuffers3DBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes the Gaussian blurred image of an image given sigma values in X, Y and Z. Thus, the filterkernel can have non-isotropic shape.
     * 
     * The implementation is done separable. In case a sigma equals zero, the direction is not blurred.
     */
    public CLIJx_BlurBuffers3DBlock() {
        super(new BlurBuffers3D());
    }

}
