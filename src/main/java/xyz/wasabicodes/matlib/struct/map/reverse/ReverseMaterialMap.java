package xyz.wasabicodes.matlib.struct.map.reverse;

import org.bukkit.Material;
import xyz.wasabicodes.matlib.struct.MetaMaterial;
import xyz.wasabicodes.matlib.struct.map.MaterialMap;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class ReverseMaterialMap {

    private final Map<String, List<BlockMaterialPredicate>> blockMap;
    private final Map<String, List<ItemMaterialPredicate>> itemMap;

    public ReverseMaterialMap(MaterialMap reference) {
        this.blockMap = new HashMap<>();
        this.itemMap = new HashMap<>();
        for (String metaName : reference.keySet()) {
            MetaMaterial mm = reference.get(metaName);
            if (!mm.isExactMatch()) continue;
            BlockMaterialPredicate bmp = BlockMaterialPredicate.of(mm);
            this.addEntry(bmp, this.blockMap);
            ItemMaterialPredicate imp = ItemMaterialPredicate.of(mm);
            this.addEntry(imp, this.itemMap);
        }
        this.sort(this.blockMap);
        this.sort(this.itemMap);
    }

    private <T extends MaterialPredicate> void addEntry(T t, Map<String, List<T>> map) {
        String key = t.getAppliesTo().toUpperCase(Locale.ROOT);
        map.computeIfAbsent(key, k -> new LinkedList<>()).add(t);
    }

    private <T extends MaterialPredicate> void sort(Map<String, List<T>> map) {
        List<T> v;
        for (String s : map.keySet()) {
            v = map.get(s);
            if (v == null) continue;
            v.sort(Comparator.naturalOrder());
        }
    }

    public @Nullable MetaMaterial get(Block block) {
        return this.get0(block.getType(), block, this.blockMap);
    }

    public @Nullable MetaMaterial get(ItemStack is) {
        return this.get0(is.getType(), is, this.itemMap);
    }

    private <T extends MaterialPredicate> @Nullable MetaMaterial get0(Material type, Object object, Map<String, List<T>> map) {
        List<T> list = map.get(type.name().toUpperCase(Locale.ROOT));
        if (list == null) return null;
        for (T predicate : list) {
            if (predicate.matchesGeneric(object)) return predicate.getMetaMaterial();
        }
        return null;
    }

}
