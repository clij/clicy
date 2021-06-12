package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.TouchMatrixToMesh;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_TouchMatrixToMeshBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a pointlist with dimensions n*d with n point coordinates in d dimensions and a touch matrix of 
     * size n*n to draw lines from all points to points if the corresponding pixel in the touch matrix is 1.
     * 
     * Parameters
     * ----------
     * pointlist : Image
     *     n*d matrix representing n coordinates with d dimensions.
     * touch_matrix : Image
     *     A 2D binary matrix with 1 in pixels (i,j) where label i touches label j.
     * mesh_destination : Image
     *     The output image where results are written into.
     * 
     */
    public CLIJ2_TouchMatrixToMeshBlock() {
        super(new TouchMatrixToMesh());
    }

}
