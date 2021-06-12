package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.BinaryIntersection;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_BinaryIntersectionBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes a binary image (containing pixel values 0 and 1) from two images X and Y by connecting pairs of
     * pixels x and y with the binary intersection operator &.
     * All pixel values except 0 in the input images are interpreted as 1.
     * 
     * <pre>f(x, y) = x & y</pre>
     * 
     * Parameters
     * ----------
     * operand1 : Image
     *     The first binary input image to be processed.
     * operand2 : Image
     *     The second binary input image to be processed.
     * destination : Image
     *     The output image where results are written into.
     * 
     */
    public CLIJ2_BinaryIntersectionBlock() {
        super(new BinaryIntersection());
    }

}
