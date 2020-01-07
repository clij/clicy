package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.LocalThreshold;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_LocalThresholdBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes a binary image with pixel values 0 and 1 depending on if a pixel value x in image X 
     * was above of equal to the pixel value m in mask image M.
     * 
     * <pre>f(x) = (1 if (x >=  m)); (0 otherwise)</pre>
     */
    public CLIJx_LocalThresholdBlock() {
        super(new LocalThreshold());
    }

}
