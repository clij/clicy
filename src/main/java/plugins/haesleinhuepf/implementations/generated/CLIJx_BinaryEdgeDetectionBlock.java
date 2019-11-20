package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.BinaryEdgeDetection;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_BinaryEdgeDetectionBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines pixels/voxels which are on the surface of a binary objects and sets only them to 1 in the destination image.
     */
    public CLIJx_BinaryEdgeDetectionBlock() {
        super(new BinaryEdgeDetection());
    }

}
