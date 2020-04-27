package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GetBoundingBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GetBoundingBoxBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the bounding box of all non-zero pixels in a binary image. 
     * 
     * If called from macro, the positions will be stored in the variables 'boundingBoxX', 'boundingBoxY', 'boundingBoxZ', 'boundingBoxWidth', 'boundingBoxHeight' and 'boundingBoxDepth'.In case of 2D images Z and depth will be zero.
     */
    public CLIJ2_GetBoundingBoxBlock() {
        super(new GetBoundingBox());
    }

}
