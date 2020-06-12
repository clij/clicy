package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DownsampleSliceBySliceHalfMedian;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DownsampleSliceBySliceHalfMedianBlock extends AbstractCLIJ2Block {
   
    /**
     * Scales an image using scaling factors 0.5 for X and Y dimensions. The Z dimension stays untouched. 
     * 
     * Thus, each slice is processed separately.
     * The median method is applied. Thus, each pixel value in the destination image equals to the median of
     * four corresponding pixels in the source image.
     */
    public CLIJ2_DownsampleSliceBySliceHalfMedianBlock() {
        super(new DownsampleSliceBySliceHalfMedian());
    }

}
