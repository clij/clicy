package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MinimumIntensityMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MinimumIntensityMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes an image and a corresponding label map, determines the minimum intensity per label and replaces every label with the that number.
     * 
     * This results in a parametric image expressing mean object intensity.
     */
    public CLIJ2_MinimumIntensityMapBlock() {
        super(new MinimumIntensityMap());
    }

}
