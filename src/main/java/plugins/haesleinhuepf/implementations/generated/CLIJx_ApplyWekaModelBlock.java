package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.weka.ApplyWekaModel;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_ApplyWekaModelBlock extends AbstractCLIJxBlock {
   
    /**
     * Applies a Weka model using functionality of Fijis Trainable Weka Segmentation plugin.
     * It takes a 3D feature stack (e.g. first plane original image, second plane blurred, third plane edge image)and applies a pre-trained a Weka model. Take care that the feature stack has been generated in the sameway as for training the model!
     */
    public CLIJx_ApplyWekaModelBlock() {
        super(new ApplyWekaModel());
    }

}
