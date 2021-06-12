package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ReadValuesFromPositions;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ReadValuesFromPositionsBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a pointlist and a parametric image and reads parametric values from the positions.
     * 
     * The read intensity values are stored in a new vector.
     * 
     * Parameters
     * ----------
     * pointlist
     * map_image
     * values_destination
     */
    public CLIJ2_ReadValuesFromPositionsBlock() {
        super(new ReadValuesFromPositions());
    }

}
