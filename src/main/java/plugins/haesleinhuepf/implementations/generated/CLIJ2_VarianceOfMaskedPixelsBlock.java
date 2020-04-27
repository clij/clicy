package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.VarianceOfMaskedPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_VarianceOfMaskedPixelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the variance in an image, but only in pixels which have non-zero values in another binary mask image. 
     * 
     * The result is put in the results table as new column named 'Masked_variance'.
     */
    public CLIJ2_VarianceOfMaskedPixelsBlock() {
        super(new VarianceOfMaskedPixels());
    }

}
