package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.BinaryNot;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_BinaryNotBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes a binary image (containing pixel values 0 and 1) from an image X by negating its pixel values
     * x using the binary NOT operator !
     * All pixel values except 0 in the input image are interpreted as 1.
     * 
     * <pre>f(x) = !x</pre>
     */
    public CLIJx_BinaryNotBlock() {
        super(new BinaryNot());
    }

}
