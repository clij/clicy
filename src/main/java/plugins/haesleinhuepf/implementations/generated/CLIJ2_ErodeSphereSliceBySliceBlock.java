package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ErodeSphereSliceBySlice;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ErodeSphereSliceBySliceBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes a binary image with pixel values 0 and 1 containing the binary erosion of a given input image. 
     * 
     * The erosion takes the von-Neumann-neighborhood (4 pixels in 2D and 6 pixels in 3d) into account.
     * The pixels in the input image with pixel value not equal to 0 will be interpreted as 1.
     * 
     * This filter is applied slice by slice in 2D.
     */
    public CLIJ2_ErodeSphereSliceBySliceBlock() {
        super(new ErodeSphereSliceBySlice());
    }

}
