package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.CountNonZeroPixelsSliceBySliceSphere;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_CountNonZeroPixelsSliceBySliceSphereBlock extends AbstractCLIJ2Block {
   
    /**
     * Counts non-zero pixels in a sphere around every pixel slice by slice in a stack. 
     * 
     *  It puts the resulting number in the destination image stack.
     */
    public CLIJ2_CountNonZeroPixelsSliceBySliceSphereBlock() {
        super(new CountNonZeroPixelsSliceBySliceSphere());
    }

}
