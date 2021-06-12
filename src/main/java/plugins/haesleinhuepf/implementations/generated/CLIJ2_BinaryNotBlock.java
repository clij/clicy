package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.BinaryNot;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_BinaryNotBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes a binary image (containing pixel values 0 and 1) from an image X by negating its pixel values
     * x using the binary NOT operator !
     * 
     * All pixel values except 0 in the input image are interpreted as 1.
     * 
     * <pre>f(x) = !x</pre>
     * 
     * Parameters
     * ----------
     * source : Image
     *     The binary input image to be inverted.
     * destination : Image
     *     The output image where results are written into.
     * 
     */
    public CLIJ2_BinaryNotBlock() {
        super(new BinaryNot());
    }

}
