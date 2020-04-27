package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.CustomOperation;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_CustomOperationBlock extends AbstractCLIJ2Block {
   
    /**
     * Executes a custom operation wirtten in OpenCL on a custom list of images. 
     * 
     * All images must be created before calling this method. Image parameters should be handed over as an array with parameter names and image names alternating, e.g.
     * 
     * Ext.CLIJ2_customOperation(..., ..., newArray("image1", "blobs.gif", "image2", "Processed_blobs.gif"))
     * 
     * In the custom code, you can use the predefined variables x, y and z to deal with coordinates.
     * You can for example use it to access pixel intensities like this:
     * 
     * float value = READ_IMAGE(image, sampler, POS_image_INSTANCE(x, y, z, 0)).x;
     * WRITE_IMAGE(image, POS_image_INSTANCE(x, y, z, 0), CONVERT_image_PIXEL_TYPE(value));
     * 
     * Note: replace `image` with the given image parameter name. You can furthermore use custom function to organise code in the global_code parameter. In OpenCL they may look like this:
     * 
     * inline float sum(float a, float b) {
     *     return a + b;
     * }
     * 
     */
    public CLIJ2_CustomOperationBlock() {
        super(new CustomOperation());
    }

}
