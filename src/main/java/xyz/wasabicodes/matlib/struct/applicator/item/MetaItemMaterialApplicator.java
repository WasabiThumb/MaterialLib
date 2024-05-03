package xyz.wasabicodes.matlib.struct.applicator.item;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.ApiStatus;

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

    public Consumer<ItemMeta> getMetaTransformer() {
        return this.metaConsumer;
    }

    @Override
    public void accept(ItemStack itemStack) {
        itemStack.setType(getMaterial());
        ItemMeta meta = itemStack.getItemMeta();
        if (meta == null) meta = Bukkit.getItemFactory().getItemMeta(getMaterial());
        if (meta == null) return;
        this.metaConsumer.accept(meta);
        itemStack.setItemMeta(meta);
    }

}
