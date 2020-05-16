package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DetectMinima3DBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DetectMinima3DBoxBlock extends AbstractCLIJ2Block {
   
    /**
     * Detects local minima in a given square/cubic neighborhood. 
     * 
     * Pixels in the resulting image are set to 1 if there is no other pixel in a given radius which has a 
     * lower intensity, and to 0 otherwise.
     */
    public CLIJ2_DetectMinima3DBoxBlock() {
        super(new DetectMinima3DBox());
    }

}
