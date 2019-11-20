package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.matrix.TouchMatrixToMesh;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_TouchMatrixToMeshBlock extends AbstractCLIJxBlock {
   
    /**
     * Takes a pointlist with dimensions n*d with n point coordinates in d dimensions and a touch matrix of size n*n. and draws lines from all points to points if the corresponding pixel in the touch matrix is 1.
     */
    public CLIJx_TouchMatrixToMeshBlock() {
        super(new TouchMatrixToMesh());
    }

}
