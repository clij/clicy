package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Median2DBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_Median2DBoxBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes the local median of a pixels rectangular neighborhood. 
     * 
     * The rectangle is specified by 
     * its half-width and half-height (radius).
     * 
     * For technical reasons, the area of the rectangle must have less than 1000 pixels.
     */
    public CLIJ2_Median2DBoxBlock() {
        super(new Median2DBox());
    }

}
