package xyz.wasabicodes.matlib.struct.map.impl;

import org.jetbrains.annotations.NotNull;
import xyz.wasabicodes.matlib.struct.MetaMaterial;
import org.bukkit.Material;
import org.jetbrains.annotations.Contract;
import xyz.wasabicodes.matlib.struct.map.AbstractMaterialMap;
import xyz.wasabicodes.matlib.struct.map.MaterialMap;

import java.util.*;

public class MaterialMapImpl extends AbstractMaterialMap {

    // Tip for development of Material maps:
    // Replace regex m\("([^"]+)"\) with Material.$1 to convert m("EXAMPLE") to Material.EXAMPLE
    // Replace regex Material\.([^,)]+) with m("$1") to convert back

    private final HashMap<String, MetaMaterial> backingMap = new HashMap<>();
    public MaterialMapImpl() { }
    public MaterialMapImpl(Map<String, MetaMaterial> initialValues) {
        this.backingMap.putAll(initialValues);
    }

    protected void set(String key, MetaMaterial material) {
        String k = key.toUpperCase(Locale.ROOT);
        material.setName(k);
        backingMap.put(k, material);
    }

    @SuppressWarnings("unused")
    protected void set(Material key, MetaMaterial material) {
        String k = key.name().toUpperCase(Locale.ROOT);
        material.setName(k);
        backingMap.put(k, material);
    }

    @Contract("_ -> param1")
    protected String m(String a) {
        return a;
    }

    @Override
    protected Map<String, MetaMaterial> getBackingMap() {
        return this.backingMap;
    }

    @Override
    public @NotNull MaterialMap copy() {
        return new MaterialMapImpl(this.backingMap);
    }

}
