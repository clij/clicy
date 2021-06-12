package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.BinaryEdgeDetection;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_BinaryEdgeDetectionBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines pixels/voxels which are on the surface of binary objects and sets only them to 1 in the 
     * destination image. All other pixels are set to 0.
     * 
     * Parameters
     * ----------
     * source : Image
     *     The binary input image where edges will be searched.
     * destination : Image
     *     The output image where edge pixels will be 1.
     * 
     */
    public CLIJ2_BinaryEdgeDetectionBlock() {
        super(new BinaryEdgeDetection());
    }

}
