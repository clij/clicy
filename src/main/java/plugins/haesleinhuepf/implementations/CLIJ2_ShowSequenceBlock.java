package plugins.haesleinhuepf.implementations;

import icy.main.Icy;
import icy.sequence.Sequence;
import net.haesleinhuepf.clicy.CLICY;
import net.haesleinhuepf.clij.macro.modules.Pull;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.VarString;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import plugins.haesleinhuepf.VarClearCLBuffer;

public class CLIJ2_ShowSequenceBlock extends AbstractCLIJ2Block {
    VarString clijInstanceName;
    VarClearCLBuffer input;

    public CLIJ2_ShowSequenceBlock() {
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
        CLICY clij2 = CLICY.getInstance(clijInstanceName.getValue());
        Sequence sequence = clij2.pullSequence(input.getValue());
        Icy.getMainInterface().addSequence(sequence);
    }
}
