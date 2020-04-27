package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Median3DSphere;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_Median3DSphereBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes the local median of a pixels spherical neighborhood. 
     * 
     * The spheres size is specified by 
     * its half-width, half-height and half-depth (radius).
     * 
     * For technical reasons, the volume of the sphere must contain less than 1000 voxels.
     */
    public CLIJ2_Median3DSphereBlock() {
        super(new Median3DSphere());
    }

}
