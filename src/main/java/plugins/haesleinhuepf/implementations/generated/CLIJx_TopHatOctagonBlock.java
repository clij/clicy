package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.TopHatOctagon;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_TopHatOctagonBlock extends AbstractCLIJxBlock {
   
    /**
     * Applies a minimum filter with kernel size 3x3 n times to an image iteratively. Odd iterations are done with box neighborhood, even iterations with a diamond. Thus, with n > 2, the filter shape is an octagon. The given number of iterations - 2 makes the filter result very similar to minimum sphere.
     */
    public CLIJx_TopHatOctagonBlock() {
        super(new TopHatOctagon());
    }

}
