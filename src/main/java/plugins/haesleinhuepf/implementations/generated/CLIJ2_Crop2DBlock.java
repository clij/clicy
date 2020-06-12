package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Crop2D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_Crop2DBlock extends AbstractCLIJ2Block {
   
    /**
     * Crops a given rectangle out of a given image. 
     * 
     * Note: If the destination image pre-exists already, it will be overwritten and keep it's dimensions.
     */
    public CLIJ2_Crop2DBlock() {
        super(new Crop2D());
    }

}
