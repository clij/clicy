package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij.macro.modules.MedianSliceBySliceBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MedianSliceBySliceBoxBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes the local median of a pixels rectangular neighborhood. This is done slice-by-slice in a 3D 
     * image stack. The rectangle is specified by its half-width and half-height (radius).
     * 
     * For technical reasons, the area of the rectangle must have less than 1000 pixels.
     */
    public CLIJ2_MedianSliceBySliceBoxBlock() {
        super(new MedianSliceBySliceBox());
    }

}
