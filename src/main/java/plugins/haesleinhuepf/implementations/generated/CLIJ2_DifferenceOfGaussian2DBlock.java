package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DifferenceOfGaussian2D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DifferenceOfGaussian2DBlock extends AbstractCLIJ2Block {
   
    /**
     * Applies Gaussian blur to the input image twice with different sigma values resulting in two images which are then subtracted from each other.
     * 
     * It is recommended to apply this operation to images of type Float (32 bit) as results might be negative.
     * 
     * Parameters
     * ----------
     * input : Image
     *     The input image to be processed.
     * destination : Image
     *     The output image where results are written into.
     * sigma1_x : float
     *     Sigma of the first Gaussian filter in x
     * sigma1_y : float
     *     Sigma of the first Gaussian filter in y
     * sigma2_x : float
     *     Sigma of the second Gaussian filter in x
     * sigma2_y : float
     *     Sigma of the second Gaussian filter in y
     */
    public CLIJ2_DifferenceOfGaussian2DBlock() {
        super(new DifferenceOfGaussian2D());
    }

}
