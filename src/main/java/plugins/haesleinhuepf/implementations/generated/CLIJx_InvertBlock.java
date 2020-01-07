package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.Invert;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_InvertBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes the negative value of all pixels in a given image. It is recommended to convert images to 
     * 32-bit float before applying this operation.
     * 
     * <pre>f(x) = - x</pre>
     * 
     * For binary images, use binaryNot.
     */
    public CLIJx_InvertBlock() {
        super(new Invert());
    }

}
