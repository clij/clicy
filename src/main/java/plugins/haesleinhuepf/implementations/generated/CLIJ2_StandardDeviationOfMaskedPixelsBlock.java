package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.StandardDeviationOfMaskedPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_StandardDeviationOfMaskedPixelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the standard deviation of all pixels in an image which have non-zero value in a corresponding mask image. 
     * 
     * The value will be stored in a new row of ImageJs
     * Results table in the column 'Masked_standard_deviation'.
     */
    public CLIJ2_StandardDeviationOfMaskedPixelsBlock() {
        super(new StandardDeviationOfMaskedPixels());
    }

}
