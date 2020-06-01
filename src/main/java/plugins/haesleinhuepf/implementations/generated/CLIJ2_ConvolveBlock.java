package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Convolve;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ConvolveBlock extends AbstractCLIJ2Block {
   
    /**
     * Convolve the image with a given kernel image.
     * 
     * It is recommended that the kernel image has an odd size in X, Y and Z.
     */
    public CLIJ2_ConvolveBlock() {
        super(new Convolve());
    }

}
