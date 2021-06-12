package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.AverageDistanceOfNClosestNeighborsMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_AverageDistanceOfNClosestNeighborsMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label map, determines distances between all centroids and replaces every label with the average distance to the n closest neighboring labels.
     */
    public CLIJ2_AverageDistanceOfNClosestNeighborsMapBlock() {
        super(new AverageDistanceOfNClosestNeighborsMap());
    }

}
