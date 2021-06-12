package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.VoronoiOtsuLabeling;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_VoronoiOtsuLabelingBlock extends AbstractCLIJ2Block {
   
    /**
     * Labeles objects directly from grey-value images.
     * 
     * The two sigma parameters allow tuning the segmentation result. The first sigma controls how close detected cells can be (spot_sigma) and the second controls how precise segmented objects are outlined (outline_sigma).Under the hood, this filter applies two Gaussian blurs, spot detection, Otsu-thresholding and Voronoi-labeling.
     * The thresholded binary image is flooded using the Voronoi approach starting from the found local maxima.
     * Noise-removal sigma for spot detection and thresholding can be configured separately.
     */
    public CLIJ2_VoronoiOtsuLabelingBlock() {
        super(new VoronoiOtsuLabeling());
    }

}
