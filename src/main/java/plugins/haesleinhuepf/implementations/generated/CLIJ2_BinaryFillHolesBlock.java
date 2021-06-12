package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.BinaryFillHoles;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_BinaryFillHolesBlock extends AbstractCLIJ2Block {
   
    /**
     * Fills holes (pixels with value 0 surrounded by pixels with value 1) in a binary image.
     * 
     * Note: This function is known to perform slowly on large images. Consider using the extension 
     * CLIJx_morphoLibJFillHoles(input, destination) instead.
     * Read more: http://clij.github.io/assistant/installation#extensions
     * 
     * Parameters
     * ----------
     * source : Image
     *     The binary input image where holes will be filled.
     * destination : Image
     *     The output image where true pixels will be 1.
     * 
     */
    public CLIJ2_BinaryFillHolesBlock() {
        super(new BinaryFillHoles());
    }

}
