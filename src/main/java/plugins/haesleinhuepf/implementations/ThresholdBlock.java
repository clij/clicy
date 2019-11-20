package plugins.haesleinhuepf.implementations;

import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clij.macro.modules.AutomaticThreshold;

public class ThresholdBlock extends AbstractCLIJxBlock {
    public ThresholdBlock() {
        super(new AutomaticThreshold());
    }

}
