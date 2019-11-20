package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.DifferenceOfGaussian2D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_DifferenceOfGaussian2DBlock extends AbstractCLIJxBlock {
   
    /**
     * Applies Gaussian blur to the input image twice resulting in two images which are then subtracted from each other.
     */
    public CLIJx_DifferenceOfGaussian2DBlock() {
        super(new DifferenceOfGaussian2D());
    }

}
