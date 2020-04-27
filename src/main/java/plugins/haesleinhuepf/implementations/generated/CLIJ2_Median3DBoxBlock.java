package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Median3DBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_Median3DBoxBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes the local median of a pixels cuboid neighborhood. 
     * 
     * The cuboid size is specified by 
     * its half-width, half-height and half-depth (radius).
     * 
     * For technical reasons, the volume of the cuboid must contain less than 1000 voxels.
     */
    public CLIJ2_Median3DBoxBlock() {
        super(new Median3DBox());
    }

}
