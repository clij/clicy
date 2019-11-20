package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clij.macro.modules.DetectMaximaSliceBySliceBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_DetectMaximaSliceBySliceBoxBlock extends AbstractCLIJxBlock {
   
    /**
     * Detects local maxima in a given square neighborhood of an input image stack. The input image stack is 
     * processed slice by slice. Pixels in the resulting image are set to 1 if there is no other pixel in a 
     * given radius which has a higher intensity, and to 0 otherwise.
     */
    public CLIJx_DetectMaximaSliceBySliceBoxBlock() {
        super(new DetectMaximaSliceBySliceBox());
    }

}
