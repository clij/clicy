package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ThresholdIntermodes;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ThresholdIntermodesBlock extends AbstractCLIJ2Block {
   
    /**
     * The automatic thresholder utilizes the Intermodes threshold method implemented in ImageJ using a histogram determined on 
     * the GPU to create binary images as similar as possible to ImageJ 'Apply Threshold' method.
     */
    public CLIJ2_ThresholdIntermodesBlock() {
        super(new ThresholdIntermodes());
    }

}
