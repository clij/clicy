package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.Rotate3D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_Rotate3DBlock extends AbstractCLIJ2Block {
   
    /**
     * Rotates an image stack in 3D. 
     * 
     * All angles are entered in degrees. If the image is not rotated around 
     * the center, it is rotated around the coordinate origin.
     * 
     * It is recommended to apply the rotation to an isotropic image stack.
     */
    public CLIJ2_Rotate3DBlock() {
        super(new Rotate3D());
    }

}
