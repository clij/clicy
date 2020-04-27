package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MatrixEqual;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MatrixEqualBlock extends AbstractCLIJ2Block {
   
    /**
     * Checks if all elements of a matrix are different by less than or equal to a given tolerance. 
     * 
     * The result will be put in the results table in column "MatrixEqual" as 1 if yes and 0 otherwise.
     */
    public CLIJ2_MatrixEqualBlock() {
        super(new MatrixEqual());
    }

}
