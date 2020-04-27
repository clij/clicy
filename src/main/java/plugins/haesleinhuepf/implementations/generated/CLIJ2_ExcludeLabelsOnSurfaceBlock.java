package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ExcludeLabelsOnSurface;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ExcludeLabelsOnSurfaceBlock extends AbstractCLIJ2Block {
   
    /**
     * This operation follows a ray from a given position towards a label (or opposite direction) and checks if  there is another label between the label an the image border. 
     * 
     * If yes, this label is eliminated from the label map.
     */
    public CLIJ2_ExcludeLabelsOnSurfaceBlock() {
        super(new ExcludeLabelsOnSurface());
    }

}
