package io.github.wasabithumb.matlib.struct.applicator.item;

import io.github.wasabithumb.matlib.util.DataUtil;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class DataItemMaterialApplicator extends ItemMaterialApplicator {

    private final byte data;
    public DataItemMaterialApplicator(Material material, byte data) {
        super(material);
        this.data = data;
    }

    public DataItemMaterialApplicator(String materialName, byte data) {
        this(Material.matchMaterial(materialName), data);
    }

    public byte getData() {
        return data;
    }

    @Override
    public void accept(ItemStack itemStack) {
        itemStack.setType(getMaterial());
        DataUtil.setData(itemStack, data);
    }

}
