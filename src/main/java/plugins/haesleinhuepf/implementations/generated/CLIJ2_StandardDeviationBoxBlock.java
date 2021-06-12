package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.StandardDeviationBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_StandardDeviationBoxBlock extends AbstractCLIJ2Block {
   
    /**
     * Computes the local standard deviation of a pixels box neighborhood. 
     * 
     * The box size is specified by 
     * its half-width, half-height and half-depth (radius). If 2D images are given, radius_z will be ignored. 
     */
    public CLIJ2_StandardDeviationBoxBlock() {
        super(new StandardDeviationBox());
    }

}
