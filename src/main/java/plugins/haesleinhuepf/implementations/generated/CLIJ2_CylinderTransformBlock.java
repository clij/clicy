package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.CylinderTransform;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_CylinderTransformBlock extends AbstractCLIJ2Block {
   
    /**
     * Applies a cylinder transform to an image stack assuming the center line goes in Y direction in the center of the stack.
     * 
     * This transforms an image stack from an XYZ coordinate system to a AYD coordinate system with 
     * A the angle around the center line, 
     * Y the original Y coordinate and 
     * D, the distance from the center.
     * 
     * Thus, going in virtual Z direction (actually D) in the resulting stack, you go from the center to theperiphery.
     */
    public CLIJ2_CylinderTransformBlock() {
        super(new CylinderTransform());
    }

}
