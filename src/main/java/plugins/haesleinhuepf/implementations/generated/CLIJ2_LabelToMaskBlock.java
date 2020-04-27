package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.LabelToMask;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_LabelToMaskBlock extends AbstractCLIJ2Block {
   
    /**
     * Masks a single label in a label map. 
     * 
     * Sets all pixels in the target image to 1, where the given label index was present in the label map. Other pixels are set to 0.
     */
    public CLIJ2_LabelToMaskBlock() {
        super(new LabelToMask());
    }

}
