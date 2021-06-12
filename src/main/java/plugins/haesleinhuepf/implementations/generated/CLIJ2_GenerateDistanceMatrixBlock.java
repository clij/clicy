package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GenerateDistanceMatrix;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GenerateDistanceMatrixBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes the distance between all point coordinates given in two point lists.
     * 
     * Takes two images containing pointlists (dimensionality n * d, n: number of points and d: dimensionality) and builds up a matrix containing the distances between these points. 
     * 
     * Convention: Given two point lists with dimensionality n * d and m * d, the distance matrix will be of size(n + 1) * (m + 1). The first row and column contain zeros. They represent the distance of the objects to a theoretical background object. In that way, distance matrices are of the same size as touch matrices (see generateTouchMatrix). Thus, one can threshold a distance matrix to generate a touch matrix out of it for drawing meshes.
     */
    public CLIJ2_GenerateDistanceMatrixBlock() {
        super(new GenerateDistanceMatrix());
    }

}
