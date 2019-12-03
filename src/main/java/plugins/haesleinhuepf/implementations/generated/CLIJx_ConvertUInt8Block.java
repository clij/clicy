package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clij.macro.modules.ConvertUInt8;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_ConvertUInt8Block extends AbstractCLIJxBlock {
   
    /**
     * Convert the input image to a unsigned integer image with 8 bits per pixel.
     * Pixel values are copied as they are. Use multiplyImageWithScalar in order to scalepixel values when reducing bit-depth to prevent cutting-off intensity ranges.
     * The target image should not exist with a different type before this 
     * method is called.
     */
    public CLIJx_ConvertUInt8Block() {
        super(new ConvertUInt8());
    }

}