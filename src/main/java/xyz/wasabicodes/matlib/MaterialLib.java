package xyz.wasabicodes.matlib;

import xyz.wasabicodes.matlib.struct.MetaMaterial;
import xyz.wasabicodes.matlib.struct.map.impl.*;
import xyz.wasabicodes.matlib.struct.map.MaterialMap;
import xyz.wasabicodes.matlib.struct.map.proxy.ProxiedMaterialMap;
import xyz.wasabicodes.matlib.struct.map.reverse.ReverseMaterialMap;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import static xyz.wasabicodes.matlib.util.Version.isVersion;

public class MaterialLib {

    private static final MaterialMap mMap;
    private static final ReverseMaterialMap rmMap;
    static {
        MaterialMap base;
        if (isVersion(15)) {
            base = new MaterialMapImpl();
        } else if (isVersion(14)) {
            base = new MaterialMapImpl1_14();
        } else if (isVersion(13)) {
            base = new MaterialMapImpl1_13();
        } else if (isVersion(12)) {
            base = new MaterialMapImpl1_12();
        } else if (isVersion(11)) {
            base = new MaterialMapImpl1_11();
        } else if (isVersion(10)) {
            base = new MaterialMapImpl1_10();
        } else if (isVersion(9)) {
            base = new MaterialMapImpl1_9();
        } else {
            base = new MaterialMapImpl1_8();
        }
        mMap = isVersion(20) ? base : new ProxiedMaterialMap(base);
        rmMap = new ReverseMaterialMap(mMap);
    }

    /**
     * Gets the material map for the current version of Minecraft.
     * This map associates string names of materials that do not exist in the current version
     * to MetaMaterials that may or may not be an accurate representation of the
     * equivalent material.
     * @return The material map
     */
    public static @NotNull MaterialMap getMap() {
        return mMap;
    }

    @Contract("null -> null; !null -> _")
    public static MetaMaterial getMaterial(String name) {
        if (name == null) return null;
        Material m;
        if (isVersion(13)) {
            m = Material.matchMaterial(name);
            if (m != null) {
                return new MetaMaterial(m);
            }
        } else {
            if (name.startsWith("LEGACY_")) return getMaterial(name.substring(7));
        }
        MetaMaterial mm;
        mm = mMap.get(name);
        if (mm != null) return mm;
        if (!isVersion(13)) {
            m = Material.matchMaterial(name);
            if (m != null) {
                return new MetaMaterial(m);
            }
        }
        return null;
    }

    @Contract("null -> null; !null -> new")
    public static MetaMaterial getMaterial(Material material) {
        if (material == null) return null;
        return new MetaMaterial(material);
    }

    @Contract("null -> null; !null -> _")
    public static MetaMaterial getMaterial(Block block) {
        if (block == null) return null;
        MetaMaterial mm = rmMap.get(block);
        if (mm == null) mm = getMaterial(block.getType().name());
        return mm;
    }

    @Contract("null -> null; !null -> _")
    public static MetaMaterial getMaterial(ItemStack is) {
        if (is == null) return null;
        MetaMaterial mm = rmMap.get(is);
        if (mm == null) mm = getMaterial(is.getType().name());
        return mm;
    }

}
