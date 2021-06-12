package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MeanIntensityMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MeanIntensityMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes an image and a corresponding label map, determines the mean intensity per label and replaces every label with the that number.
     * 
     * This results in a parametric image expressing mean object intensity.
     */
    public CLIJ2_MeanIntensityMapBlock() {
        super(new MeanIntensityMap());
    }

}
