package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ConnectedComponentsLabelingDiamond;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ConnectedComponentsLabelingDiamondBlock extends AbstractCLIJ2Block {
   
    /**
     * Performs connected components analysis inspecting the diamond neighborhood of every pixel to a binary image and generates a label map.
     */
    public CLIJ2_ConnectedComponentsLabelingDiamondBlock() {
        super(new ConnectedComponentsLabelingDiamond());
    }

}
