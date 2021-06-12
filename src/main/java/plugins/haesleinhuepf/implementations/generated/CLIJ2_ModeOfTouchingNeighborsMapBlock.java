package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ModeOfTouchingNeighborsMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ModeOfTouchingNeighborsMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label image and a parametric intensity image and will replace each labels value in the parametric image
     * by the most popular value of neighboring labels. The radius of the neighborhood can be configured:
     * * radius 0: Nothing is replaced
     * * radius 1: direct neighbors are taken into account
     * * radius 2: neighbors and neighbors or neighbors are taken into account
     * * radius n: ...
     * 
     * Note: Values of all pixels in a label each must be identical.
     * 
     * Parameters
     * ----------
     * parametric_map : Image
     * label_map : Image
     * parametric_map_destination : Image
     * radius : int
     * ignore_touching_background : bool
     * 
     * Returns
     * -------
     * parametric_map_destination
     */
    public CLIJ2_ModeOfTouchingNeighborsMapBlock() {
        super(new ModeOfTouchingNeighborsMap());
    }

}
