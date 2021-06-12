package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.AverageDistanceOfNClosestPoints;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_AverageDistanceOfNClosestPointsBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the average of the n closest points for every point in a distance matrix.
     * 
     * This corresponds to the average of the n minimum values (rows) for each column of the distance matrix.
     * 
     * Parameters
     * ----------
     * distance_matrix : Image
     *     The a distance matrix to be processed.
     * distance_list_destination : Image
     *     A vector image with the same width as the distance matrix and height=1, depth=1.
     *     Determined average distances will be written into this vector.
     * n_closest_points_to_find : Number
     *     Number of smallest distances which should be averaged.
     * 
     */
    public CLIJ2_AverageDistanceOfNClosestPointsBlock() {
        super(new AverageDistanceOfNClosestPoints());
    }

}
