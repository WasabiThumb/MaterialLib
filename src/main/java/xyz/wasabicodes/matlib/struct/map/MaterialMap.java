package xyz.wasabicodes.matlib.struct.map;

import xyz.wasabicodes.matlib.struct.MetaMaterial;
import org.bukkit.Material;
import org.jetbrains.annotations.Contract;

import java.util.*;

public class MaterialMap implements Map<String, MetaMaterial> {

    // Tip for development of Material maps:
    // Replace regex m\("([^"]+)"\) with Material.$1 to convert m("EXAMPLE") to Material.EXAMPLE
    // Replace regex Material\.([^,)]+) with m("$1") to convert back

    private final HashMap<String, MetaMaterial> backingMap = new HashMap<>();

    protected void set(String key, MetaMaterial material) {
        backingMap.put(key.toUpperCase(Locale.ROOT), material);
    }

    protected void set(Material key, MetaMaterial material) {
        backingMap.put(key.name().toUpperCase(Locale.ROOT), material);
    }

    protected boolean unset(String key) {
        return backingMap.remove(key.toUpperCase(Locale.ROOT)) != null;
    }

    protected boolean unset(Material key) {
        return backingMap.remove(key.name().toUpperCase(Locale.ROOT)) != null;
    }

    @Contract("_ -> param1")
    protected String m(String a) {
        return a;
    }

    @Override
    public int size() {
        return backingMap.size();
    }

    @Override
    public boolean isEmpty() {
        return backingMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object o) {
        if (o instanceof String) {
            return backingMap.containsKey(((String) o).toUpperCase(Locale.ROOT));
        }
        return backingMap.containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return backingMap.containsValue(o);
    }

    @Override
    public MetaMaterial get(Object o) {
        if (o instanceof String) {
            return backingMap.get(((String) o).toUpperCase(Locale.ROOT));
        }
        return backingMap.get(o);
    }

    @Override
    public MetaMaterial put(String s, MetaMaterial metaMaterial) {
        throw new UnsupportedOperationException("MaterialMap can only be modified through protected methods");
    }

    @Override
    public MetaMaterial remove(Object o) {
        throw new UnsupportedOperationException("MaterialMap can only be modified through protected methods");
    }

    @Override
    public void putAll(Map<? extends String, ? extends MetaMaterial> map) {
        throw new UnsupportedOperationException("MaterialMap can only be modified through protected methods");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("MaterialMap can only be modified through protected methods");
    }

    @Override
    public Set<String> keySet() {
        return Collections.unmodifiableSet(backingMap.keySet());
    }

    @Override
    public Collection<MetaMaterial> values() {
        return Collections.unmodifiableCollection(backingMap.values());
    }

    @Override
    public Set<Entry<String, MetaMaterial>> entrySet() {
        return Collections.unmodifiableMap(backingMap).entrySet();
    }

}
