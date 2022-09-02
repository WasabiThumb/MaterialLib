package xyz.wasabicodes.matlib.struct.applicator.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class DurabilityItemMaterialApplicator extends ItemMaterialApplicator {

    private final short durability;
    public DurabilityItemMaterialApplicator(Material material, short durability) {
        super(material);
        this.durability = durability;
    }

    public DurabilityItemMaterialApplicator(String materialName, short durability) {
        this(Material.matchMaterial(materialName), durability);
    }

    public short getDurability() {
        return durability;
    }

    @Override
    public void accept(ItemStack itemStack) {
        itemStack.setType(getMaterial());
        itemStack.setDurability(durability);
    }

}
