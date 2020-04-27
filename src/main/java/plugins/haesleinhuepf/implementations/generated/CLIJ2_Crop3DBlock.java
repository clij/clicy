package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij.macro.modules.Crop3D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_Crop3DBlock extends AbstractCLIJ2Block {
   
    /**
     * Crops a given sub-stack out of a given image stack.
     * 
     * Note: If the destination image pre-exists already, it will be overwritten and keep it's dimensions.
     */
    public CLIJ2_Crop3DBlock() {
        super(new Crop3D());
    }

}
