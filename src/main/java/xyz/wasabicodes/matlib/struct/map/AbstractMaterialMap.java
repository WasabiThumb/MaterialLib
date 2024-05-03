package xyz.wasabicodes.matlib.struct.map;

import xyz.wasabicodes.matlib.struct.MetaMaterial;

import java.util.*;

public abstract class AbstractMaterialMap implements MaterialMap {

    protected abstract Map<String, MetaMaterial> getBackingMap();

    @Override
    public int size() {
        return this.getBackingMap().size();
    }

    @Override
    public boolean isEmpty() {
        return this.getBackingMap().isEmpty();
    }

    @Override
    public boolean containsKey(Object o) {
        if (o instanceof String) {
            return this.getBackingMap().containsKey(((String) o).toUpperCase(Locale.ROOT));
        }
        return this.getBackingMap().containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return this.getBackingMap().containsValue(o);
    }

    @Override
    public MetaMaterial get(Object o) {
        if (o instanceof String) {
            return this.getBackingMap().get(((String) o).toUpperCase(Locale.ROOT));
        }
        return this.getBackingMap().get(o);
    }

    @Override
    public MetaMaterial put(String s, MetaMaterial metaMaterial) throws UnsupportedOperationException {
        this.throwOnModify();
        return null;
    }

    @Override
    public MetaMaterial remove(Object o) throws UnsupportedOperationException {
        this.throwOnModify();
        return null;
    }

    @Override
    public void putAll(Map<? extends String, ? extends MetaMaterial> map) throws UnsupportedOperationException {
        this.throwOnModify();
    }

    @Override
    public void clear() throws UnsupportedOperationException {
        this.throwOnModify();
    }

    @Override
    public Set<String> keySet() {
        return Collections.unmodifiableSet(this.getBackingMap().keySet());
    }

    @Override
    public Collection<MetaMaterial> values() {
        return Collections.unmodifiableCollection(this.getBackingMap().values());
    }

    @Override
    public Set<Entry<String, MetaMaterial>> entrySet() {
        return Collections.unmodifiableMap(this.getBackingMap()).entrySet();
    }

    protected final void throwOnModify() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("MaterialMap can only be modified through protected methods");
    }

}
