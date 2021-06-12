package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ZPositionProjection;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ZPositionProjectionBlock extends AbstractCLIJ2Block {
   
    /**
     * Project a defined Z-slice of a 3D stack into a 2D image.
     * 
     * Which Z-slice is defined as the z_position image, which represents an altitude map.
     */
    public CLIJ2_ZPositionProjectionBlock() {
        super(new ZPositionProjection());
    }

}
