package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GreyscaleClosingSphere;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GreyscaleClosingSphereBlock extends AbstractCLIJ2Block {
   
    /**
     * Apply a greyscale morphological closing to the input image.
     * 
     * It applies a maximum filter first and the result is processed by a minimum filter with given radii.
     * Low intensity regions smaller than radius will disappear.
     */
    public CLIJ2_GreyscaleClosingSphereBlock() {
        super(new GreyscaleClosingSphere());
    }

}
