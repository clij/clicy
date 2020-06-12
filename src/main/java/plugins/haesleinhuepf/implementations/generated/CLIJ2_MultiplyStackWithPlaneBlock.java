package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MultiplyStackWithPlane;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MultiplyStackWithPlaneBlock extends AbstractCLIJ2Block {
   
    /**
     * Multiplies all pairs of pixel values x and y from an image stack X and a 2D image Y. 
     * 
     * x and y are at 
     * the same spatial position within a plane.
     * 
     * <pre>f(x, y) = x * y</pre>
     */
    public CLIJ2_MultiplyStackWithPlaneBlock() {
        super(new MultiplyStackWithPlane());
    }

}
