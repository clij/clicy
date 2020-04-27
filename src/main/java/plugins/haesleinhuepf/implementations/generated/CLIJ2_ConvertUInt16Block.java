package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ConvertUInt16;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ConvertUInt16Block extends AbstractCLIJ2Block {
   
    /**
     * Convert the input image to a unsigned integer image with 16 bits per pixel.
     * 
     * Pixel values are copied as they are. Use multiplyImageWithScalar in order to scalepixel values when reducing bit-depth to prevent cutting-off intensity ranges.
     * The target image should not exist with a different type before this 
     * method is called.
     */
    public CLIJ2_ConvertUInt16Block() {
        super(new ConvertUInt16());
    }

}
