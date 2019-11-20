package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.StandardDeviationOfMaskedPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_StandardDeviationOfMaskedPixelsBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines the standard deviation of all pixels in an image which have non-zero value in a corresponding mask image. The value will be stored in a new row of ImageJs
     * Results table in the column 'Masked_standard_deviation'.
     */
    public CLIJx_StandardDeviationOfMaskedPixelsBlock() {
        super(new StandardDeviationOfMaskedPixels());
    }

}
