package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ExtendedDepthOfFocusVarianceProjection;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ExtendedDepthOfFocusVarianceProjectionBlock extends AbstractCLIJ2Block {
   
    /**
     * Extended depth of focus projection maximizing local pixel intensity variance.
     * 
     * The sigma parameter allows controlling an Gaussian blur which should smooth the altitude map.
     */
    public CLIJ2_ExtendedDepthOfFocusVarianceProjectionBlock() {
        super(new ExtendedDepthOfFocusVarianceProjection());
    }

}
