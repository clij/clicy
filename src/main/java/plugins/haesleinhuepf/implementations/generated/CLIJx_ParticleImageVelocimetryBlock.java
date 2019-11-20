package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.piv.ParticleImageVelocimetry;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_ParticleImageVelocimetryBlock extends AbstractCLIJxBlock {
   
    /**
     * For every pixel in source image 1, determine the pixel with the most similar intensity in 
     *  the local neighborhood with a given radius in source image 2. Write the distance in 
     * X and Y in the two corresponding destination images.
     */
    public CLIJx_ParticleImageVelocimetryBlock() {
        super(new ParticleImageVelocimetry());
    }

}
