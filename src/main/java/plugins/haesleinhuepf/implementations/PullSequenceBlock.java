package plugins.haesleinhuepf.implementations;

import icy.sequence.Sequence;
import net.haesleinhuepf.clicy.CLICY;
import net.haesleinhuepf.clij.macro.modules.Pull;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.VarSequence;
import plugins.adufour.vars.lang.VarString;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import plugins.haesleinhuepf.VarClearCLBuffer;

public class PullSequenceBlock extends AbstractCLIJxBlock {
    VarString clijInstanceName;
    VarSequence output;
    VarClearCLBuffer input;

    public PullSequenceBlock() {
        super(new Pull());

        clijInstanceName = new VarString("", "");
        output = new VarSequence("input", new Sequence());
        input = new VarClearCLBuffer("input");
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
        Sequence sequence = clijx.pullSequence(input.getValue());
        output.setValue(sequence);
    }
}
