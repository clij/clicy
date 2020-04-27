package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.CountNonZeroVoxels3DSphere;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_CountNonZeroVoxels3DSphereBlock extends AbstractCLIJ2Block {
   
    /**
     * Counts non-zero voxels in a sphere around every voxel. 
     * 
     * Put the number in the result image.
     */
    public CLIJ2_CountNonZeroVoxels3DSphereBlock() {
        super(new CountNonZeroVoxels3DSphere());
    }

}
