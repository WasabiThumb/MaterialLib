package codes.wasabi.matlib.struct.applicator.block;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class BasicBlockMaterialApplicator extends BlockMaterialApplicator {

    public BasicBlockMaterialApplicator(Material material) {
        super(material);
    }

    public BasicBlockMaterialApplicator(String materialName) {
        super(materialName);
    }

    @Override
    public void accept(Block block) {
        block.setType(getMaterial());
    }

}
