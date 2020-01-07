package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.io.WriteVTKLineListToDisc;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_WriteVTKLineListToDiscBlock extends AbstractCLIJxBlock {
   
    /**
     * Takes a point list image representing n points (n*2 for 2D points, n*3 for 3D points) and a corresponding touch matrix , sized (n+1)*(n+1), and exports them in VTK format.
     */
    public CLIJx_WriteVTKLineListToDiscBlock() {
        super(new WriteVTKLineListToDisc());
    }

}
