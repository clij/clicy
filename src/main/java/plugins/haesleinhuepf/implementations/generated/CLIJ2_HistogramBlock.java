package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Histogram;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_HistogramBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the histogram of a given image.
     * 
     * The histogram image is of dimensions number_of_bins/1/1; a 3D image with height=1 and depth=1. 
     * Histogram bins contain the number of pixels with intensity in this corresponding bin. 
     * The histogram bins are uniformly distributed between given minimum and maximum grey value intensity. 
     * If the flag determine_min_max is set, minimum and maximum intensity will be determined. 
     * When calling this operation many times, it is recommended to determine minimum and maximum intensity 
     * once at the beginning and handing over these values.
     */
    public CLIJ2_HistogramBlock() {
        super(new Histogram());
    }

}
