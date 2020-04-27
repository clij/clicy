package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij.macro.modules.MinimumImageAndScalar;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MinimumImageAndScalarBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes the maximum of a constant scalar s and each pixel value x in a given image X.
     * 
     * <pre>f(x, s) = min(x, s)</pre>
     */
    public CLIJ2_MinimumImageAndScalarBlock() {
        super(new MinimumImageAndScalar());
    }

}
