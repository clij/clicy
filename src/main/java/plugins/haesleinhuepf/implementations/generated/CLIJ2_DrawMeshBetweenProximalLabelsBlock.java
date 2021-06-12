package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DrawMeshBetweenProximalLabels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DrawMeshBetweenProximalLabelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Starting from a label map, draw lines between labels that are closer than a given distance resulting in a mesh.
     * 
     * The end points of the lines correspond to the centroids of the labels.
     */
    public CLIJ2_DrawMeshBetweenProximalLabelsBlock() {
        super(new DrawMeshBetweenProximalLabels());
    }

}
