package codes.wasabi.matlib.struct.applicator.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

public class DataItemMaterialApplicator extends ItemMaterialApplicator {

    private final byte data;
    public DataItemMaterialApplicator(Material material, byte data) {
        super(material);
        this.data = data;
    }

    public DataItemMaterialApplicator(String materialName, byte data) {
        this(Material.matchMaterial(materialName), data);
    }

    @Override
    public void accept(ItemStack itemStack) {
        itemStack.setType(getMaterial());
        MaterialData md = itemStack.getData();
        if (md == null) {
            md = itemStack.getType().getNewData(data);
        } else {
            md.setData(data);
        }
        itemStack.setData(md);
    }

}
