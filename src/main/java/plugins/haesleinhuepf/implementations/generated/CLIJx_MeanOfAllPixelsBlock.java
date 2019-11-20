package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clij.macro.modules.MeanOfAllPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_MeanOfAllPixelsBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines the mean average of all pixels in a given image. It will be stored in a new row of ImageJs
     * Results table in the column 'Mean'.
     */
    public CLIJx_MeanOfAllPixelsBlock() {
        super(new MeanOfAllPixels());
    }

}
