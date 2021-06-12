package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Watershed;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_WatershedBlock extends AbstractCLIJ2Block {
   
    /**
     * Apply a binary watershed to a binary image and introduces black pixels between objects.
     * 
     * Note: This parallel GPU-accelerated approach delivers results of limited quality.See the web for alternatives: https://github.com/clij/clij2/issues/18
     */
    public CLIJ2_WatershedBlock() {
        super(new Watershed());
    }

}
