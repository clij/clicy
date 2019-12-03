package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.CrossCorrelation;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_CrossCorrelationBlock extends AbstractCLIJxBlock {
   
    /**
     * Performs cross correlation analysis between two images. The second image is shifted by deltaPos in the given dimension. The cross correlation coefficient is calculated for each pixel in a range around the given pixel with given radius in the given dimension. Together with the original images it is recommended to hand over mean filtered images using the same radius.  
     */
    public CLIJx_CrossCorrelationBlock() {
        super(new CrossCorrelation());
    }

}
