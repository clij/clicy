package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.CenterOfMass;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_CenterOfMassBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the center of mass of an image or image stack. 
     * 
     * It writes the result in the results table
     * in the columns MassX, MassY and MassZ.
     */
    public CLIJ2_CenterOfMassBlock() {
        super(new CenterOfMass());
    }

}
