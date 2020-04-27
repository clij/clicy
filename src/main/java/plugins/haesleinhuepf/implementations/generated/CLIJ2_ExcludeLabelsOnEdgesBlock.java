package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ExcludeLabelsOnEdges;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ExcludeLabelsOnEdgesBlock extends AbstractCLIJ2Block {
   
    /**
     * Removes all labels from a label map which touch the edges of the image (in X, Y and Z if the image is 3D). 
     * 
     * Remaining label elements are renumbered afterwards.
     */
    public CLIJ2_ExcludeLabelsOnEdgesBlock() {
        super(new ExcludeLabelsOnEdges());
    }

}
