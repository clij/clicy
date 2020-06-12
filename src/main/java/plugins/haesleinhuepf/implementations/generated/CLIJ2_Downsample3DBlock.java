package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Downsample3D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_Downsample3DBlock extends AbstractCLIJ2Block {
   
    /**
     * Scales an image using given scaling factors for X and Y dimensions. 
     * 
     * The nearest-neighbor method
     * is applied. In ImageJ the method which is similar is called 'Interpolation method: none'.
     */
    public CLIJ2_Downsample3DBlock() {
        super(new Downsample3D());
    }

}
