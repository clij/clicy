package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.EqualizeMeanIntensitiesOfSlices;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_EqualizeMeanIntensitiesOfSlicesBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines correction factors for each z-slice so that the average intensity in all slices can be made the same and multiplies these factors with the slices. 
     * 
     * This functionality is similar to the 'Simple Ratio Bleaching Correction' in Fiji.
     */
    public CLIJ2_EqualizeMeanIntensitiesOfSlicesBlock() {
        super(new EqualizeMeanIntensitiesOfSlices());
    }

}
