package io.github.wasabithumb.matlib.struct.applicator.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.function.Consumer;

public class MetaItemMaterialApplicator extends ItemMaterialApplicator {

    private final Consumer<ItemMeta> metaConsumer;
    public MetaItemMaterialApplicator(Material material, Consumer<ItemMeta> metaConsumer) {
        super(material);
        this.metaConsumer = metaConsumer;
    }

    public MetaItemMaterialApplicator(String materialName, Consumer<ItemMeta> metaConsumer) {
        super(materialName);
        this.metaConsumer = metaConsumer;
    }

    @Override
    public void accept(ItemStack itemStack) {
        itemStack.setType(getMaterial());
        ItemMeta meta = itemStack.getItemMeta();
        metaConsumer.accept(meta);
        itemStack.setItemMeta(meta);
    }

}
