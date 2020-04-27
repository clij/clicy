package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MinimumOfMaskedPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MinimumOfMaskedPixelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the minimum intensity in a masked image. 
     * 
     * But only in pixels which have non-zero values in another mask image.
     */
    public CLIJ2_MinimumOfMaskedPixelsBlock() {
        super(new MinimumOfMaskedPixels());
    }

}
