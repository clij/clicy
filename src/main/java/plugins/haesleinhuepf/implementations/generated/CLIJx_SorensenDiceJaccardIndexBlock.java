package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.SorensenDiceJaccardIndex;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_SorensenDiceJaccardIndexBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines the overlap of two binary images using the Jaccard index and the Sorensen-Dice coefficent.
     * In both metrices, a value of 0 suggests no overlap, 1 means perfect overlap.
     * The resulting Jaccard index is saved to the results table in the 'Jaccard_Index' column.
     * The Sorensen-Dice coefficient is saved in the colum 'Sorensen_Dice_coefficient'.
     * Note that the Sorensen-Dice coefficient s can be calculated from the Jaccard index j using this formula:
     * <pre>s = f(j) = 2 j / (j + 1)</pre>
     */
    public CLIJx_SorensenDiceJaccardIndexBlock() {
        super(new SorensenDiceJaccardIndex());
    }

}
