package plugins.haesleinhuepf.implementations;

import icy.main.Icy;
import icy.sequence.Sequence;
import net.haesleinhuepf.clicy.CLICY;
import net.haesleinhuepf.clij.macro.modules.Pull;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.VarSequence;
import plugins.adufour.vars.lang.VarString;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import plugins.haesleinhuepf.VarClearCLBuffer;

public class CLIJx_ShowSequenceBlock extends AbstractCLIJxBlock {
    VarString clijInstanceName;
    VarClearCLBuffer input;

    public CLIJx_ShowSequenceBlock() {
        super(new Pull());

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
        Sequence sequence = clijx.pullSequence(input.getValue());
        Icy.getMainInterface().addSequence(sequence);
    }
}
