package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DrawLine;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DrawLineBlock extends AbstractCLIJ2Block {
   
    /**
     * Draws a line between two points with a given thickness. 
     * 
     * All pixels other than on the line are untouched. Consider using `set(buffer, 0);` in advance.
     */
    public CLIJ2_DrawLineBlock() {
        super(new DrawLine());
    }

}
