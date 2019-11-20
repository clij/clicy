package plugins.haesleinhuepf;

import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import plugins.adufour.vars.lang.Var;

public class VarClearCLBuffer extends Var<ClearCLBuffer> {
    public VarClearCLBuffer(String name) {
        super(name, ClearCLBuffer.class);
    }
}
