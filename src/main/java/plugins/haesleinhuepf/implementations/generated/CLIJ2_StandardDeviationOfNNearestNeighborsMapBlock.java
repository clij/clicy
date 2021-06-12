package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.StandardDeviationOfNNearestNeighborsMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_StandardDeviationOfNNearestNeighborsMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label image and a parametric intensity image and will replace each labels value in the parametric image
     * by the standard deviation value of neighboring labels. The distance number of nearest neighbors can be configured.
     * Note: Values of all pixels in a label each must be identical.
     * 
     * Parameters
     * ----------
     * parametric_map : Image
     * label_map : Image
     * parametric_map_destination : Image
     * n : int
     *     number of nearest neighbors
     */
    public CLIJ2_StandardDeviationOfNNearestNeighborsMapBlock() {
        super(new StandardDeviationOfNNearestNeighborsMap());
    }

}
