package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MeanSquaredError;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MeanSquaredErrorBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the mean squared error (MSE) between two images. 
     * 
     * The MSE will be stored in a new row of ImageJs
     * Results table in the column 'MSE'.
     */
    public CLIJ2_MeanSquaredErrorBlock() {
        super(new MeanSquaredError());
    }

}
