package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.EqualizeMeanIntensitiesOfSlices;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_EqualizeMeanIntensitiesOfSlicesBlock extends AbstractCLIJxBlock {
   
    /**
     * Determines correction factors for each slice so that the average intensity in all slices can be made the same and applies the factors.
     * This functionality is similar to the 'Simple Ratio Bleaching Correction' in Fiji.
     */
    public CLIJx_EqualizeMeanIntensitiesOfSlicesBlock() {
        super(new EqualizeMeanIntensitiesOfSlices());
    }

}
