package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.GenerateParametricImage;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_GenerateParametricImageBlock extends AbstractCLIJ2Block {
   
    /**
     * Take a labelmap and a vector of values to replace label 1 with the 1st value in the vector. 
     * 
     * Note that indexing in the vector starts at zero. The 0th entry corresponds to background in the label map.Internally this method just calls ReplaceIntensities.
     * 
     */
    public CLIJ2_GenerateParametricImageBlock() {
        super(new GenerateParametricImage());
    }

}
