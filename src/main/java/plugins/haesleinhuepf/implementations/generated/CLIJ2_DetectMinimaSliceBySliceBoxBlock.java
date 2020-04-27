package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DetectMinimaSliceBySliceBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DetectMinimaSliceBySliceBoxBlock extends AbstractCLIJ2Block {
   
    /**
     * Detects local minima in a given square neighborhood of an input image stack. 
     * 
     * The input image stack is processed slice by slice. Pixels in the resulting image are set to 1 if 
     * there is no other pixel in a given radius which has a lower intensity, and to 0 otherwise.
     */
    public CLIJ2_DetectMinimaSliceBySliceBoxBlock() {
        super(new DetectMinimaSliceBySliceBox());
    }

}
