package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ExcludeLabels;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ExcludeLabelsBlock extends AbstractCLIJ2Block {
   
    /**
     * This operation removes labels from a labelmap and renumbers the remaining labels. 
     * 
     * Hand over a binary flag list vector starting with a flag for the background, continuing with label1, label2, ...
     * 
     * For example if you pass 0,1,0,0,1: Labels 1 and 4 will be removed (those with a 1 in the vector will be excluded). Labels 2 and 3 will be kept and renumbered to 1 and 2.
     */
    public CLIJ2_ExcludeLabelsBlock() {
        super(new ExcludeLabels());
    }

}
