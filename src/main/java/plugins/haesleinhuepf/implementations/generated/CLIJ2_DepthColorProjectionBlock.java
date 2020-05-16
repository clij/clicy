package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DepthColorProjection;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DepthColorProjectionBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines a maximum projection of an image stack and does a color coding of the determined arg Z (position of the found maximum). 
     * 
     * Second parameter is a Lookup-Table in the form of an 8-bit image stack 255 pixels wide, 1 pixel high with 3 planes representing red, green and blue intensities.
     * Resulting image is a 3D image with three Z-planes representing red, green and blue channels.
     */
    public CLIJ2_DepthColorProjectionBlock() {
        super(new DepthColorProjection());
    }

}
