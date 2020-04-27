package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.BoundingBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_BoundingBoxBlock extends AbstractCLIJ2Block {
   
    /**
     * Determines the bounding box of all non-zero pixels in a binary image. 
     * 
     * If called from macro, the positions will be stored in a new row of ImageJs Results table in the columns 'BoundingBoxX', 'BoundingBoxY', 'BoundingBoxZ', 'BoundingBoxWidth', 'BoundingBoxHeight' 'BoundingBoxDepth'.In case of 2D images Z and depth will be zero.
     */
    public CLIJ2_BoundingBoxBlock() {
        super(new BoundingBox());
    }

}
