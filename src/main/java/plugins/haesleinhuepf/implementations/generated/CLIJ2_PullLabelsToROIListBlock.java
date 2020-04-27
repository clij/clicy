package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.PullLabelsToROIList;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_PullLabelsToROIListBlock extends AbstractCLIJ2Block {
   
    /**
     * Pulls all labels in a label map as ROIs to a list. 
     * 
     * From ImageJ macro this list is written to the log 
     * window. From ImageJ macro conside using pullLabelsToROIManager.
     */
    public CLIJ2_PullLabelsToROIListBlock() {
        super(new PullLabelsToROIList());
    }

}
