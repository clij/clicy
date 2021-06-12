package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.BinarySubtract;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_BinarySubtractBlock extends AbstractCLIJ2Block {
   
    /**
     * Subtracts one binary image from another.
     * 
     * Parameters
     * ----------
     * minuend : Image
     *     The first binary input image to be processed.
     * suubtrahend : Image
     *     The second binary input image to be subtracted from the first.
     * destination : Image
     *     The output image where results are written into.
     * 
     */
    public CLIJ2_BinarySubtractBlock() {
        super(new BinarySubtract());
    }

}
