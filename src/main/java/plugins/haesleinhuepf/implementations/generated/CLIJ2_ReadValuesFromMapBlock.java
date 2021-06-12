package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ReadValuesFromMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ReadValuesFromMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label image and an parametric image and reads parametric values from the labels positions.
     * 
     * The read intensity valus are stored in a new vector.
     * 
     * Note: This will only work if all labels have number of voxels == 1 or if all pixels in each label have the same value.
     * 
     * Parameters
     * ----------
     * labels
     * map_image
     * values_destination
     */
    public CLIJ2_ReadValuesFromMapBlock() {
        super(new ReadValuesFromMap());
    }

}
