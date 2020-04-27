package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GradientZ;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GradientZBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes the gradient of gray values along Z. 
     * 
     * Assuming a, b and c are three adjacent
     *  pixels in Z direction. In the target image will be saved as: <pre>b' = c - a;</pre>
     */
    public CLIJ2_GradientZBlock() {
        super(new GradientZ());
    }

}
