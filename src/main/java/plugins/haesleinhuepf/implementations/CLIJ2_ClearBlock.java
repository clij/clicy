package plugins.haesleinhuepf.implementations;

import net.haesleinhuepf.clicy.CLICY;
import net.haesleinhuepf.clij.macro.modules.Clear;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.VarString;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import plugins.haesleinhuepf.VarClearCLBuffer;

public class CLIJ2_ClearBlock extends AbstractCLIJ2Block {

    VarString clijInstanceName;

    public CLIJ2_ClearBlock() {
        super(new Clear());

        clijInstanceName = new VarString("", "");
    }

    @Override
    public void declareInput(VarList varList) {
        varList.add("input", new VarClearCLBuffer("input"));
    }

    @Override
    public void declareOutput(VarList varList) {
        varList.add("output", new VarClearCLBuffer("output"));
    }

    @Override
    public void run() {
        CLICY clij2 = CLICY.getInstance(clijInstanceName.getValue());
        clij2.clear();
    }
}
