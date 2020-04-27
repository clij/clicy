package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.VoronoiOctagon;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_VoronoiOctagonBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a binary image and dilates the regions using a octagon shape until they touch. 
     * 
     * The pixels where  the regions touched are afterwards returned as binary image which corresponds to the Voronoi diagram.
     */
    public CLIJ2_VoronoiOctagonBlock() {
        super(new VoronoiOctagon());
    }

}
