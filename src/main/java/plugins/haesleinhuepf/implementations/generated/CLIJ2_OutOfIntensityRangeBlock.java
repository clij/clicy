package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.OutOfIntensityRange;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_OutOfIntensityRangeBlock extends AbstractCLIJ2Block {
   
    /**
     * Sets all pixels to 1 if their intensity lies out of a given range, and 0 otherwise.
     * 
     * Given minimum and maximum are considered part of the range.
     */
    public CLIJ2_OutOfIntensityRangeBlock() {
        super(new OutOfIntensityRange());
    }

}
