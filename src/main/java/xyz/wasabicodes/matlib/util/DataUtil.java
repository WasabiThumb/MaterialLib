package io.github.wasabithumb.matlib.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.UnsafeValues;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

import java.lang.reflect.Method;
import java.util.function.BiConsumer;
import java.util.function.Function;

public final class DataUtil {

    private static Function<Block, Byte> getBlockData;
    static {
        Class<? extends Block> c = Block.class;
        try {
            Method m = c.getMethod("getData");
            getBlockData = (Block b) -> {
                try {
                    Object ob = m.invoke(b);
                    return (byte) ob;
                } catch (Exception ignored) { }
                return (byte) 0;
            };
        } catch (NoSuchMethodException e) {
            getBlockData = (Block b) -> (byte) 0;
        }
    }

    private static BiConsumer<Block, Byte> setBlockData;
    static {
        Class<? extends Block> c = Block.class;
        try {
            Method m = c.getMethod("setData", byte.class);
            setBlockData = (block, aByte) -> {
                try {
                    m.invoke(block, aByte);
                } catch (Exception ignored) { }
            };
        } catch (NoSuchMethodException e) {
            try {
                UnsafeValues unsafe = Bukkit.getUnsafe();
                Class<? extends UnsafeValues> c1 = unsafe.getClass();
                Class<?> c2 = Class.forName("org.bukkit.block.data.BlockData");
                Method m1 = c1.getMethod("fromLegacy", Material.class, byte.class);
                Method m2 = c.getMethod("setBlockData", c2);
                setBlockData = (block, aByte) -> {
                    try {
                        Object bd = m1.invoke(unsafe, block.getType(), aByte);
                        m2.invoke(block, c2.cast(bd));
                    } catch (ReflectiveOperationException | ClassCastException ignored) { }
                };
            } catch (NoSuchMethodException | ClassNotFoundException e1) {
                setBlockData = ((block, aByte) -> {});
            }
        }
    }

    public static byte getData(Block block) {
        return getBlockData.apply(block);
    }

    public static void setData(Block block, byte data) {
        setBlockData.accept(block, data);
    }

    public static byte getData(ItemStack itemStack) {
        MaterialData md = itemStack.getData();
        if (md == null) return (byte) 0;
        return md.getData();
    }

    public static void setData(ItemStack itemStack, byte data) {
        MaterialData md = itemStack.getData();
        if (md == null) {
            md = itemStack.getType().getNewData(data);
        } else {
            md.setData(data);
        }
        itemStack.setData(md);
    }

    public static short getDurability(ItemStack itemStack) {
        return itemStack.getDurability();
    }

    public static void setDurability(ItemStack itemStack, short durability) {
        itemStack.setDurability(durability);
    }

}
