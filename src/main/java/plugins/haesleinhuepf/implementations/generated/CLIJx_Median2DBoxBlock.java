package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.Median2DBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_Median2DBoxBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes the local median of a pixels rectangular neighborhood. The rectangle is specified by 
     * its half-width and half-height (radius).
     * 
     * For technical reasons, the area of the rectangle must have less than 1000 pixels.
     */
    public CLIJx_Median2DBoxBlock() {
        super(new Median2DBox());
    }

}
