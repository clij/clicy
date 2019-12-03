package plugins.haesleinhuepf.implementations;

import net.haesleinhuepf.clicy.CLICY;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.macro.modules.Clear;
import net.haesleinhuepf.clij.macro.modules.Release;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.VarString;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import plugins.haesleinhuepf.VarClearCLBuffer;

public class CLIJx_ClearBlock extends AbstractCLIJxBlock {

    VarString clijInstanceName;

    public CLIJx_ClearBlock() {
        super(new Clear());

        clijInstanceName = new VarString("", "");
    }

    @Override
    public void declareInput(VarList varList) {}

    @Override
    public void declareOutput(VarList varList) {}

    @Override
    public void run() {
        CLICY clijx = CLICY.getInstance(clijInstanceName.getValue());
        clijx.clear();
    }
}
