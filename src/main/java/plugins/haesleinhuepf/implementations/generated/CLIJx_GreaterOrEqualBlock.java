package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedmath.GreaterOrEqual;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_GreaterOrEqualBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines if two images A and B greater or equal pixel wise.
     * 
     * f(a, b) = 1 if a >= b; 0 otherwise. 
     */
    public CLIJx_GreaterOrEqualBlock() {
        super(new GreaterOrEqual());
    }

}
