package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.NonzeroMinimumBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_NonzeroMinimumBoxBlock extends AbstractCLIJxBlock {
   
    /**
     * Apply a minimum-sphere filter to the input image. The radius is fixed to 1 and pixels with value 0 are ignored.
     */
    public CLIJx_NonzeroMinimumBoxBlock() {
        super(new NonzeroMinimumBox());
    }

}
