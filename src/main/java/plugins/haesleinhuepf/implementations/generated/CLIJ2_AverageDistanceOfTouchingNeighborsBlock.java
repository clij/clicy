package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.AverageDistanceOfTouchingNeighbors;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_AverageDistanceOfTouchingNeighborsBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a touch matrix and a distance matrix to determine the average distance of touching neighbors 
     *  for every object.
     * 
     * Parameters
     * ----------
     * distance_matrix : Image
     *     The a distance matrix to be processed.
     * touch_matrix : Image
     *     The binary touch matrix describing which distances should be taken into account.
     * distance_list_destination : Image
     *     A vector image with the same width as the distance matrix and height=1, depth=1.
     *     Determined average distances will be written into this vector.
     * 
     */
    public CLIJ2_AverageDistanceOfTouchingNeighborsBlock() {
        super(new AverageDistanceOfTouchingNeighbors());
    }

}
