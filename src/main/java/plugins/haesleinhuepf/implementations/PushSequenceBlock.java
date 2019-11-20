package plugins.haesleinhuepf.implementations;

import icy.sequence.Sequence;
import net.haesleinhuepf.clicy.CLICY;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.macro.modules.Push;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.VarSequence;
import plugins.adufour.vars.lang.VarString;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import plugins.haesleinhuepf.VarClearCLBuffer;

public class PushSequenceBlock extends AbstractCLIJxBlock {
    VarString clijInstanceName;
    VarSequence input;
    VarClearCLBuffer output;

    public PushSequenceBlock() {
        super(new Push());

        clijInstanceName = new VarString("", "");
        input = new VarSequence("input", new Sequence());
        output = new VarClearCLBuffer("input");
    }

    @Override
    public void declareInput(VarList varList) {
        varList.add("input", input);
    }

    @Override
    public void declareOutput(VarList varList) {
        varList.add("output", output);
    }

    @Override
    public void run() {
        CLICY clijx = CLICY.getInstance(clijInstanceName.getValue());
        ClearCLBuffer buffer = clijx.pushSequence(input.getValue());
        output.setValue(buffer);
    }
}
