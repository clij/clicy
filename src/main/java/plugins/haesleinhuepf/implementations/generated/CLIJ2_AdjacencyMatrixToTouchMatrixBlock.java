package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.AdjacencyMatrixToTouchMatrix;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_AdjacencyMatrixToTouchMatrixBlock extends AbstractCLIJ2Block {
   
    /**
     * Converts a adjacency matrix in a touch matrix.
     * 
     * An adjacency matrix is symmetric while a touch matrix is typically not.
     * 
     * Parameters
     * ----------
     * adjacency_matrix : Image
     *     The input adjacency matrix to be read from.
     * touch_matrix : Image
     *     The output touch matrix to be written into.
     * 
     */
    public CLIJ2_AdjacencyMatrixToTouchMatrixBlock() {
        super(new AdjacencyMatrixToTouchMatrix());
    }

}
