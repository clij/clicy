package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GenerateProximalNeighborsMatrix;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GenerateProximalNeighborsMatrixBlock extends AbstractCLIJ2Block {
   
    /**
     * Produces a touch-matrix where the neighbors within a given distance range are marked as touching neighbors.
     * 
     * Takes a distance matrix (e.g. derived from a pointlist of centroids) and marks for every column the neighbors whose
     * distance lie within a given distance range (>= min and <= max). 
     * The resulting matrix can be use as if it was a touch-matrix (a.k.a. adjacency graph matrix). 
     * 
     * Parameters
     * ----------
     * distance_marix : Image
     * touch_matrix_destination : Image
     * min_distance : float, optional
     *     default : 0
     * max_distance : float, optional
     *     default: 10 
     * 
     * Returns
     * -------
     * touch_matrix_destination
     */
    public CLIJ2_GenerateProximalNeighborsMatrixBlock() {
        super(new GenerateProximalNeighborsMatrix());
    }

}
