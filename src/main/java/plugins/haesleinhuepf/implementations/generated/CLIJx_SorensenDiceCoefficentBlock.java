package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.SorensenDiceCoefficent;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_SorensenDiceCoefficentBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines the overlap of two binary images using the Sorensen-Dice coefficent.
     * A value of 0 suggests no overlap, 1 means perfect overlap.
     * The Sorensen-Dice coefficient is saved in the colum 'Sorensen_Dice_coefficient'.
     * Note that the Sorensen-Dice coefficient s can be calculated from the Jaccard index j using this formula:
     * <pre>s = f(j) = 2 j / (j + 1)</pre>
     */
    public CLIJx_SorensenDiceCoefficentBlock() {
        super(new SorensenDiceCoefficent());
    }

}
