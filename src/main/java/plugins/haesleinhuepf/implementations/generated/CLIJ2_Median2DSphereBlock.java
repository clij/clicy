package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Median2DSphere;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_Median2DSphereBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes the local median of a pixels ellipsoidal neighborhood. 
     * 
     * The ellipses size is specified by 
     * its half-width and half-height (radius).
     * 
     * For technical reasons, the area of the ellipse must have less than 1000 pixels.
     */
    public CLIJ2_Median2DSphereBlock() {
        super(new Median2DSphere());
    }

}
