package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.JaccardIndex;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_JaccardIndexBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines the overlap of two binary images using the Jaccard index.
     * A value of 0 suggests no overlap, 1 means perfect overlap.
     * The resulting Jaccard index is saved to the results table in the 'Jaccard_Index' column.
     * Note that the Sorensen-Dice coefficient can be calculated from the Jaccard index j using this formula:
     * <pre>s = f(j) = 2 j / (j + 1)</pre>
     */
    public CLIJx_JaccardIndexBlock() {
        super(new JaccardIndex());
    }

}
