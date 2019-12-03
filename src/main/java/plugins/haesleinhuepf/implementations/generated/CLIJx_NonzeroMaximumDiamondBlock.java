package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.NonzeroMaximumDiamond;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_NonzeroMaximumDiamondBlock extends AbstractCLIJxBlock {
   
    /**
     * Apply a maximum-sphere filter to the input image. The radius is fixed to 1 and pixels with value 0 are ignored.
     */
    public CLIJx_NonzeroMaximumDiamondBlock() {
        super(new NonzeroMaximumDiamond());
    }

}