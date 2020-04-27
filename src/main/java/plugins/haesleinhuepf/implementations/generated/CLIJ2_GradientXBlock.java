package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GradientX;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GradientXBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes the gradient of gray values along X. 
     * 
     * Assuming a, b and c are three adjacent
     *  pixels in X direction. In the target image will be saved as: <pre>b' = c - a;</pre>
     */
    public CLIJ2_GradientXBlock() {
        super(new GradientX());
    }

}
