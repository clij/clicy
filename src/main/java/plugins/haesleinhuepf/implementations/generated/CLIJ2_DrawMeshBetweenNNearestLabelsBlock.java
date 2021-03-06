package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DrawMeshBetweenNNearestLabels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DrawMeshBetweenNNearestLabelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Starting from a label map, draw lines between n closest labels for each label resulting in a mesh.
     * 
     * The end points of the lines correspond to the centroids of the labels. 
     */
    public CLIJ2_DrawMeshBetweenNNearestLabelsBlock() {
        super(new DrawMeshBetweenNNearestLabels());
    }

}
