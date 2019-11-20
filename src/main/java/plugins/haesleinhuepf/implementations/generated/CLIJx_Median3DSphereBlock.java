package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clij.macro.modules.Median3DSphere;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_Median3DSphereBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes the local median of a pixels spherical neighborhood. The spheres size is specified by 
     * its half-width, half-height and half-depth (radius).
     * 
     * For technical reasons, the volume of the sphere must contain less than 1000 voxels.
     */
    public CLIJx_Median3DSphereBlock() {
        super(new Median3DSphere());
    }

}
