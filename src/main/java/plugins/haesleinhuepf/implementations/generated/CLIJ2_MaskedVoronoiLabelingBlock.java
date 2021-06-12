package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MaskedVoronoiLabeling;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MaskedVoronoiLabelingBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a binary image, labels connected components and dilates the regions using a octagon shape until they touch and only inside another binary mask image.
     * 
     * The resulting label map is written to the output.
     * 
     * Hint: Process isotropic images only.
     */
    public CLIJ2_MaskedVoronoiLabelingBlock() {
        super(new MaskedVoronoiLabeling());
    }

}
