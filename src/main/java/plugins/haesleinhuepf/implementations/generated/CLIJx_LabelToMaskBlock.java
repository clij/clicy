package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.LabelToMask;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_LabelToMaskBlock extends AbstractCLIJxBlock {
   
    /**
     * Masks a single label in a label map: Sets all pixels in the target image to 1, where the given label index was present in the label map.
     */
    public CLIJx_LabelToMaskBlock() {
        super(new LabelToMask());
    }

}
