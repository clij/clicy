package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.DrawSphere;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_DrawSphereBlock extends AbstractCLIJ2Block {
   
    /**
     * Draws a sphere around a given point with given radii in x, y and z (if 3D). 
     * 
     *  All pixels other than in the sphere are untouched. Consider using `set(buffer, 0);` in advance.
     */
    public CLIJ2_DrawSphereBlock() {
        super(new DrawSphere());
    }

}
