package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MeanOfMaskedPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MeanOfMaskedPixelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the mean intensity in a masked image. 
     * 
     * Only in pixels which have non-zero values in another binary mask image.
     */
    public CLIJ2_MeanOfMaskedPixelsBlock() {
        super(new MeanOfMaskedPixels());
    }

}
