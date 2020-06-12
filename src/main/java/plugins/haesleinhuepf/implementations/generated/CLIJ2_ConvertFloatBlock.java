package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ConvertFloat;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ConvertFloatBlock extends AbstractCLIJ2Block {
   
    /**
     * Convert the input image to a float image with 32 bits per pixel.
     * 
     * The target image should not exist with a different type before this 
     * method is called.
     */
    public CLIJ2_ConvertFloatBlock() {
        super(new ConvertFloat());
    }

}
