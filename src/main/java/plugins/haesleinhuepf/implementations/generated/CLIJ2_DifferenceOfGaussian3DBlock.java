package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DifferenceOfGaussian3D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DifferenceOfGaussian3DBlock extends AbstractCLIJ2Block {
   
    /**
     * Applies Gaussian blur to the input image twice with different sigma values resulting in two images which are then subtracted from each other.
     * 
     * It is recommended to apply this operation to images of type Float (32 bit) as results might be negative.
     */
    public CLIJ2_DifferenceOfGaussian3DBlock() {
        super(new DifferenceOfGaussian3D());
    }

}
