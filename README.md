# clicy
 
clicy is a bridge between [Icy](http://icy.bioimageanalysis.org/) and [clij](https://clij.github.io/).

![Image](images/clicy-screenshot.png)

Right now, this is very preliminary.

## Introduction
For scripting GPU-accelerated workflows in Icy using JavaScript, you should first initalize the GPU: 

```javascript
importClass(net.haesleinhuepf.clicy.CLICY);
importClass(Packages.icy.main.Icy);

// init clicy
clij2 = CLICY.getInstance();
// check which GPU we're using
print(clij2.getGPUName());
```

Then, you can push sequences to GPU memory and allocate space for more images:
```
// get current image from Icy
sequence = getSequence();

// push image to GPU
inputBuffer = clij2.pushSequence(sequence);
// allocate memory on GPU for the result
outputBuffer = clij2.create(inputBuffer);
```

You can process them using the [CLIJ2 API](https://clij.github.io/clij2-docs/reference):
```javascript
// process image on GPU
clij2.gaussianBlur(inputBuffer, outputBuffer, 5, 5);
```

Afterwards, pull the result back and show it in Icy:
```javascript
// pull result back from GPU
output = clij2.pullSequence(outputBuffer);

// Show result
Icy.addSequence(output);
```

By the end, always clean up GPU memory:
```javascript
// free memory of specific images
clij2.release(inputBuffer);

// clean up all images
clij2.clear():
```
 

## Installation
[Download Icy](http://icy.bioimageanalysis.org/download/). Enter "clicy" in Icys search field on top and click on install. Voilá. 

If you want to have the ClIcy toolbar as well, run the "InstallClicyToolbar" plugin:

![Image](images/install-toolbar.png)

Afterwards, a message should appear:

![Image](images/install-toolbar2.png)

After restarting Icy, you should see the toolbar:

![Image](images/install-toolbar3.png)


## Examples
It is recommmended to record workflows with the clij2 Recorder by calling Operations from the menu:
<iframe src="images/clicy_recorder.mp4" width="540" height="310"></iframe>
[Download video](images/clicy_recorder.mp4)

Example code for Icys script editor can be found in the [javascript](https://github.com/clij/clicy/tree/master/src/main/javascript) directory. 
Example Icy protocols can be found in the [protocols](https://github.com/clij/clicy/tree/master/src/main/protocols) directory. 
Also feel free to copy paste from the [CLIJ2 documentation](https://github.com/clij/clij2-docs/reference), it contains Icy code snippets.

## Please note
clicy is under testing right now. Release is planned in June 2020. Please report any issues. Feedback is very welcome!
Thanks for your support!

[Back to CLIJ documentation](https://clij.github.io/)

[Imprint](https://clij.github.io/imprint)
