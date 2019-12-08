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
clijx = CLICY.getInstance();
print(clijx.getGPUName());

// get current image from Icy
sequence = getSequence();

// push image to GPU
inputBuffer = clijx.pushSequence(sequence);
// allocate memory on GPU for the result
outputBuffer = clijx.create(inputBuffer);

// process image on GPU
clijx.blur(inputBuffer, outputBuffer, 5, 5);

// pull result back from GPU
output = clijx.pullSequence(outputBuffer);

// Show result
Icy.addSequence(output);

// free memory of specific images
clijx.release(inputBuffer);

// clean up all images
clijx.clear();

