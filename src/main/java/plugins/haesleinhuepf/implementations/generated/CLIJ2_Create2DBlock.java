package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Create2D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_Create2DBlock extends AbstractCLIJ2Block {
   
    /**
     * Allocated memory for a new 2D image in the GPU memory.
     * 
     * Parameters
     * ----------
     * destination : Image
     *     The new image will be stored in this variable.
     * width : Number
     *     The width of the new image.
     * height : Number
     *     The height of the new image.
     * bit-depth : Number
     *     The bit-depth of the new image. Can be either 8, 16 or 32, to create an image of unsigned-byte, unsigned-short or float type.
     * 
     */
    public CLIJ2_Create2DBlock() {
        super(new Create2D());
    }

}
