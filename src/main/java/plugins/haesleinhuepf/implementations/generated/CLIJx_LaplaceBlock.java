package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.Laplace;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_LaplaceBlock extends AbstractCLIJxBlock {
   
    /**
     * Apply the Laplace operator (Diamond neighborhood) to an image.
     */
    public CLIJx_LaplaceBlock() {
        super(new Laplace());
    }

}
