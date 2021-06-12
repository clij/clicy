package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GammaCorrection;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GammaCorrectionBlock extends AbstractCLIJ2Block {
   
    /**
     * Applies a gamma correction to an image.
     * 
     * Therefore, all pixels x of the Image X are normalized and the power to gamma g is computed, before normlization is reversed (^ is the power operator):f(x) = (x / max(X)) ^ gamma * max(X)
     */
    public CLIJ2_GammaCorrectionBlock() {
        super(new GammaCorrection());
    }

}
