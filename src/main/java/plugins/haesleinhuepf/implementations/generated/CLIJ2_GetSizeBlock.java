package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GetSize;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GetSizeBlock extends AbstractCLIJ2Block {
   
    /**
     * Reads out the size of an image [stack] and writes it to the results table in the columns 'Width', 'Height' and 'Depth'.
     * 
     * DEPRECATED: Thie method is deprecated. Use getDimensions instead.
     */
    public CLIJ2_GetSizeBlock() {
        super(new GetSize());
    }

}
