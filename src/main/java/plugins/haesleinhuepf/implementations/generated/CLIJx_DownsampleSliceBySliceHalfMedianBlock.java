package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clij.macro.modules.DownsampleSliceBySliceHalfMedian;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_DownsampleSliceBySliceHalfMedianBlock extends AbstractCLIJxBlock {
   
    /**
     * Scales an image using scaling factors 0.5 for X and Y dimensions. The Z dimension stays untouched. Thus, each slice is processed separately.
     * The median method is applied. Thus, each pixel value in the destination image equals to the median of
     * four corresponding pixels in the source image.
     */
    public CLIJx_DownsampleSliceBySliceHalfMedianBlock() {
        super(new DownsampleSliceBySliceHalfMedian());
    }

}
