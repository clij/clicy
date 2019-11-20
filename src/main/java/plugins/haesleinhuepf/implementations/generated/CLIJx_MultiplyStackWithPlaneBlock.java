package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clij.macro.modules.MultiplyStackWithPlane;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_MultiplyStackWithPlaneBlock extends AbstractCLIJxBlock {
   
    /**
     * Multiplies all pairs of pixel values x and y from an image stack X and a 2D image Y. x and y are at 
     * the same spatial position within a plane.
     * 
     * <pre>f(x, y) = x * y</pre>
     */
    public CLIJx_MultiplyStackWithPlaneBlock() {
        super(new MultiplyStackWithPlane());
    }

}
