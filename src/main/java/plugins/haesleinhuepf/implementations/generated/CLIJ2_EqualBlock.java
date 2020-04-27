package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Equal;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_EqualBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines if two images A and B equal pixel wise. 
     * 
     * <pre>f(a, b) = 1 if a == b; 0 otherwise.</pre> 
     */
    public CLIJ2_EqualBlock() {
        super(new Equal());
    }

}
