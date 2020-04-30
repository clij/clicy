package plugins.haesleinhuepf.implementations;

import net.haesleinhuepf.clicy.CLICY;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.macro.modules.Release;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.VarString;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import plugins.haesleinhuepf.VarClearCLBuffer;

public class CLIJ2_ReleaseBufferBlock extends AbstractCLIJ2Block {

    VarString clijInstanceName;
    VarClearCLBuffer input;

    public CLIJ2_ReleaseBufferBlock() {
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
        CLICY clij2 = CLICY.getInstance(clijInstanceName.getValue());
        ClearCLBuffer buffer = input.getValue();
        clij2.release(buffer);
    }
}
