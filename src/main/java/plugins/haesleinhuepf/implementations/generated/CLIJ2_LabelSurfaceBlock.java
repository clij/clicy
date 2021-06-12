package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.LabelSurface;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_LabelSurfaceBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label map and excludes all labels which are not on the surface.
     * 
     * For each label, a ray from a given center towards the label. If the ray crosses another label, the labelin question is not at the surface and thus, removed.
     */
    public CLIJ2_LabelSurfaceBlock() {
        super(new LabelSurface());
    }

}
