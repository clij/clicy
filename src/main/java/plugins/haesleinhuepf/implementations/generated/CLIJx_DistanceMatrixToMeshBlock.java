package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.matrix.DistanceMatrixToMesh;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_DistanceMatrixToMeshBlock extends AbstractCLIJxBlock {
   
    /**
     * Takes a pointlist with dimensions n*d with n point coordinates in d dimensions and a distance matrix of size n*n to draw lines from all points to points if the corresponding pixel in the distance matrix is smaller than a given distance threshold.
     */
    public CLIJx_DistanceMatrixToMeshBlock() {
        super(new DistanceMatrixToMesh());
    }

}
