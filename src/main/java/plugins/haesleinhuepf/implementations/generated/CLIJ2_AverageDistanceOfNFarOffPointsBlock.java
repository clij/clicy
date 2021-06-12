package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.AverageDistanceOfNFarOffPoints;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_AverageDistanceOfNFarOffPointsBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the average of the n far off (most distant) points for every point in a distance matrix.
     * 
     * This corresponds to the average of the n maximum values (rows) for each column of the distance matrix.
     * 
     * Parameters
     * ----------
     * distance_matrix : Image
     *     The a distance matrix to be processed.
     * distance_list_destination : Image
     *     A vector image with the same width as the distance matrix and height=1, depth=1.
     *     Determined average distances will be written into this vector.
     * n_far_off_points_to_find : Number
     *     Number of largest distances which should be averaged.
     * 
     */
    public CLIJ2_AverageDistanceOfNFarOffPointsBlock() {
        super(new AverageDistanceOfNFarOffPoints());
    }

}
