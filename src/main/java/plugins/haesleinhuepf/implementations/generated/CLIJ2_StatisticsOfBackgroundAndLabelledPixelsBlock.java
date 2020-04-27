package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.StatisticsOfBackgroundAndLabelledPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_StatisticsOfBackgroundAndLabelledPixelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines bounding box, area (in pixels/voxels), min, max and mean intensity 
     *  of background and labelled objects in a label map and corresponding pixels in the original image.
     * 
     * Instead of a label map, you can also use a binary image as a binary image is a label map with just one label.
     * 
     * This method is executed on the CPU and not on the GPU/OpenCL device.
     */
    public CLIJ2_StatisticsOfBackgroundAndLabelledPixelsBlock() {
        super(new StatisticsOfBackgroundAndLabelledPixels());
    }

}
