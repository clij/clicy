package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.UndefinedToZero;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_UndefinedToZeroBlock extends AbstractCLIJ2Block {
   
    /**
     * Copies all pixels instead those which are not a number (NaN) or infinity (inf), which are replaced by 0.
     */
    public CLIJ2_UndefinedToZeroBlock() {
        super(new UndefinedToZero());
    }

}
