package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GetAutomaticThreshold;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GetAutomaticThresholdBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines a threshold according to a given method and saves it to the threshold_value variable.
     * 
     * The automatic thresholder utilizes the threshold methods from ImageJ on a histogram determined on 
     * the GPU to determine a threshold value as similar as possible to ImageJ 'Apply Threshold' method. 
     * 
     * Enter one 
     * of these methods in the method text field:
     * [Default, Huang, Intermodes, IsoData, IJ_IsoData, Li, MaxEntropy, Mean, MinError, Minimum, Moments, Otsu, Percentile, RenyiEntropy, Shanbhag, Triangle, Yen]
     */
    public CLIJ2_GetAutomaticThresholdBlock() {
        super(new GetAutomaticThreshold());
    }

}
