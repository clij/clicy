package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GenerateBinaryOverlapMatrix;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GenerateBinaryOverlapMatrixBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes two labelmaps with n and m labels and generates a (n+1)*(m+1) matrix where all pixels are set to 0 exept those where labels overlap between the label maps. 
     * 
     * For example, if labels 3 in labelmap1 and 4 in labelmap2 are touching then the pixel (3,4) in the matrix will be set to 1.
     */
    public CLIJ2_GenerateBinaryOverlapMatrixBlock() {
        super(new GenerateBinaryOverlapMatrix());
    }

}
