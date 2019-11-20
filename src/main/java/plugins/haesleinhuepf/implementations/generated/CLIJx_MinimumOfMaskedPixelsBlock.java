package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.MinimumOfMaskedPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_MinimumOfMaskedPixelsBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines the minimum intensity in an image, but only in pixels which have non-zero values in another mask image.
     */
    public CLIJx_MinimumOfMaskedPixelsBlock() {
        super(new MinimumOfMaskedPixels());
    }

}
