package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clijx.weka.TrainWekaModel;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_TrainWekaModelBlock extends AbstractCLIJxBlock {
   
    /**
     * Trains a Weka model using functionality of Fijis Trainable Weka Segmentation plugin.
     * It takes a 3D feature stack (e.g. first plane original image, second plane blurred, third plane edge image)and trains a Weka model. This model will be saved to disc.
     * The given groundTruth image is supposed to be a label map where pixels with value 1 represent class 1, pixels with value 2 represent class 2 and so on. Pixels with value 0 will be ignored for training.
     */
    public CLIJx_TrainWekaModelBlock() {
        super(new TrainWekaModel());
    }

}
