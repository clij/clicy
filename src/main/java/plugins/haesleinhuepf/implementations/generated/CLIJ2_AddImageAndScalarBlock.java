package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.AddImageAndScalar;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_AddImageAndScalarBlock extends AbstractCLIJ2Block {
   
    /**
     * Adds a scalar value s to all pixels x of a given image X.
     * 
     * <pre>f(x, s) = x + s</pre>
     * 
     * Parameters
     * ----------
     * source : Image
     *     The input image where scalare should be added.
     * destination : Image
     *     The output image where results are written into.
     * scalar : float
     *     The constant number which will be added to all pixels.
     * 
     */
    public CLIJ2_AddImageAndScalarBlock() {
        super(new AddImageAndScalar());
    }

}
