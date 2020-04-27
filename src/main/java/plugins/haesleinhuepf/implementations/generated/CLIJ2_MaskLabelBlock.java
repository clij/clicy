package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MaskLabel;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MaskLabelBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes a masked image by applying a label mask to an image. 
     * 
     * All pixel values x of image X will be copied
     * to the destination image in case pixel value m at the same position in the label_map image has the right index value i.
     * 
     * f(x,m,i) = (x if (m == i); (0 otherwise))
     */
    public CLIJ2_MaskLabelBlock() {
        super(new MaskLabel());
    }

}
