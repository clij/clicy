package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MultiplyImageAndScalar;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MultiplyImageAndScalarBlock extends AbstractCLIJ2Block {
   
    /**
     * Multiplies all pixels value x in a given image X with a constant scalar s.
     * 
     * <pre>f(x, s) = x * s</pre>
     * 
     * Parameters
     * ----------
     * source : Image
     *     The input image to be multiplied with a constant.
     * destination : Image
     *     The output image where results are written into.
     * scalar : float
     *     The number with which every pixel will be multiplied with.
     * 
     */
    public CLIJ2_MultiplyImageAndScalarBlock() {
        super(new MultiplyImageAndScalar());
    }

}
