package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DrawBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DrawBoxBlock extends AbstractCLIJ2Block {
   
    /**
     * Draws a box at a given start point with given size. 
     * All pixels other than in the box are untouched. Consider using `set(buffer, 0);` in advance.
     */
    public CLIJ2_DrawBoxBlock() {
        super(new DrawBox());
    }

}
