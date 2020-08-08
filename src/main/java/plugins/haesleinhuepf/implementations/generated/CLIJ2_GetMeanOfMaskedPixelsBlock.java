package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GetMeanOfMaskedPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GetMeanOfMaskedPixelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the mean of all pixels in a given image which have non-zero value in a corresponding mask image. 
     * 
     * It will be stored in the variable mean_of_masked_pixels.
     */
    public CLIJ2_GetMeanOfMaskedPixelsBlock() {
        super(new GetMeanOfMaskedPixels());
    }

}
