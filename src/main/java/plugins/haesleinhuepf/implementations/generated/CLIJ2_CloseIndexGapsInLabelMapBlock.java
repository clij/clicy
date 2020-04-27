package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.CloseIndexGapsInLabelMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_CloseIndexGapsInLabelMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Analyses a label map and if there are gaps in the indexing (e.g. label 5 is not present) all 
     * subsequent labels will be relabelled. 
     * 
     * Thus, afterwards number of labels and maximum label index are equal.
     * This operation is mostly performed on the CPU.
     */
    public CLIJ2_CloseIndexGapsInLabelMapBlock() {
        super(new CloseIndexGapsInLabelMap());
    }

}
