package io.github.wasabithumb.matlib.struct.applicator.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;

public abstract class ItemMaterialApplicator implements Consumer<ItemStack> {

    private final Material material;
    public ItemMaterialApplicator(Material material) {
        this.material = material;
    }

    public ItemMaterialApplicator(String materialName) {
        this(Material.matchMaterial(materialName));
    }

    public final Material getMaterial() {
        return material;
    }

}
