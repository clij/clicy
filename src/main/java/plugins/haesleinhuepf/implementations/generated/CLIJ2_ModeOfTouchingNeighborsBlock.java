package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ModeOfTouchingNeighbors;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ModeOfTouchingNeighborsBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes a touch matrix and a vector of values to determine the most popular integer value among touching neighbors for every object.
     * TODO: This only works for values between 0 and 255 for now.
     */
    public CLIJ2_ModeOfTouchingNeighborsBlock() {
        super(new ModeOfTouchingNeighbors());
    }

}
