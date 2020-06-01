package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.VoronoiLabeling;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_VoronoiLabelingBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a binary image, labels connected components and dilates the regions using a octagon shape until they touch. 
     * 
     * The resulting label map is written to the output.
     */
    public CLIJ2_VoronoiLabelingBlock() {
        super(new VoronoiLabeling());
    }

}
