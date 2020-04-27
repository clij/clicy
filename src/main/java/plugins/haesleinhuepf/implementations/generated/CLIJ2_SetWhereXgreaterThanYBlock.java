package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.SetWhereXgreaterThanY;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_SetWhereXgreaterThanYBlock extends AbstractCLIJ2Block {
   
    /**
     * Sets all pixel values a of a given image A to a constant value v in case its coordinates x > y. 
     * 
     * Otherwise the pixel is not overwritten.
     * If you want to initialize an identity transfrom matrix, set all pixels to 0 first.
     * 
     * <pre>f(a) = v</pre>
     */
    public CLIJ2_SetWhereXgreaterThanYBlock() {
        super(new SetWhereXgreaterThanY());
    }

}
