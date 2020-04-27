package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.LabelVoronoiOctagon;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_LabelVoronoiOctagonBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a labelled image and dilates the labels using a octagon shape until they touch. 
     * 
     * The pixels where  the regions touched are afterwards returned as binary image which corresponds to the Voronoi diagram.
     */
    public CLIJ2_LabelVoronoiOctagonBlock() {
        super(new LabelVoronoiOctagon());
    }

}
