package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ResliceRadialTop;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ResliceRadialTopBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes a radial projection of an image stack and reslices it from top. 
     * 
     * Starting point for the line is the given point in any 
     * X/Y-plane of a given input image stack. Furthermore, radius of the resulting projection must be given and scaling factors in X and Y in case pixels are not isotropic.This operation is similar to ImageJs 'Radial Reslice' method combined with 'Reslice from top' but offers less flexibility.
     */
    public CLIJ2_ResliceRadialTopBlock() {
        super(new ResliceRadialTop());
    }

}
