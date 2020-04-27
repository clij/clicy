package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GenerateDistanceMatrix;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GenerateDistanceMatrixBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes two images containing coordinates and builds up a matrix containing distance between the points. 
     * 
     * Convention: image width represents number of points, height represents dimensionality (2D, 3D, ... 10D). The result image has width the first input image and height equals to the width of the second input image.
     */
    public CLIJ2_GenerateDistanceMatrixBlock() {
        super(new GenerateDistanceMatrix());
    }

}
