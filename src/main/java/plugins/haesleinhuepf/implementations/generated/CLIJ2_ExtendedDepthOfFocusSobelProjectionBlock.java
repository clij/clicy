package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ExtendedDepthOfFocusSobelProjection;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ExtendedDepthOfFocusSobelProjectionBlock extends AbstractCLIJ2Block {
   
    /**
     * Extended depth of focus projection maximizing intensity in the local sobel image.
     * 
     * The sigma parameter allows controlling an Gaussian blur which should smooth the altitude map.
     */
    public CLIJ2_ExtendedDepthOfFocusSobelProjectionBlock() {
        super(new ExtendedDepthOfFocusSobelProjection());
    }

}
