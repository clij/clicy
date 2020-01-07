package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.ShowGlasbeyOnGrey;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_ShowGlasbeyOnGreyBlock extends AbstractCLIJxBlock {
   
    /**
     * Visualises two 2D images as one RGB image. The first channel is shown in grey, the second with glasbey LUT.
     */
    public CLIJx_ShowGlasbeyOnGreyBlock() {
        super(new ShowGlasbeyOnGrey());
    }

}
