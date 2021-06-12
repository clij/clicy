package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MaximumOfProximalNeighborsMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MaximumOfProximalNeighborsMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label image and a parametric intensity image and will replace each labels value in the parametric image by the maximum value of neighboring labels.
     * 
     *  The distance range of the centroids of the neighborhood can be configured.
     * Note: Values of all pixels in a label each must be identical.
     * 
     * Parameters
     * ----------
     * parametric_map : Image
     * label_map : Image
     * parametric_map_destination : Image
     * min_distance : float, optional
     *     default : 0
     * max_distance : float, optional
     *     default: maximum float value
     */
    public CLIJ2_MaximumOfProximalNeighborsMapBlock() {
        super(new MaximumOfProximalNeighborsMap());
    }

}
