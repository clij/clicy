package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clij.macro.modules.SumOfAllPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_SumOfAllPixelsBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines the sum of all pixels in a given image. It will be stored in a new row of ImageJs
     * Results table in the column 'Sum'.
     */
    public CLIJx_SumOfAllPixelsBlock() {
        super(new SumOfAllPixels());
    }

}
