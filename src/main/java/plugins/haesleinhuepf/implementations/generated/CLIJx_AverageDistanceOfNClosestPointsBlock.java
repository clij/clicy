package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.matrix.AverageDistanceOfNClosestPoints;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_AverageDistanceOfNClosestPointsBlock extends AbstractCLIJxBlock {
   
    /**
     * Determine the n point indices with shortest distance for all points in a distance matrix.
     * This corresponds to the n row indices with minimum values for each column of the distance matrix.
     */
    public CLIJx_AverageDistanceOfNClosestPointsBlock() {
        super(new AverageDistanceOfNClosestPoints());
    }

}
