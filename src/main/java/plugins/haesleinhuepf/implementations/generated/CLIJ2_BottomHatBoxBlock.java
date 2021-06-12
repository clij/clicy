package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.BottomHatBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_BottomHatBoxBlock extends AbstractCLIJ2Block {
   
    /**
     * Apply a bottom-hat filter for background subtraction to the input image.
     * 
     * Parameters
     * ----------
     * input : Image
     *     The input image where the background is subtracted from.
     * destination : Image
     *     The output image where results are written into.
     * radius_x : Image
     *     Radius of the background determination region in X.
     * radius_y : Image
     *     Radius of the background determination region in Y.
     * radius_z : Image
     *     Radius of the background determination region in Z.
     * 
     */
    public CLIJ2_BottomHatBoxBlock() {
        super(new BottomHatBox());
    }

}
