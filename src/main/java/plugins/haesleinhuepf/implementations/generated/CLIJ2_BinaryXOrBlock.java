package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.BinaryXOr;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_BinaryXOrBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes a binary image (containing pixel values 0 and 1) from two images X and Y by connecting pairs of
     * pixels x and y with the binary operators AND &, OR | and NOT ! implementing the XOR operator.
     * 
     * All pixel values except 0 in the input images are interpreted as 1.
     * 
     * <pre>f(x, y) = (x & !y) | (!x & y)</pre>
     */
    public CLIJ2_BinaryXOrBlock() {
        super(new BinaryXOr());
    }

}
