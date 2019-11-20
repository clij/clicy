package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.MeanOfMaskedPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_MeanOfMaskedPixelsBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines the mean intensity in an image, but only in pixels which have non-zero values in another binary mask image.
     */
    public CLIJx_MeanOfMaskedPixelsBlock() {
        super(new MeanOfMaskedPixels());
    }

}
