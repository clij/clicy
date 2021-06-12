package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ErodeLabels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ErodeLabelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Extend labels with a given radius.
     * 
     * This is actually a local minimum filter applied to a label map after introducing background-gaps between labels.
     * In case relabel_islands is set, split objects will get new labels each. In this case, more labels might be in the result.
     * It is recommended to apply this operation to isotropic images only.
     * Warning: If labels were too small, they may be missing in the resulting label image.
     */
    public CLIJ2_ErodeLabelsBlock() {
        super(new ErodeLabels());
    }

}
