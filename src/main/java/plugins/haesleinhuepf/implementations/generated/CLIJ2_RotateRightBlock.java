package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.RotateRight;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_RotateRightBlock extends AbstractCLIJ2Block {
   
    /**
     * Rotates a given input image by 90 degrees counter-clockwise. 
     * 
     * For that, X and Y axis of an image stack
     * are flipped. This operation is similar to ImageJs 'Reslice [/]' method but offers less flexibility 
     * such as interpolation.
     */
    public CLIJ2_RotateRightBlock() {
        super(new RotateRight());
    }

}
