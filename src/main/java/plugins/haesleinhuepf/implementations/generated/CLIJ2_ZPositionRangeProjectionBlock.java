package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ZPositionRangeProjection;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ZPositionRangeProjectionBlock extends AbstractCLIJ2Block {
   
    /**
     * Project multiple Z-slices of a 3D stack into a new 3D stack.
     * 
     * Which Z-slice is defined as the z_position image, which represents an altitude map. The two additional numbers define the range relative to the given z-position.
     */
    public CLIJ2_ZPositionRangeProjectionBlock() {
        super(new ZPositionRangeProjection());
    }

}
