package net.haesleinhuepf.clicy.converters;

import icy.image.IcyBufferedImage;
import icy.sequence.Sequence;
import icy.type.DataType;
import ij.IJ;
import ij.ImagePlus;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.converters.AbstractCLIJConverter;
import net.haesleinhuepf.clij.converters.CLIJConverterPlugin;
import net.haesleinhuepf.clij.converters.implementations.RandomAccessibleIntervalToClearCLBufferConverter;
import net.haesleinhuepf.clij.coremem.enums.NativeTypeEnum;
import net.imglib2.RandomAccessibleInterval;
import net.imglib2.img.display.imagej.ImageJFunctions;
import org.scijava.plugin.Plugin;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;

/**
 * Author: haesleinhuepf
 *         November 2019
 */
@Plugin(type = CLIJConverterPlugin.class)
public class IcyBufferedImageToClearCLBufferConverter extends AbstractCLIJConverter<IcyBufferedImage, ClearCLBuffer> {

    @Override
    public ClearCLBuffer convert(IcyBufferedImage source) {
        long[] dimensions = new long[2];

        dimensions[0] = source.getWidth();
        dimensions[1] = source.getHeight();

        long numberOfPixels = dimensions[0] * dimensions[1];
        int numberOfPixelsPerSlice = (int)(dimensions[0] * dimensions[1]);

        if (source.getSizeC() > 1) {
            dimensions = new long[3];
            dimensions[0] = source.getWidth();
            dimensions[1] = source.getHeight();
            dimensions[2] = source.getSizeC();
            numberOfPixels = numberOfPixels * dimensions[2];
        }

        //NativeTypeEnum type;
        if (source.getDataType_() == DataType.UBYTE) {
            ClearCLBuffer target = clij.createCLBuffer(dimensions, NativeTypeEnum.UnsignedByte);

            byte[] inputArray = new byte[(int) numberOfPixels];
            for (int c = 0; c < target.getDepth(); c++) {
                byte[] sourceArray = source.getDataXYAsByte(c);
                System.arraycopy(sourceArray, 0, inputArray, c * numberOfPixelsPerSlice, sourceArray.length);
            }
            ByteBuffer byteBuffer = ByteBuffer.wrap(inputArray);
            target.readFrom(byteBuffer, true);
            return target;

        } else if (source.getDataType_() == DataType.USHORT) {
            ClearCLBuffer target = clij.createCLBuffer(dimensions, NativeTypeEnum.UnsignedShort);

            long time = System.currentTimeMillis();
            short[] inputArray = new short[(int) numberOfPixels];
            for (int c = 0; c < target.getDepth(); c++) {
                short[] sourceArray = source.getDataXYAsShort(c);
                System.arraycopy(sourceArray, 0, inputArray, c * numberOfPixelsPerSlice, sourceArray.length);
            }

            ShortBuffer byteBuffer = ShortBuffer.wrap(inputArray);
            target.readFrom(byteBuffer, true);

            return target;
        } else  if (source.getDataType_() == DataType.FLOAT) {
            ClearCLBuffer target = clij.createCLBuffer(dimensions, NativeTypeEnum.Float);

            float[] inputArray = new float[(int) numberOfPixels];
            for (int c = 0; c < target.getDepth(); c++) {
                float[] sourceArray = source.getDataXYAsFloat(c);
                System.arraycopy(sourceArray, 0, inputArray, c * numberOfPixelsPerSlice, sourceArray.length);
            }
            FloatBuffer byteBuffer = FloatBuffer.wrap(inputArray);
            target.readFrom(byteBuffer, true);
            return target;
        } else {
            throw new IllegalArgumentException("CLICY converter doesn't support type " + source.getDataType_() + " yet.");
        }
    }

    @Override
    public Class<IcyBufferedImage> getSourceType() {
        return IcyBufferedImage.class;
    }

    @Override
    public Class<ClearCLBuffer> getTargetType() {
        return ClearCLBuffer.class;
    }
}
