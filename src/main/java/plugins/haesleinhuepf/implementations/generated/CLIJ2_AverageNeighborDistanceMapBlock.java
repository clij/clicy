package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.AverageNeighborDistanceMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_AverageNeighborDistanceMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label map, determines which labels touch and replaces every label with the average distance to their neighboring labels.
     * 
     * To determine the distances, the centroid of the labels is determined internally.
     */
    public CLIJ2_AverageNeighborDistanceMapBlock() {
        super(new AverageNeighborDistanceMap());
    }

}
