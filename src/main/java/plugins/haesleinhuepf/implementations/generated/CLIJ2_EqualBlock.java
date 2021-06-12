package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Equal;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_EqualBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines if two images A and B equal pixel wise.
     * 
     * <pre>f(a, b) = 1 if a == b; 0 otherwise.</pre>
     * 
     * Parameters
     * ----------
     * source1 : Image
     *     The first image to be compared with.
     * source2 : Image
     *     The second image to be compared with the first.
     * destination : Image
     *     The resulting binary image where pixels will be 1 only if source1 and source2 equal in the given pixel.
     * 
     */
    public CLIJ2_EqualBlock() {
        super(new Equal());
    }

}
