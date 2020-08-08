package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.CentroidsOfBackgroundAndLabels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_CentroidsOfBackgroundAndLabelsBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the centroids of the background and all labels in a label image or image stack. 
     * 
     * It writes the resulting  coordinates in a pointlist image. Depending on the dimensionality d of the labelmap and the number  of labels n, the pointlist image will have n*d pixels.
     */
    public CLIJ2_CentroidsOfBackgroundAndLabelsBlock() {
        super(new CentroidsOfBackgroundAndLabels());
    }

}
