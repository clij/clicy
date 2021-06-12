package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GenerateTouchMatrix;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GenerateTouchMatrixBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a labelmap with n labels and generates a (n+1)*(n+1) matrix where all pixels are set to 0 exept those where labels are touching. 
     * 
     * Only half of the matrix is filled (with x < y). For example, if labels 3 and 4 are touching then the pixel (3,4) in the matrix will be set to 1.
     * The touch matrix is a representation of a region adjacency graph
     * 
     */
    public CLIJ2_GenerateTouchMatrixBlock() {
        super(new GenerateTouchMatrix());
    }

}
