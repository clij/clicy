package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ExcludeLabelsOutsideSizeRange;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ExcludeLabelsOutsideSizeRangeBlock extends AbstractCLIJ2Block {
   
    /**
     * Removes labels from a label map which are not within a certain size range.
     * 
     * Size of the labels is given as the number of pixel or voxels per label.
     */
    public CLIJ2_ExcludeLabelsOutsideSizeRangeBlock() {
        super(new ExcludeLabelsOutsideSizeRange());
    }

}
