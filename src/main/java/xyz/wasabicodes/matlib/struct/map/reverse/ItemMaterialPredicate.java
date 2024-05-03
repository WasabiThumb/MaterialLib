package xyz.wasabicodes.matlib.struct.map.reverse;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.io.BukkitObjectOutputStream;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import xyz.wasabicodes.matlib.struct.MetaMaterial;
import xyz.wasabicodes.matlib.struct.applicator.item.DataItemMaterialApplicator;
import xyz.wasabicodes.matlib.struct.applicator.item.DurabilityItemMaterialApplicator;
import xyz.wasabicodes.matlib.struct.applicator.item.ItemMaterialApplicator;
import xyz.wasabicodes.matlib.struct.applicator.item.MetaItemMaterialApplicator;
import xyz.wasabicodes.matlib.util.DataUtil;
import xyz.wasabicodes.matlib.util.MD5NullOutputStream;
import xyz.wasabicodes.matlib.util.Version;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.function.Consumer;

interface ItemMaterialPredicate extends MaterialPredicate {

    @Contract("_ -> new")
    static @NotNull ItemMaterialPredicate of(@NotNull MetaMaterial mm) {
        Consumer<ItemStack> con = mm.getItemApplicator();
        Material bukkitMaterial = mm.getBukkitMaterial();
        if (con instanceof ItemMaterialApplicator) {
            bukkitMaterial = ((ItemMaterialApplicator) con).getMaterial();

            // DataItem, DurabilityItem, MetaItem
            if (con instanceof DataItemMaterialApplicator) {
                byte d = ((DataItemMaterialApplicator) con).getData();
                return new MaterialData(mm, bukkitMaterial, d, false);
            } else if (con instanceof DurabilityItemMaterialApplicator) {
                short d = ((DurabilityItemMaterialApplicator) con).getDurability();
                return new MaterialDurability(mm, bukkitMaterial, d);
            } else if (con instanceof MetaItemMaterialApplicator) {
                Consumer<ItemMeta> d = ((MetaItemMaterialApplicator) con).getMetaTransformer();
                return new MaterialMeta(mm, bukkitMaterial, d);
            }
        }
        return new MaterialData(mm, bukkitMaterial, (byte) 0, Version.isVersion(13));
    }

    //

    @Override
    default boolean matches(Block block) {
        return false;
    }

    @Override
    default boolean matchesGeneric(Object object) {
        return this.matches((ItemStack) object);
    }

    int weight();

    @Override
    default int compareTo(@NotNull MaterialPredicate materialPredicate) {
        if (materialPredicate instanceof ItemMaterialPredicate) {
            int other = ((ItemMaterialPredicate) materialPredicate).weight();
            return Integer.compare(other, this.weight());
        }
        return MaterialPredicate.super.compareTo(materialPredicate);
    }

    //

    @ApiStatus.Internal
    class MaterialData implements ItemMaterialPredicate {

        private final MetaMaterial metaMaterial;
        private final Material bukkitMaterial;
        private final byte data;
        private final boolean ignoreData;
        MaterialData(MetaMaterial metaMaterial, Material bukkitMaterial, byte data, boolean ignoreData) {
            this.metaMaterial = metaMaterial;
            this.bukkitMaterial = bukkitMaterial;
            this.data = data;
            this.ignoreData = ignoreData;
        }

        @Override
        public MetaMaterial getMetaMaterial() {
            return this.metaMaterial;
        }

        @Override
        public boolean matches(ItemStack itemStack) throws UnsupportedOperationException {
            return this.bukkitMaterial.equals(itemStack.getType()) &&
                    (this.ignoreData || DataUtil.getData(itemStack) == this.data);
        }

        @Override
        public String getAppliesTo() {
            return this.bukkitMaterial.name();
        }

        @Override
        public int weight() {
            return this.ignoreData ? 0 : 1;
        }

    }

    @ApiStatus.Internal
    class MaterialDurability implements ItemMaterialPredicate {

        private final MetaMaterial metaMaterial;
        private final Material bukkitMaterial;
        private final short durability;
        MaterialDurability(MetaMaterial metaMaterial, Material bukkitMaterial, short durability) {
            this.metaMaterial = metaMaterial;
            this.bukkitMaterial = bukkitMaterial;
            this.durability = durability;
        }

        @Override
        public MetaMaterial getMetaMaterial() {
            return this.metaMaterial;
        }

        @Override
        public boolean matches(ItemStack itemStack) throws UnsupportedOperationException {
            return this.bukkitMaterial.equals(itemStack.getType()) && DataUtil.getDurability(itemStack) == this.durability;
        }

        @Override
        public String getAppliesTo() {
            return this.bukkitMaterial.name();
        }

        @Override
        public int weight() {
            return 2;
        }

    }

    @ApiStatus.Internal
    class MaterialMeta implements ItemMaterialPredicate {

        private final MetaMaterial metaMaterial;
        private final Material bukkitMaterial;
        private final Consumer<ItemMeta> metaTransformer;
        MaterialMeta(MetaMaterial metaMaterial, Material bukkitMaterial, Consumer<ItemMeta> metaTransformer) {
            this.metaMaterial = metaMaterial;
            this.bukkitMaterial = bukkitMaterial;
            this.metaTransformer = metaTransformer;
        }

        @Override
        public MetaMaterial getMetaMaterial() {
            return this.metaMaterial;
        }

        @Override
        public boolean matches(ItemStack itemStack) throws UnsupportedOperationException {
            if (!this.bukkitMaterial.equals(itemStack.getType())) return false;
            if (!itemStack.hasItemMeta()) return false;

            ItemStack cpy = new ItemStack(itemStack.getType(), itemStack.getAmount());
            DataUtil.setData(cpy, DataUtil.getData(itemStack));
            DataUtil.setDurability(cpy, DataUtil.getDurability(itemStack));

            ItemMeta meta = cpy.getItemMeta();
            if (meta == null) meta = Bukkit.getItemFactory().getItemMeta(itemStack.getType());
            if (meta != null) {
                this.metaTransformer.accept(meta);
                cpy.setItemMeta(meta);
            }

            byte[] hash1 = this.getItemStackHash(itemStack);
            byte[] hash2 = this.getItemStackHash(cpy);
            return MessageDigest.isEqual(hash1, hash2);
        }

        @Override
        public String getAppliesTo() {
            return this.bukkitMaterial.name();
        }

        private byte[] getItemStackHash(ItemStack stack) {
            try (MD5NullOutputStream m1 = new MD5NullOutputStream()) {
                try (BukkitObjectOutputStream bos1 = new BukkitObjectOutputStream(m1)) {
                    bos1.writeObject(stack);
                    bos1.flush();
                    return m1.digest();
                }
            } catch (IOException e) {
                //noinspection CallToPrintStackTrace
                e.printStackTrace();
                return new byte[0];
            }
        }

        @Override
        public int weight() {
            return 3;
        }

    }

}
