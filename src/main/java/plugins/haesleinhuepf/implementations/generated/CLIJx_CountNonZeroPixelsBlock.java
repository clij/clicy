package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.CountNonZeroPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_CountNonZeroPixelsBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines the number of all pixels in a given image which are not equal to 0. It will be stored in a new row of ImageJs
     * Results table in the column 'CountNonZero'.
     */
    public CLIJx_CountNonZeroPixelsBlock() {
        super(new CountNonZeroPixels());
    }

}
