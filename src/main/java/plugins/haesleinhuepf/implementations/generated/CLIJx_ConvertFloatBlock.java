package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clij.macro.modules.ConvertFloat;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_ConvertFloatBlock extends AbstractCLIJxBlock {
   
    /**
     * Convert the input image to a float image with 32 bits per pixel.
     * The target image should not exist with a different type before this 
     * method is called.
     */
    public CLIJx_ConvertFloatBlock() {
        super(new ConvertFloat());
    }

}
