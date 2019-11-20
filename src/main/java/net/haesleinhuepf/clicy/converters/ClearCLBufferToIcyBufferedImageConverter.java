package net.haesleinhuepf.clicy.converters;

import icy.image.IcyBufferedImage;
import icy.sequence.Sequence;
import icy.type.DataType;
import net.haesleinhuepf.clij.clearcl.ClearCLBuffer;
import net.haesleinhuepf.clij.converters.AbstractCLIJConverter;
import net.haesleinhuepf.clij.converters.CLIJConverterPlugin;
import net.haesleinhuepf.clij.coremem.enums.NativeTypeEnum;
import org.scijava.plugin.Plugin;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/**
 * Author: haesleinhuepf
 *         August 2019
 */
@Plugin(type = CLIJConverterPlugin.class)
public class ClearCLBufferToIcyBufferedImageConverter extends AbstractCLIJConverter<ClearCLBuffer, IcyBufferedImage> {

    @Override
    public IcyBufferedImage convert(ClearCLBuffer source) {
        long numberOfPixels = source.getWidth() * source.getHeight() * source.getDepth();
        int numberOfPixelsPerPlane = (int) (source.getWidth() * source.getHeight());
        int depth = (int) source.getDepth();

        DataType dataType;
        if (source.getNativeType() == NativeTypeEnum.UnsignedByte) {
            dataType = DataType.UBYTE;
        } else if (source.getNativeType() == NativeTypeEnum.UnsignedShort) {
            dataType = DataType.USHORT;
        } else if (source.getNativeType() == NativeTypeEnum.Float) {
            dataType = DataType.FLOAT;
        } else {
            throw new IllegalArgumentException("Datatype " + source.getNativeType() + " is not supported by CLICY yet.");
        }

        if (source.getNativeType() == NativeTypeEnum.UnsignedByte) {
            byte[] array = new byte[(int) numberOfPixels];
            ByteBuffer buffer = ByteBuffer.wrap(array);
            source.writeTo(buffer, true);

            IcyBufferedImage image = new IcyBufferedImage((int)source.getWidth(), (int)source.getHeight(), (int)source.getDepth(), dataType);
            for (int c = 0; c < depth; c++) {
                byte[] sliceArray = new byte[numberOfPixelsPerPlane];
                System.arraycopy(array, c * numberOfPixelsPerPlane, sliceArray, 0, sliceArray.length);
                image.setDataXYAsByte(c, sliceArray);
            }
            return image;
        } else if (source.getNativeType() == NativeTypeEnum.UnsignedShort) {
            short[] array = new short[(int) numberOfPixels];
            ShortBuffer buffer = ShortBuffer.wrap(array);
            source.writeTo(buffer, true);

            IcyBufferedImage image = new IcyBufferedImage((int)source.getWidth(), (int)source.getHeight(), (int)source.getDepth(),dataType);
            for (int c = 0; c < depth; c++) {
                short[] sliceArray = new short[numberOfPixelsPerPlane];
                System.arraycopy(array, c * numberOfPixelsPerPlane, sliceArray, 0, sliceArray.length);
                image.setDataXYAsShort(c, sliceArray);
            }
            return image;
        } else if (source.getNativeType() == NativeTypeEnum.Float) {
            float[] array = new float[(int) numberOfPixels];
            FloatBuffer buffer = FloatBuffer.wrap(array);
            source.writeTo(buffer, true);

            IcyBufferedImage image = new IcyBufferedImage((int)source.getWidth(), (int)source.getHeight(), (int)source.getDepth(),dataType);
            for (int c = 0; c < depth; c++) {
                float[] sliceArray = new float[numberOfPixelsPerPlane];
                System.arraycopy(array, c * numberOfPixelsPerPlane, sliceArray, 0, sliceArray.length);
                image.setDataXYAsFloat(c, sliceArray);
            }
            return image;
        } else {
            throw new IllegalArgumentException("CLICY doesn't support converting " + source.getNativeType() + " images yet.");
        }
    }

    @Override
    public Class<ClearCLBuffer> getSourceType() {
        return ClearCLBuffer.class;
    }

    @Override
    public Class<IcyBufferedImage> getTargetType() {
        return IcyBufferedImage.class;
    }
}
