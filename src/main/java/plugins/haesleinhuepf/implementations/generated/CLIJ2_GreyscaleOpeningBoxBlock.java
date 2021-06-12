package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GreyscaleOpeningBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GreyscaleOpeningBoxBlock extends AbstractCLIJ2Block {
   
    /**
     * Apply a greyscale morphological opening to the input image.
     * 
     * It applies a minimum filter first and the result is processed by a maximum filter with given radii.
     * High intensity regions smaller than radius will disappear.
     */
    public CLIJ2_GreyscaleOpeningBoxBlock() {
        super(new GreyscaleOpeningBox());
    }

}
