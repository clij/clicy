package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ApplyVectorField3D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ApplyVectorField3DBlock extends AbstractCLIJ2Block {
   
    /**
     * Deforms an image stack according to distances provided in the given vector image stacks.
     * 
     * It is recommended to use 32-bit image stacks for input, output and vector image stacks.
     * 
     * Parameters
     * ----------
     * source : Image
     *     The input image to be processed.
     * vector_x : Image
     *     Pixels in this image describe the distance in X direction pixels should be shifted during warping.
     * vector_y : Image
     *     Pixels in this image describe the distance in Y direction pixels should be shifted during warping.
     * vector_z : Image
     *     Pixels in this image describe the distance in Z direction pixels should be shifted during warping.
     * destination : Image
     *     The output image where results are written into.
     * 
     */
    public CLIJ2_ApplyVectorField3DBlock() {
        super(new ApplyVectorField3D());
    }

}
