package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DrawDistanceMeshBetweenTouchingLabels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DrawDistanceMeshBetweenTouchingLabelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Starting from a label map, draw lines between touching neighbors resulting in a mesh.
     * 
     * The end points of the lines correspond to the centroids of the labels. The intensity of the lines 
     * corresponds to the distance between these labels (in pixels or voxels).
     */
    public CLIJ2_DrawDistanceMeshBetweenTouchingLabelsBlock() {
        super(new DrawDistanceMeshBetweenTouchingLabels());
    }

}
