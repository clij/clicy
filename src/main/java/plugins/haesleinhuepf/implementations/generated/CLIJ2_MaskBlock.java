package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Mask;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MaskBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes a masked image by applying a binary mask to an image. 
     * 
     * All pixel values x of image X will be copied
     * to the destination image in case pixel value m at the same position in the mask image is not equal to 
     * zero.
     * 
     * <pre>f(x,m) = (x if (m != 0); (0 otherwise))</pre>
     */
    public CLIJ2_MaskBlock() {
        super(new Mask());
    }

}
