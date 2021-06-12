package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.SphereTransform;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_SphereTransformBlock extends AbstractCLIJ2Block {
   
    /**
     * Turns an image stack in XYZ cartesian coordinate system to an AID polar coordinate system.
     * 
     * A corresponds to azimut,I to inclination and D to the distance from the center.Thus, going in virtual Z direction (actually D) in the resulting stack, you go from the center to theperiphery.
     */
    public CLIJ2_SphereTransformBlock() {
        super(new SphereTransform());
    }

}
