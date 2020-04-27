package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.SetNonZeroPixelsToPixelIndex;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_SetNonZeroPixelsToPixelIndexBlock extends AbstractCLIJ2Block {
   
    /**
     * Sets all pixels in an image which are not zero to the index of the pixel. 
     * 
     * This can be used for Connected Components Analysis.
     */
    public CLIJ2_SetNonZeroPixelsToPixelIndexBlock() {
        super(new SetNonZeroPixelsToPixelIndex());
    }

}
