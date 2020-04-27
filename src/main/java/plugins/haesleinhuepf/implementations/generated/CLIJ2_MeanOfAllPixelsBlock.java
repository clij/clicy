package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij.macro.modules.MeanOfAllPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MeanOfAllPixelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the mean average of all pixels in a given image. It will be stored in a new row of ImageJs
     * Results table in the column 'Mean'.
     */
    public CLIJ2_MeanOfAllPixelsBlock() {
        super(new MeanOfAllPixels());
    }

}
