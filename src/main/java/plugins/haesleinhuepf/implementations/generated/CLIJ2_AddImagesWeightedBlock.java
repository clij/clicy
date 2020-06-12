package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.AddImagesWeighted;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_AddImagesWeightedBlock extends AbstractCLIJ2Block {
   
    /**
     * Calculates the sum of pairs of pixels x and y from images X and Y weighted with factors a and b.
     * 
     * <pre>f(x, y, a, b) = x * a + y * b</pre>
     */
    public CLIJ2_AddImagesWeightedBlock() {
        super(new AddImagesWeighted());
    }

}
