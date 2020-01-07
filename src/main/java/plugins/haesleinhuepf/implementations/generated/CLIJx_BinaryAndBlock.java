package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.BinaryAnd;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_BinaryAndBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes a binary image (containing pixel values 0 and 1) from two images X and Y by connecting pairs of
     * pixels x and y with the binary AND operator &.
     * All pixel values except 0 in the input images are interpreted as 1.
     * 
     * <pre>f(x, y) = x & y</pre>
     */
    public CLIJx_BinaryAndBlock() {
        super(new BinaryAnd());
    }

}
