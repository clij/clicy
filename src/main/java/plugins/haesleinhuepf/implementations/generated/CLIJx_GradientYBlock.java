package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.GradientY;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_GradientYBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes the gradient of gray values along Y. Assuming a, b and c are three adjacent
     *  pixels in Y direction. In the target image will be saved as: <pre>b' = c - a;</pre>
     */
    public CLIJx_GradientYBlock() {
        super(new GradientY());
    }

}
