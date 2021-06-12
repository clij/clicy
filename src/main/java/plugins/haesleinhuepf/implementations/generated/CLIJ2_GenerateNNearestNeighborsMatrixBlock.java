package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GenerateNNearestNeighborsMatrix;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GenerateNNearestNeighborsMatrixBlock extends AbstractCLIJ2Block {
   
    /**
     * Produces a touch-matrix where the n nearest neighbors are marked as touching neighbors. 
     * 
     * Takes a distance matrix (e.g. derived from a pointlist of centroids) and marks for every column the n smallest
     * distances as neighbors. The resulting matrix can be use as if it was a touch-matrix (a.k.a. adjacency graph matrix). 
     * 
     * Inspired by a similar implementation in imglib2 [1]
     * 
     * Note: The implementation is limited to square matrices.
     * 
     * Parameters
     * ----------
     * distance_marix : Image
     * touch_matrix_destination : Image
     * n : int
     *    number of neighbors
     *    
     * References
     * ----------
     * [1] https://github.com/imglib/imglib2/blob/master/src/main/java/net/imglib2/interpolation/neighborsearch/InverseDistanceWeightingInterpolator.java
     * 
     */
    public CLIJ2_GenerateNNearestNeighborsMatrixBlock() {
        super(new GenerateNNearestNeighborsMatrix());
    }

}
