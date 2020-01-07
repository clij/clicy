package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.io.WriteXYZPointListToDisc;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_WriteXYZPointListToDiscBlock extends AbstractCLIJxBlock {
   
    /**
     * Takes a point list image representing n points (n*2 for 2D points, n*3 for 3D points) and exports them in XYZ format.
     */
    public CLIJx_WriteXYZPointListToDiscBlock() {
        super(new WriteXYZPointListToDisc());
    }

}
