package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ReduceStack;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ReduceStackBlock extends AbstractCLIJ2Block {
   
    /**
     * Reduces the number of slices in a stack by a given factor.
     * With the offset you have control which slices stay: 
     * * With factor 3 and offset 0, slices 0, 3, 6,... are kept. * With factor 4 and offset 1, slices 1, 5, 9,... are kept.
     */
    public CLIJ2_ReduceStackBlock() {
        super(new ReduceStack());
    }

}
