package codes.wasabi.matlib.struct.applicator.block;

import org.bukkit.Material;
import org.bukkit.block.Block;

import java.util.function.Consumer;

public abstract class BlockMaterialApplicator implements Consumer<Block> {

    private final Material material;
    public BlockMaterialApplicator(Material material) {
        this.material = material;
    }

    public BlockMaterialApplicator(String materialName) {
        this(Material.matchMaterial(materialName));
    }

    public final Material getMaterial() {
        return material;
    }

}
