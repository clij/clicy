package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ExtensionRatioMap;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ExtensionRatioMapBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a label map, determines for every label the extension ratio and replaces every label with the that number.
     * 
     * The extension ratio is the maximum distance of any pixel in the label to the label centroid divided by the average distance of all pixels in the label to the centroid.
     */
    public CLIJ2_ExtensionRatioMapBlock() {
        super(new ExtensionRatioMap());
    }

}
