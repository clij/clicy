package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.EuclideanDistanceFromLabelCentroidMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_EuclideanDistanceFromLabelCentroidMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label map, determines the centroids of all labels and writes the distance of all labelled pixels to their centroid in the result image.
     * Background pixels stay zero.
     */
    public CLIJ2_EuclideanDistanceFromLabelCentroidMapBlock() {
        super(new EuclideanDistanceFromLabelCentroidMap());
    }

}
