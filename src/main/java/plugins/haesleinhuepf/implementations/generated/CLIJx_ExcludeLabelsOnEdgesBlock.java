package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.ExcludeLabelsOnEdges;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_ExcludeLabelsOnEdgesBlock extends AbstractCLIJxBlock {
   
    /**
     * Removes all labels from a label map which touch the edges of the image (in X, Y and Z if the image is 3D). Remaining label elements are renumbered afterwards.
     */
    public CLIJx_ExcludeLabelsOnEdgesBlock() {
        super(new ExcludeLabelsOnEdges());
    }

}
