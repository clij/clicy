package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DistanceMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DistanceMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Generates a distance map from a binary image. 
     * 
     * Pixels with non-zero value in the binary image are set to a number representing the distance to the closest zero-value pixel.
     * 
     * Note: This function is known to be slow. See the web for alternatives: 
     * Note: This is not a distance matrix. See generateDistanceMatrix for details.
     */
    public CLIJ2_DistanceMapBlock() {
        super(new DistanceMap());
    }

}
