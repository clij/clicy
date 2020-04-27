package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.CountNonZeroPixels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_CountNonZeroPixelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the number of all pixels in a given image which are not equal to 0. 
     * 
     * It will be stored in a new row of ImageJs
     * Results table in the column 'CountNonZero'.
     */
    public CLIJ2_CountNonZeroPixelsBlock() {
        super(new CountNonZeroPixels());
    }

}
