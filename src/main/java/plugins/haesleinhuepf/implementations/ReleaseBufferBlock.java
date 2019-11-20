package plugins.haesleinhuepf.implementations;

import net.haesleinhuepf.clicy.CLICY;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.macro.modules.Release;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.VarString;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import plugins.haesleinhuepf.VarClearCLBuffer;

public class ReleaseBufferBlock extends AbstractCLIJxBlock {

    VarString clijInstanceName;
    VarClearCLBuffer input;

    public ReleaseBufferBlock() {
        super(new Release());

        clijInstanceName = new VarString("", "");
        input = new VarClearCLBuffer("input");
    }

    @Override
    public void declareInput(VarList varList) {
        varList.add("input", input);
    }

    @Override
    public void declareOutput(VarList varList) {
    }

    @Override
    public void run() {
        CLICY clijx = CLICY.getInstance(clijInstanceName.getValue());
        ClearCLBuffer buffer = input.getValue();
        clijx.release(buffer);
    }
}
