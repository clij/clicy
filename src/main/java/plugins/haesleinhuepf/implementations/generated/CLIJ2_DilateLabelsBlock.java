package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DilateLabels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DilateLabelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Extend labels with a given radius.
     * 
     * This is actually a local maximum filter applied to a label map which does not overwrite labels.
     * It is recommended to apply this operation to isotropic images only.
     */
    public CLIJ2_DilateLabelsBlock() {
        super(new DilateLabels());
    }

}
