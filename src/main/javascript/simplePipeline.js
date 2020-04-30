// simplePipeline.js
//
// This script demonstrates how to use CLICY from Icys script editor.
//
// Author: Robert Haase, rhaase@mpi-cbg.de
//         August 2019
// -----------------------------------------

importClass(net.haesleinhuepf.clicy.CLICY);
importClass(Packages.icy.main.Icy);

// init clicy
clij2 = CLICY.getInstance();
print(clij2.getGPUName());

// get current image from Icy
sequence = getSequence();

// push image to GPU
inputBuffer = clij2.pushSequence(sequence);
// allocate memory on GPU for the result
outputBuffer = clij2.create(inputBuffer);

// process image on GPU
clij2.gaussianBlur2D(inputBuffer, outputBuffer, 5, 5);

// pull result back from GPU
output = clij2.pullSequence(outputBuffer);

// Show result
Icy.addSequence(output);

// free memory of specific images
clij2.release(inputBuffer);

// clean up all images
clij2.clear();

