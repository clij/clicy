package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Crop2D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_Crop2DBlock extends AbstractCLIJ2Block {
   
    /**
     * Crops a given rectangle out of a given image. 
     * 
     * Note: If the destination image pre-exists already, it will be overwritten and keep it's dimensions.
     * 
     * Parameters
     * ----------
     * source : Image
     *     The image where a part will be cropped out.
     * destination : Image
     *     The cropped image will be stored in this variable.
     * start_x : Number
     *     The horizontal position of the region to crop in the source image.
     * start_y : Number
     *     The vertical position of the region to crop in the source image.
     * width : Number
     *     The width of the region to crop in the source image.
     * height : Number
     *     The height of the region to crop in the source image.
     * 
     */
    public CLIJ2_Crop2DBlock() {
        super(new Crop2D());
    }

}
