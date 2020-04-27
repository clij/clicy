package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.MeanSliceBySliceSphere;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_MeanSliceBySliceSphereBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes the local mean average of a pixels ellipsoidal 2D neighborhood in an image stack 
     * slice by slice. 
     * 
     * The ellipses size is specified by its half-width and half-height (radius).
     * 
     * This filter is applied slice by slice in 2D.
     */
    public CLIJ2_MeanSliceBySliceSphereBlock() {
        super(new MeanSliceBySliceSphere());
    }

}
