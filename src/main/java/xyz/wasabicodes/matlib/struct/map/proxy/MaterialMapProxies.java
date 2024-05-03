package xyz.wasabicodes.matlib.struct.map.proxy;

import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;
import xyz.wasabicodes.matlib.util.Version;

import java.util.*;

public class MaterialMapProxies {

    /**
     * Gets all proxies as key, value pairs for the current MC server version.
     * The map entries will be sorted from least to greatest MC version.
     */
    public static @NotNull @UnmodifiableView Map<String, String> get() {
        MaterialMapProxies[] arr = new MaterialMapProxies[MAX_PROXIES];
        int len = populate(arr);
        if (len == 0) return Collections.emptyMap();
        return arrayToMap(arr, len - 1);
    }

    private static final String HATRED = "DIRT_PATH"; // The only exception to this system *ever* between MC 1.15 & MC 1.20
    public static boolean isProxyExact(@Nullable String key) {
        if (key == null || key.isEmpty()) return false;
        if (Version.isVersion(17)) return false;
        return key.equals(HATRED);
    }

    private static final int MAX_PROXIES = 5;
    private static int populate(MaterialMapProxies[] arr) {
        int i = 0;
        if (Version.isVersion(20)) return i;
        arr[i++] = new MaterialMapProxies_1_19();
        if (Version.isVersion(19)) return i;
        arr[i++] = new MaterialMapProxies_1_18();
        if (Version.isVersion(18)) return i;
        arr[i++] = new MaterialMapProxies_1_17();
        if (Version.isVersion(17)) return i;
        arr[i++] = new MaterialMapProxies_1_16();
        if (Version.isVersion(16)) return i;
        arr[i++] = new MaterialMapProxies_1_15();
        return i;
    }

    private static Map<String, String> arrayToMap(MaterialMapProxies[] arr, int maxIndex) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        MaterialMapProxies next;
        String key;
        String value = null;
        String relocatedValue;
        for (int i=maxIndex; i >= 0; i--) {
            next = arr[i];
            for (Map.Entry<String, String> entry : next.backingMap.entrySet()) {
                key = entry.getKey();
                relocatedValue = entry.getValue();
                while (relocatedValue != null) {
                    value = relocatedValue;
                    relocatedValue = map.get(value);
                }
                map.put(key, value);
            }
        }

        return Collections.unmodifiableMap(map);
    }

    //

    final Map<String, String> backingMap = new HashMap<>();

    void set(@NotNull String name, @NotNull String proxy) {
        this.backingMap.put(name.toUpperCase(Locale.ROOT), proxy.toUpperCase(Locale.ROOT));
    }

    @SuppressWarnings("unused")
    void set(@NotNull String name, @NotNull Material proxy) {
        this.set(name, proxy.name());
    }

    protected @NotNull String m(@NotNull String n) {
        return n;
    }

}
