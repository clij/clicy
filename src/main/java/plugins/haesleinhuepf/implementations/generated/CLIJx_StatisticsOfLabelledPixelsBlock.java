package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.StatisticsOfLabelledPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_StatisticsOfLabelledPixelsBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines bounding box, area (in pixels/voxels), min, max and mean intensity  of a labelled object in a label map and corresponding pixels in the original image.Instead of a label map, you can also use a binary image as a binary image is a label map with just one label.
     */
    public CLIJx_StatisticsOfLabelledPixelsBlock() {
        super(new StatisticsOfLabelledPixels());
    }

}
