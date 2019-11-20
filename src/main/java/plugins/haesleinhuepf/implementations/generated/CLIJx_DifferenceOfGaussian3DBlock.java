package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.DifferenceOfGaussian3D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_DifferenceOfGaussian3DBlock extends AbstractCLIJxBlock {
   
    /**
     * Applies Gaussian blur to the input image twice resulting in two images which are then subtracted from each other.
     */
    public CLIJx_DifferenceOfGaussian3DBlock() {
        super(new DifferenceOfGaussian3D());
    }

}
