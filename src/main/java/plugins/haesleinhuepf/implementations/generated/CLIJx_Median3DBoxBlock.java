package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.Median3DBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_Median3DBoxBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes the local median of a pixels cuboid neighborhood. The cuboid size is specified by 
     * its half-width, half-height and half-depth (radius).
     * 
     * For technical reasons, the volume of the cuboid must contain less than 1000 voxels.
     */
    public CLIJx_Median3DBoxBlock() {
        super(new Median3DBox());
    }

}
