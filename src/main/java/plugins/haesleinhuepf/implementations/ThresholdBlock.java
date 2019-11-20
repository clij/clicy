package plugins.haesleinhuepf.implementations;

import plugins.haesleinhuepf.AbstractCLIJBlock;
import net.haesleinhuepf.clij.macro.modules.AutomaticThreshold;

public class ThresholdBlock extends AbstractCLIJBlock {
    public ThresholdBlock() {
        super(new AutomaticThreshold());
    }
}
