package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.matrix.LabelledSpotsToPointList;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_LabelledSpotsToPointListBlock extends AbstractCLIJxBlock {
   
    /**
     * Transforms a labelmap of spots (single pixels with values 1, 2, ..., n for n spots) as resulting from connected components analysis in an image where every column contains d 
     * pixels (with d = dimensionality of the original image) with the coordinates of the maxima/minima.
     */
    public CLIJx_LabelledSpotsToPointListBlock() {
        super(new LabelledSpotsToPointList());
    }

}
