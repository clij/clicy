package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MultiplyImages;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MultiplyImagesBlock extends AbstractCLIJ2Block {
   
    /**
     * Multiplies all pairs of pixel values x and y from two images X and Y.
     * 
     * <pre>f(x, y) = x * y</pre>
     * 
     * Parameters
     * ----------
     * factor1 : Image
     *     The first input image to be multiplied.
     * factor2 : Image
     *     The second image to be multiplied.
     * destination : Image
     *     The output image where results are written into.
     * 
     */
    public CLIJ2_MultiplyImagesBlock() {
        super(new MultiplyImages());
    }

}
