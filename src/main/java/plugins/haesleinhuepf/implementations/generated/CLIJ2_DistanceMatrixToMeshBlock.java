package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DistanceMatrixToMesh;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DistanceMatrixToMeshBlock extends AbstractCLIJ2Block {
   
    /**
     * Generates a mesh from a distance matric and a list of point coordinates.
     * 
     * Takes a pointlist with dimensions n*d with n point coordinates in d dimensions and a distance matrix of size n*n to draw lines from all points to points if the corresponding pixel in the distance matrix is smaller than a given distance threshold.
     */
    public CLIJ2_DistanceMatrixToMeshBlock() {
        super(new DistanceMatrixToMesh());
    }

}
