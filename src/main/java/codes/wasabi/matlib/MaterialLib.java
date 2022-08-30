package codes.wasabi.matlib;

import codes.wasabi.matlib.struct.MetaMaterial;
import codes.wasabi.matlib.struct.map.MaterialMap;
import org.bukkit.Material;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import static codes.wasabi.matlib.util.Version.isVersion;

public class MaterialLib {

    private static final MaterialMap mMap;
    static {
        if (isVersion(19)) {
            mMap = new MaterialMap();
        } else if (isVersion(18)) {
            mMap = new codes.wasabi.matlib.struct.map.MaterialMap1_18();
        } else if (isVersion(17)) {
            mMap = new codes.wasabi.matlib.struct.map.MaterialMap1_17();
        } else if (isVersion(16)) {
            mMap = new codes.wasabi.matlib.struct.map.MaterialMap1_16();
        } else if (isVersion(15)) {
            mMap = new codes.wasabi.matlib.struct.map.MaterialMap1_15();
        } else if (isVersion(14)) {
            mMap = new codes.wasabi.matlib.struct.map.MaterialMap1_14();
        } else if (isVersion(13)) {
            mMap = new codes.wasabi.matlib.struct.map.MaterialMap1_13();
        } else if (isVersion(12)) {
            mMap = new codes.wasabi.matlib.struct.map.MaterialMap1_12();
        } else if (isVersion(11)) {
            mMap = new codes.wasabi.matlib.struct.map.MaterialMap1_11();
        } else if (isVersion(10)) {
            mMap = new codes.wasabi.matlib.struct.map.MaterialMap1_10();
        } else if (isVersion(9)) {
            mMap = new codes.wasabi.matlib.struct.map.MaterialMap1_9();
        } else {
            mMap = new codes.wasabi.matlib.struct.map.MaterialMap1_8();
        }
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

}
