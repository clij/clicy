package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.AffineTransform2D;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_AffineTransform2DBlock extends AbstractCLIJ2Block {
   
    /**
     * Applies an affine transform to a 2D image.
     * 
     * The transform describes how coordinates in the target image are transformed to coordinates in the source image.
     * This may appear unintuitive and will be changed in the next major release. The replacement 
     * affineTransform (currently part of CLIJx) will apply inverted transforms compared to this operation.
     * Individual transforms must be separated by spaces.
     * Parameters
     * ----------
     * source : Image
     *     The input image to be processed.
     * destination : Image
     *     The output image where results are written into.
     * transform : String
     *     A space-separated list of individual transforms. Syntrax see below.
     * 
     * Supported transforms:
     * 
     * * -center: translate the coordinate origin to the center of the image
     * * center: translate the coordinate origin back to the initial origin
     * * rotate=[angle]: rotate in X/Y plane (around Z-axis) by the given angle in degrees
     * * scale=[factor]: isotropic scaling according to given zoom factor
     * * scaleX=[factor]: scaling along X-axis according to given zoom factor
     * * scaleY=[factor]: scaling along Y-axis according to given zoom factor
     * * shearXY=[factor]: shearing along X-axis in XY plane according to given factor
     * * translateX=[distance]: translate along X-axis by distance given in pixels
     * * translateY=[distance]: translate along X-axis by distance given in pixels
     * 
     * Example transform:
     * transform = "-center scale=2 rotate=45 center";
     */
    public CLIJ2_AffineTransform2DBlock() {
        super(new AffineTransform2D());
    }

}
