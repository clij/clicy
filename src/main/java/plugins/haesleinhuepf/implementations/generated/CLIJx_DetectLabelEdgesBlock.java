package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.DetectLabelEdges;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_DetectLabelEdgesBlock extends AbstractCLIJxBlock {
   
    /**
     * Takes a labelmap and returns an image where all pixels on label edges are set to 1 and all other pixels to 0.
     */
    public CLIJx_DetectLabelEdgesBlock() {
        super(new DetectLabelEdges());
    }

}
