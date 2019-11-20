package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.MaximumOfMaskedPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_MaximumOfMaskedPixelsBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines the maximum intensity in an image, but only in pixels which have non-zero values in another mask image.
     */
    public CLIJx_MaximumOfMaskedPixelsBlock() {
        super(new MaximumOfMaskedPixels());
    }

}
