package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.ReplaceIntensities;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_ReplaceIntensitiesBlock extends AbstractCLIJxBlock {
   
    /**
     * Replaces integer intensities specified in a vector image. The vector image must be 3D with size (m, 1, 1) where m corresponds to the maximum intensity in the original image. Assuming the vector image contains values (0, 1, 0, 2) means: 
     *  * All pixels with value 0 (first entry in the vector image) get value 0
     *  * All pixels with value 1 get value 1
     *  * All pixels with value 2 get value 0
     *  * All pixels with value 3 get value 2
     * 
     */
    public CLIJx_ReplaceIntensitiesBlock() {
        super(new ReplaceIntensities());
    }

}
