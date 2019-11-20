package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.registration.TranslationTimelapseRegistration;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_TranslationTimelapseRegistrationBlock extends AbstractCLIJxBlock {
   
    /**
     * Applies 2D translation registration to every pair of t, t+1 slices of a 2D+t image stack.
     */
    public CLIJx_TranslationTimelapseRegistrationBlock() {
        super(new TranslationTimelapseRegistration());
    }

}
