package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ReduceLabelsToCentroids;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ReduceLabelsToCentroidsBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label map and reduces all labels to their center spots. Label IDs stay and background will be zero.
     */
    public CLIJ2_ReduceLabelsToCentroidsBlock() {
        super(new ReduceLabelsToCentroids());
    }

}
