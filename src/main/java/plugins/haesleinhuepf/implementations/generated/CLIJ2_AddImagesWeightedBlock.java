package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.AddImagesWeighted;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_AddImagesWeightedBlock extends AbstractCLIJ2Block {
   
    /**
     * Calculates the sum of pairs of pixels x and y from images X and Y weighted with factors a and b.
     * 
     * <pre>f(x, y, a, b) = x * a + y * b</pre>
     * 
     * Parameters
     * ----------
     * summand1 : Image
     *     The first input image to added.
     * summand2 : Image
     *     The second image to be added.
     * destination : Image
     *     The output image where results are written into.
     * factor1 : float
     *     The constant number which will be multiplied with each pixel of summand1 before adding it.
     * factor2 : float
     *     The constant number which will be multiplied with each pixel of summand2 before adding it.
     * 
     */
    public CLIJ2_AddImagesWeightedBlock() {
        super(new AddImagesWeighted());
    }

}
