package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Absolute;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_AbsoluteBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes the absolute value of every individual pixel x in a given image.
     * 
     * <pre>f(x) = |x| </pre>
     * 
     * Parameters
     * ----------
     * source : Image
     *     The input image to be processed.
     * destination : Image
     *     The output image where results are written into.
     * 
     */
    public CLIJ2_AbsoluteBlock() {
        super(new Absolute());
    }

}
