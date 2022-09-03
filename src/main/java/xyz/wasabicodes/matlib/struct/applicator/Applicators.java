package xyz.wasabicodes.matlib.struct.applicator;

import xyz.wasabicodes.matlib.struct.applicator.block.*;
import xyz.wasabicodes.matlib.struct.applicator.item.*;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.Range;

import java.util.function.Consumer;

public class Applicators {

    public static BlockMaterialApplicator blockAir() {
        return new BasicBlockMaterialApplicator(Material.matchMaterial("AIR"));
    }

    public static BlockMaterialApplicator blockBasic(Material material) {
        return new BasicBlockMaterialApplicator(material);
    }

    public static BlockMaterialApplicator blockBasic(String material) {
        return new BasicBlockMaterialApplicator(material);
    }

    public static ItemMaterialApplicator itemBasic(Material material) {
        return new BasicItemMaterialApplicator(material);
    }

    public static ItemMaterialApplicator itemBasic(String material) {
        return new BasicItemMaterialApplicator(material);
    }

    public static BlockMaterialApplicator blockData(Material material, byte data) {
        return new DataBlockMaterialApplicator(material, data);
    }

    public static BlockMaterialApplicator blockData(String material, byte data) {
        return new DataBlockMaterialApplicator(material, data);
    }

    public static BlockMaterialApplicator blockData(Material material, @Range(from=Byte.MIN_VALUE, to=Byte.MAX_VALUE) int data) {
        return new DataBlockMaterialApplicator(material, (byte) data);
    }

    public static BlockMaterialApplicator blockData(String material, @Range(from=Byte.MIN_VALUE, to=Byte.MAX_VALUE) int data) {
        return new DataBlockMaterialApplicator(material, (byte) data);
    }

    public static ItemMaterialApplicator itemData(Material material, byte data) {
        return new DataItemMaterialApplicator(material, data);
    }

    public static ItemMaterialApplicator itemData(String material, byte data) {
        return new DataItemMaterialApplicator(material, data);
    }

    public static ItemMaterialApplicator itemData(Material material, @Range(from=Byte.MIN_VALUE, to=Byte.MAX_VALUE) int data) {
        return new DataItemMaterialApplicator(material, (byte) data);
    }

    public static ItemMaterialApplicator itemData(String material, @Range(from=Byte.MIN_VALUE, to=Byte.MAX_VALUE) int data) {
        return new DataItemMaterialApplicator(material, (byte) data);
    }

    public static ItemMaterialApplicator itemDurability(Material material, short durability) {
        return new DurabilityItemMaterialApplicator(material, durability);
    }

    public static ItemMaterialApplicator itemDurability(String material, short durability) {
        return new DurabilityItemMaterialApplicator(material, durability);
    }

    public static ItemMaterialApplicator itemMeta(Material material, Consumer<ItemMeta> consumer) {
        return new MetaItemMaterialApplicator(material, consumer);
    }

    public static ItemMaterialApplicator itemMeta(String material, Consumer<ItemMeta> consumer) {
        return new MetaItemMaterialApplicator(material, consumer);
    }

    public static <T extends ItemMeta> ItemMaterialApplicator itemMeta(Material material, Consumer<T> consumer, Class<T> clazz) {
        return new MetaItemMaterialApplicator(material, (ItemMeta meta) -> {
            if (clazz.isInstance(meta)) {
                consumer.accept(clazz.cast(meta));
            }
        });
    }

    public static <T extends ItemMeta> ItemMaterialApplicator itemMeta(String material, Consumer<T> consumer, Class<T> clazz) {
        return new MetaItemMaterialApplicator(material, (ItemMeta meta) -> {
            if (clazz.isInstance(meta)) {
                consumer.accept(clazz.cast(meta));
            }
        });
    }
    
}
