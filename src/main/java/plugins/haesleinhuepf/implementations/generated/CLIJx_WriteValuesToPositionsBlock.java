package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.advancedfilters.WriteValuesToPositions;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_WriteValuesToPositionsBlock extends AbstractCLIJxBlock {
   
    /**
     * Takes an image with three/four rows (2D: height = 3; 3D: height = 4): x, y [, z] and v and target image. The value v will be written at position x/y[/z] in the target image.
     */
    public CLIJx_WriteValuesToPositionsBlock() {
        super(new WriteValuesToPositions());
    }

}
