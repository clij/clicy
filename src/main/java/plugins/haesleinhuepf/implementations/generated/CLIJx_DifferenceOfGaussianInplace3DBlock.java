package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.DifferenceOfGaussianInplace3D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_DifferenceOfGaussianInplace3DBlock extends AbstractCLIJxBlock {
   
    /**
     * Applies Gaussian blur to the input image twice with different sigma values resulting in two images which are then subtracted from each other.
     * 
     * It is recommended to apply this operation to images of type Float (32 bit) as results might be negative.
     */
    public CLIJx_DifferenceOfGaussianInplace3DBlock() {
        super(new DifferenceOfGaussianInplace3D());
    }

}
