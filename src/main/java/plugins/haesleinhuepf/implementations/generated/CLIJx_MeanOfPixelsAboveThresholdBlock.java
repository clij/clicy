package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.MeanOfPixelsAboveThreshold;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_MeanOfPixelsAboveThresholdBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines the mean intensity in an image, but only in pixels which are above a given threshold.
     */
    public CLIJx_MeanOfPixelsAboveThresholdBlock() {
        super(new MeanOfPixelsAboveThreshold());
    }

}
