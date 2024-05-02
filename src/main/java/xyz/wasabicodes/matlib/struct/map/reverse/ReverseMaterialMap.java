package io.github.wasabithumb.matlib.struct.map.reverse;

import io.github.wasabithumb.matlib.struct.MetaMaterial;
import io.github.wasabithumb.matlib.struct.applicator.block.BlockMaterialApplicator;
import io.github.wasabithumb.matlib.struct.applicator.block.DataBlockMaterialApplicator;
import io.github.wasabithumb.matlib.struct.applicator.item.DataItemMaterialApplicator;
import io.github.wasabithumb.matlib.struct.applicator.item.DurabilityItemMaterialApplicator;
import io.github.wasabithumb.matlib.struct.applicator.item.ItemMaterialApplicator;
import io.github.wasabithumb.matlib.struct.map.MaterialMap;
import io.github.wasabithumb.matlib.util.DataUtil;
import io.github.wasabithumb.matlib.util.Version;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ReverseMaterialMap {

    private final Map<String, List<MaterialPredicate>> map;

    public ReverseMaterialMap(MaterialMap reference) {
        this.map = new HashMap<>();
        for (String metaName : reference.keySet()) {
            MetaMaterial mm = reference.get(metaName);
            if (!mm.isExactMatch()) continue;
            Set<String> applyTo = new HashSet<>();
            applyTo.add(mm.getBukkitMaterial().name());
            //
            Predicate<Block> blockScanner = (b) -> true;
            Predicate<ItemStack> itemScanner = (i) -> true;
            if (!Version.isVersion(13)) {
                blockScanner = (b) -> DataUtil.getData(b) <= 0;
                itemScanner = (i) -> DataUtil.getData(i) <= 0 && DataUtil.getDurability(i) <= 0;
            }
            //
            Consumer<Block> blockApply = mm.getBlockApplicator();
            if (blockApply instanceof BlockMaterialApplicator) {
                BlockMaterialApplicator qual = (BlockMaterialApplicator) blockApply;
                applyTo.add(qual.getMaterial().name());
                if (qual instanceof DataBlockMaterialApplicator) {
                    DataBlockMaterialApplicator dataQual = (DataBlockMaterialApplicator) qual;
                    blockScanner = (Block b) -> b.getType().equals(qual.getMaterial()) && DataUtil.getData(b) == dataQual.getData();
                } else {
                    blockScanner = (Block b) -> b.getType().equals(qual.getMaterial());
                }
            }
            //
            Consumer<ItemStack> itemApply = mm.getItemApplicator();
            if (itemApply instanceof ItemMaterialApplicator) {
                ItemMaterialApplicator qual = (ItemMaterialApplicator) itemApply;
                applyTo.add(qual.getMaterial().name());
                if (qual instanceof DataItemMaterialApplicator) {
                    DataItemMaterialApplicator dataQual = (DataItemMaterialApplicator) qual;
                    itemScanner = (ItemStack i) -> i.getType().equals(qual.getMaterial()) && DataUtil.getData(i) == dataQual.getData();
                } else if (qual instanceof DurabilityItemMaterialApplicator) {
                    DurabilityItemMaterialApplicator durabilityQual = (DurabilityItemMaterialApplicator) qual;
                    itemScanner = (ItemStack i) -> i.getType().equals(qual.getMaterial()) && DataUtil.getDurability(i) == durabilityQual.getDurability();
                } else {
                    itemScanner = (ItemStack i) -> i.getType().equals(qual.getMaterial());
                }
            }
            //
            final Predicate<Block> finalBlockScanner = blockScanner;
            final Predicate<ItemStack> finalItemScanner = itemScanner;
            for (String matName : applyTo) {
                addEntry(matName, new MaterialPredicate() {
                    @Override
                    public MetaMaterial getMetaMaterial() {
                        return mm;
                    }

                    @Override
                    public boolean matches(Block block) {
                        return finalBlockScanner.test(block);
                    }

                    @Override
                    public boolean matches(ItemStack itemStack) {
                        return finalItemScanner.test(itemStack);
                    }
                });
            }
        }
    }

    private void addEntry(String matName, MaterialPredicate predicate) {
        List<MaterialPredicate> list = map.get(matName);
        if (list == null) list = new ArrayList<>();
        list.add(predicate);
        map.put(matName, list);
    }

    public @Nullable MetaMaterial get(Block block) {
        return get(block.getType().name(), block);
    }

    public @Nullable MetaMaterial get(ItemStack is) {
        return get(is.getType().name(), is);
    }

    private @Nullable MetaMaterial get(String matName, Object matchable) {
        List<MaterialPredicate> predicates = map.get(matName);
        if (predicates == null) return null;
        boolean isBlock = (matchable instanceof Block);
        boolean isItem = ((!isBlock) && matchable instanceof ItemStack);
        for (MaterialPredicate p : predicates) {
            if (isBlock ? p.matches((Block) matchable) : (isItem && p.matches((ItemStack) matchable))) return p.getMetaMaterial();
        }
        return null;
    }

}
