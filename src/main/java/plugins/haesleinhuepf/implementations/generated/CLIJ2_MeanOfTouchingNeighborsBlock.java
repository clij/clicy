package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MeanOfTouchingNeighbors;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MeanOfTouchingNeighborsBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a touch matrix and a vector of values to determine the mean value among touching neighbors for every object. 
     * 
     * Parameters
     * ----------
     * values : Image
     *     A vector of values corresponding to the labels of which the mean average should be determined.
     * touch_matrix : Image
     *     A touch_matrix specifying which labels are taken into account for neighborhood relationships.
     * mean_values_destination : Image
     *     A the resulting vector of mean average values in the neighborhood.
     * 
     */
    public CLIJ2_MeanOfTouchingNeighborsBlock() {
        super(new MeanOfTouchingNeighbors());
    }

}
