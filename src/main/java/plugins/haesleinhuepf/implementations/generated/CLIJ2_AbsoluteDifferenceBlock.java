package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.AbsoluteDifference;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_AbsoluteDifferenceBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the absolute difference pixel by pixel between two images.
     * 
     * <pre>f(x, y) = |x - y| </pre>
     * 
     * Parameters
     * ----------
     * source1 : Image
     *     The input image to be subtracted from.
     * source2 : Image
     *     The input image which is subtracted.
     * destination : Image
     *     The output image  where results are written into.
     * 
     */
    public CLIJ2_AbsoluteDifferenceBlock() {
        super(new AbsoluteDifference());
    }

}
