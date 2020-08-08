package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ExtendLabelingViaVoronoi;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ExtendLabelingViaVoronoiBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label map image and dilates the regions using a octagon shape until they touch. 
     * 
     * The resulting label map is written to the output.
     */
    public CLIJ2_ExtendLabelingViaVoronoiBlock() {
        super(new ExtendLabelingViaVoronoi());
    }

}
