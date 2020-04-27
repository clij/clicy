package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.NClosestDistances;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_NClosestDistancesBlock extends AbstractCLIJ2Block {
   
    /**
     * Determine the n point indices with shortest distance for all points in a distance matrix. 
     * 
     * This corresponds to the n row indices with minimum values for each column of the distance matrix.Returns the n shortest distances in one image and the point indices in another image.
     */
    public CLIJ2_NClosestDistancesBlock() {
        super(new NClosestDistances());
    }

}
