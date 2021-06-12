package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.PixelCountMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_PixelCountMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label map, determines the number of pixels per label and replaces every label with the that number.
     * 
     * This results in a parametric image expressing area or volume.
     */
    public CLIJ2_PixelCountMapBlock() {
        super(new PixelCountMap());
    }

}
