package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clij.macro.modules.Median2DSphere;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_Median2DSphereBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes the local median of a pixels ellipsoidal neighborhood. The ellipses size is specified by 
     * its half-width and half-height (radius).
     * 
     * For technical reasons, the area of the ellipse must have less than 1000 pixels.
     */
    public CLIJx_Median2DSphereBlock() {
        super(new Median2DSphere());
    }

}
