package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.WriteValuesToPositions;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_WriteValuesToPositionsBlock extends AbstractCLIJ2Block {
   
    /**
     * Takes an image with three/four rows (2D: height = 3; 3D: height = 4): x, y [, z] and v and target image. 
     * 
     * The value v will be written at position x/y[/z] in the target image.
     */
    public CLIJ2_WriteValuesToPositionsBlock() {
        super(new WriteValuesToPositions());
    }

}
