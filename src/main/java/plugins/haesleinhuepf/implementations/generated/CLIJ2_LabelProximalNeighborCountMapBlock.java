package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.LabelProximalNeighborCountMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_LabelProximalNeighborCountMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes two label maps, and counts for every label in label map 1 how many labels are in a given distance range to it in label map 2.
     * 
     * Distances are computed from the centroids of the labels. The resulting map is generated from the label map 1 by replacing the labels with the respective count.
     */
    public CLIJ2_LabelProximalNeighborCountMapBlock() {
        super(new LabelProximalNeighborCountMap());
    }

}
