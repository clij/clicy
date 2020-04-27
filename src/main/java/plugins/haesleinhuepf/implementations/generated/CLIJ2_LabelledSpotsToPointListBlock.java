package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.LabelledSpotsToPointList;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_LabelledSpotsToPointListBlock extends AbstractCLIJ2Block {
   
    /**
     * Generates a coordinate list of points in a labelled spot image. 
     * 
     * Transforms a labelmap of spots (single pixels with values 1, 2, ..., n for n spots) as resulting 
     * from connected components analysis in an image where every column contains d 
     * pixels (with d = dimensionality of the original image) with the coordinates of the maxima/minima.
     */
    public CLIJ2_LabelledSpotsToPointListBlock() {
        super(new LabelledSpotsToPointList());
    }

}
