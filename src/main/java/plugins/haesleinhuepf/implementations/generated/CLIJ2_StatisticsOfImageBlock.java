package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.StatisticsOfImage;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_StatisticsOfImageBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines image size (bounding box), area (in pixels/voxels), min, max and mean intensity 
     *  of all pixels in the original image.
     * 
     * This method is executed on the CPU and not on the GPU/OpenCL device.
     */
    public CLIJ2_StatisticsOfImageBlock() {
        super(new StatisticsOfImage());
    }

}
