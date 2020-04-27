package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MeanOfPixelsAboveThreshold;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MeanOfPixelsAboveThresholdBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the mean intensity in a threshleded image. 
     * 
     * But only in pixels which are above a given threshold.
     */
    public CLIJ2_MeanOfPixelsAboveThresholdBlock() {
        super(new MeanOfPixelsAboveThreshold());
    }

}
