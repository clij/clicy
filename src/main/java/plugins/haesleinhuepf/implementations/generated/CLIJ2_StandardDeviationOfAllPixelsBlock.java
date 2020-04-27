package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.StandardDeviationOfAllPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_StandardDeviationOfAllPixelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the standard deviation of all pixels in an image. 
     * 
     * The value will be stored in a new row of ImageJs
     * Results table in the column 'Standard_deviation'.
     */
    public CLIJ2_StandardDeviationOfAllPixelsBlock() {
        super(new StandardDeviationOfAllPixels());
    }

}
