package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DetectLabelEdges;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DetectLabelEdgesBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a labelmap and returns an image where all pixels on label edges are set to 1 and all other pixels to 0.
     * 
     * Parameters
     * ----------
     * label_map : Image
     *     The label image where edges between labels will be detected.
     * edge_image_destination : Number
     *     Binary image where edges were marked with value 1 and all other pixels will be set to 0.
     * 
     */
    public CLIJ2_DetectLabelEdgesBlock() {
        super(new DetectLabelEdges());
    }

}
