package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.GradientZ;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_GradientZBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes the gradient of gray values along Z. Assuming a, b and c are three adjacent
     *  pixels in Z direction. In the target image will be saved as: <pre>b' = c - a;</pre>
     */
    public CLIJx_GradientZBlock() {
        super(new GradientZ());
    }

}
