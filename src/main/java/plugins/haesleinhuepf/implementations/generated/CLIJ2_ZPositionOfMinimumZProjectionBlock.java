package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ZPositionOfMinimumZProjection;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ZPositionOfMinimumZProjectionBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines a Z-position of the minimum intensity along Z and writes it into the resulting image.
     * 
     * If there are multiple z-slices with the same value, the smallest Z will be chosen.
     */
    public CLIJ2_ZPositionOfMinimumZProjectionBlock() {
        super(new ZPositionOfMinimumZProjection());
    }

}
