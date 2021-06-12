package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.PointIndexListToTouchMatrix;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_PointIndexListToTouchMatrixBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a list of point indices to generate a touch matrix (a.k.a. adjacency graph matrix) out of it. 
     * 
     * The list hasa dimensionality of m*n for the points 1... m (0 a.k.a. background is not in this list). In the n rows, there are
     * indices to points which should be connected.
     * 
     * Parameters
     * ----------
     * indexlist : Image
     * matrix_destination : Image
     */
    public CLIJ2_PointIndexListToTouchMatrixBlock() {
        super(new PointIndexListToTouchMatrix());
    }

}
