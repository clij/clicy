package net.haesleinhuepf.clicy;

import icy.image.IcyBufferedImage;
import icy.preferences.WorkspaceLocalPreferences;
import icy.sequence.Sequence;
import icy.workspace.WorkspaceLoader;
import ij.gui.WaitForUserDialog;
import net.haesleinhuepf.clicy.converters.ClearCLBufferToIcyBufferedImageConverter;
import net.haesleinhuepf.clicy.converters.ClearCLBufferToSequenceConverter;
import net.haesleinhuepf.clicy.converters.IcyBufferedImageToClearCLBufferConverter;
import net.haesleinhuepf.clicy.converters.SequenceToClearCLBufferConverter;
import net.haesleinhuepf.clij.CLIJ;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.coremem.enums.NativeTypeEnum;
import net.haesleinhuepf.clij.utilities.CLIJOps;
import net.haesleinhuepf.clij2.CLIJ2;

import java.io.*;

/**
 * The CLICY gateway.
 *
 * Author: haesleinhuepf
 *         August 2019
 */
public class CLICY extends CLIJ2 {
    private static CLICY instance;

    private CLICY(CLIJ clij) {
        super(clij);
        this.clij = clij;
    }


    public static CLICY getInstance() {
        if (instance == null) {
            instance = new CLICY(CLIJ.getInstance());
        }
        return instance;
    }

    public static CLICY getInstance(String id) {
        if (instance == null) {
            instance = new CLICY(CLIJ.getInstance(id));
        }
        return instance;
    }

    public ClearCLBuffer pushSequence(Sequence sequence) {
        SequenceToClearCLBufferConverter converter = new SequenceToClearCLBufferConverter();
        converter.setCLIJ(clij);
        return converter.convert(sequence);
                //clij.convert(sequence, ClearCLBuffer.class);
    }

    public ClearCLBuffer pushIcyBufferedImage(IcyBufferedImage image) {
        IcyBufferedImageToClearCLBufferConverter converter = new IcyBufferedImageToClearCLBufferConverter();
        converter.setCLIJ(clij);
        return converter.convert(image);
    }

    public Sequence pullSequence(ClearCLBuffer buffer) {
        ClearCLBufferToSequenceConverter converter = new ClearCLBufferToSequenceConverter();
        converter.setCLIJ(clij);
        return converter.convert(buffer);
                //clij.convert(buffer, Sequence.class);
    }

    public IcyBufferedImage pullIcyBufferedImage(ClearCLBuffer buffer) {
        ClearCLBufferToIcyBufferedImageConverter converter = new ClearCLBufferToIcyBufferedImageConverter();
        converter.setCLIJ(clij);
        return converter.convert(buffer);
    }

    public ClearCLBuffer create(long[] dimensions, NativeTypeEnum type) {
        return clij.create(dimensions, type);
    }

    public ClearCLBuffer create(ClearCLBuffer buffer) {
        return clij.create(buffer);
    }

    //public CLIJOps op() {
    //    return clij.op();
    //}

    public String getGPUName() {
        return clij.getGPUName();
    }
}
