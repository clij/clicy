package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.TouchingNeighborDistanceRangeRatioMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_TouchingNeighborDistanceRangeRatioMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label map, determines which labels touch and replaces every label with the distance range ratio (maximum distance divided by minimum distance) to their neighboring labels.
     * 
     * To determine the distances, the centroids of the labels is determined internally.
     */
    public CLIJ2_TouchingNeighborDistanceRangeRatioMapBlock() {
        super(new TouchingNeighborDistanceRangeRatioMap());
    }

}
