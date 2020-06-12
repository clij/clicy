package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GenerateJaccardIndexMatrix;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GenerateJaccardIndexMatrixBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes two labelmaps with n and m labels_2 and generates a (n+1)*(m+1) matrix where all labels_1 are set to 0 exept those where labels_2 overlap between the label maps. 
     * 
     * For the remaining labels_1, the value will be between 0 and 1 indicating the overlap as measured by the Jaccard Index.
     * Major parts of this operation run on the CPU.
     */
    public CLIJ2_GenerateJaccardIndexMatrixBlock() {
        super(new GenerateJaccardIndexMatrix());
    }

}
