package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GenerateTouchCountMatrix;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GenerateTouchCountMatrixBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label map with n labels and generates a (n+1)*(n+1) matrix where all pixels are set the number of pixels where labels touch (diamond neighborhood). 
     * 
     * Major parts of this operation run on the CPU.
     */
    public CLIJ2_GenerateTouchCountMatrixBlock() {
        super(new GenerateTouchCountMatrix());
    }

}
