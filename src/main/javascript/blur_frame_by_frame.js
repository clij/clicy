// blur_frame_by_frame.js
//
// This example javascript shows how to blur 
// a 2D+channel+time sequence frame by frame 
// in ICY using CLICY.
//
// Author: Robert Haase, rhaase@mpi-cbg.de
//         November 2019
// ---------------------------------


importClass(Packages.icy.sequence.Sequence)
importClass(net.haesleinhuepf.clicy.CLICY);
importClass(Packages.icy.main.Icy);

// config
blur_sigma_x = 5;
blur_sigma_y = 5;
blur_sigma_c = 0; // don't blur between channels

// get current image from Icy
sequence = getSequence();

// init clicy
clijx = CLICY.getInstance();
println(clijx.getGPUName());

// get all images
println(sequence);
images = sequence.getAllImage();

// generate a new sequence
outputSequence = new Sequence();

blurredBuffer = null;

// go through the sequence frame by frame
for (timepoint = 0; timepoint < images.size(); timepoint++) {
	// push image to GPU
	inputBuffer = clijx.pushIcyBufferedImage(images.get(timepoint));
	
	// allocate memory on GPU for the result
	if (blurredBuffer == null) {
		blurredBuffer = clijx.create(inputBuffer);
	}
	
	// process image on GPU
	clijx.blur(inputBuffer, blurredBuffer, blur_sigma_x, blur_sigma_y, blur_sigma_c);
	
	// pull result back from GPU
	outputImage = clijx.pullIcyBufferedImage(blurredBuffer);

	// add it to the new sequence
	outputSequence.addImage(timepoint, outputImage);

	inputBuffer.close();
}

// show result
output0 = outputSequence;
Icy.addSequence(output0);

// clean up
blurredBuffer.close();

print("Bye");
