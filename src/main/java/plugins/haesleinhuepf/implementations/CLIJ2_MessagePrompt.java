package plugins.haesleinhuepf.implementations;

import ij.gui.WaitForUserDialog;
import net.haesleinhuepf.clicy.CLICY;
import net.haesleinhuepf.clij.macro.modules.Clear;
import plugins.adufour.blocks.util.VarList;
import plugins.adufour.vars.lang.VarDouble;
import plugins.adufour.vars.lang.VarNumber;
import plugins.adufour.vars.lang.VarString;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import plugins.haesleinhuepf.VarClearCLBuffer;

public class CLIJ2_MessagePrompt extends AbstractCLIJ2Block {

    VarString clijInstanceName;

    VarString headline = new VarString("Headline", "");
    VarString message = new VarString("Message", "");
    VarString string = new VarString("String", "");
    VarDouble number  = new VarDouble("Number", 0);

    public CLIJ2_MessagePrompt() {
        super(new Clear());

        clijInstanceName = new VarString("", "");
    }

    @Override
    public void declareInput(VarList varList) {
        varList.add(headline.getName(), headline);
        varList.add(message.getName(), message);
        varList.add(string.getName(), string);
        varList.add(number.getName(), number);
    }

    @Override
    public void declareOutput(VarList varList) {

    }

    @Override
    public void run() {
        new WaitForUserDialog(headline.getValueAsString(), message.getValueAsString() + "\n\n" + string.getValueAsString() + "\n\n" + number.getValue()).show();
    }
}
