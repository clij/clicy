package plugins.haesleinhuepf.implementations;

import ij.IJ;

public class CLIJ2_Log extends CLIJ2_MessagePrompt {
    @Override
    public void run() {
        IJ.log(headline.getValueAsString() + "\n\n" + message.getValueAsString() + "\n\n" + string.getValueAsString() + "\n\n" + number.getValue());
    }
}
