package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.LabelSpots;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_LabelSpotsBlock extends AbstractCLIJ2Block {
   
    /**
     * Transforms a binary image with single pixles set to 1 to a labelled spots image. 
     * 
     * Transforms a spots image as resulting from maximum/minimum detection in an image of the same size where every spot has a number 1, 2, ... n.
     */
    public CLIJ2_LabelSpotsBlock() {
        super(new LabelSpots());
    }

}
