package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.ResliceRadial;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_ResliceRadialBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes a radial projection of an image stack. Starting point for the line is the given point in any 
     * X/Y-plane of a given input image stack. Furthermore, radius of the resulting projection must be given and scaling factors in X and Y in case pixels are not isotropic.This operation is similar to ImageJs 'Radial Reslice' method but offers less flexibility.
     */
    public CLIJx_ResliceRadialBlock() {
        super(new ResliceRadial());
    }

}
