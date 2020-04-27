package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.SmallerOrEqual;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_SmallerOrEqualBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines if two images A and B smaller or equal pixel wise.
     * 
     * f(a, b) = 1 if a <= b; 0 otherwise. 
     */
    public CLIJ2_SmallerOrEqualBlock() {
        super(new SmallerOrEqual());
    }

}
