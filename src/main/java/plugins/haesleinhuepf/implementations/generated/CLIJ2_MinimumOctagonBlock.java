package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MinimumOctagon;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MinimumOctagonBlock extends AbstractCLIJ2Block {
   
    /**
     * Applies a minimum filter with kernel size 3x3 n times to an image iteratively. 
     * 
     * Odd iterations are done with box neighborhood, even iterations with a diamond. Thus, with n > 2, the filter shape is an octagon. The given number of iterations makes the filter result very similar to minimum sphere. Approximately:radius = iterations - 2
     */
    public CLIJ2_MinimumOctagonBlock() {
        super(new MinimumOctagon());
    }

}
