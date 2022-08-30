package codes.wasabi.matlib.struct.applicator.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class BasicItemMaterialApplicator extends ItemMaterialApplicator {

    public BasicItemMaterialApplicator(Material material) {
        super(material);
    }

    public BasicItemMaterialApplicator(String materialName) {
        super(materialName);
    }

    @Override
    public void accept(ItemStack itemStack) {
        itemStack.setType(getMaterial());
    }

}
