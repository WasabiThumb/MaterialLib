package xyz.wasabicodes.matlib.struct.map.proxy;

import org.jetbrains.annotations.NotNull;
import xyz.wasabicodes.matlib.struct.MetaMaterial;
import xyz.wasabicodes.matlib.struct.map.AbstractMaterialMap;
import xyz.wasabicodes.matlib.struct.map.MaterialMap;
import xyz.wasabicodes.matlib.struct.map.impl.MaterialMapImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class ProxiedMaterialMap extends AbstractMaterialMap {

    private final Map<String, MetaMaterial> backingMap;
    public ProxiedMaterialMap(MaterialMap base, Map<String, String> proxies, Predicate<String> isExact) {
        this.backingMap = new HashMap<>();
        this.backingMap.putAll(base);

        MetaMaterial value;
        for (Map.Entry<String, String> entry : proxies.entrySet()) {
            String key = entry.getKey();
            String valueName = entry.getValue();
            value = this.backingMap.get(valueName);
            MetaMaterial mm;
            if (value != null) {
                mm = new MetaMaterial(value, isExact.test(key));
            } else {
                mm = new MetaMaterial(valueName, isExact.test(key));
            }
            mm.setName(key);
            this.backingMap.put(key, mm);
        }
    }

    public ProxiedMaterialMap(MaterialMap base, Map<String, String> proxies) {
        this(base, proxies, MaterialMapProxies::isProxyExact);
    }

    public ProxiedMaterialMap(MaterialMap base) {
        this(base, MaterialMapProxies.get());
    }

    //

    @Override
    protected Map<String, MetaMaterial> getBackingMap() {
        return this.backingMap;
    }

    @Override
    public @NotNull MaterialMap copy() {
        return new MaterialMapImpl(this.backingMap);
    }

}
