package xyz.wasabicodes.matlib.struct.map.reverse;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import xyz.wasabicodes.matlib.struct.MetaMaterial;
import xyz.wasabicodes.matlib.struct.applicator.block.BlockMaterialApplicator;
import xyz.wasabicodes.matlib.struct.applicator.block.DataBlockMaterialApplicator;
import xyz.wasabicodes.matlib.util.DataUtil;
import xyz.wasabicodes.matlib.util.Version;

import java.util.function.Consumer;

interface BlockMaterialPredicate extends MaterialPredicate {

    @Contract("_ -> new")
    static @NotNull BlockMaterialPredicate of(@NotNull MetaMaterial mm) {
        Consumer<Block> con = mm.getBlockApplicator();
        Material bukkitMaterial = mm.getBukkitMaterial();
        byte data = (byte) 0;
        boolean ignoreData = Version.isVersion(13);
        if (con instanceof BlockMaterialApplicator) {
            bukkitMaterial = ((BlockMaterialApplicator) con).getMaterial();
            if (con instanceof DataBlockMaterialApplicator) {
                data = ((DataBlockMaterialApplicator) con).getData();
                ignoreData = false;
            }
        }
        return new Impl(mm, bukkitMaterial, data, ignoreData);
    }

    //

    @Override
    default boolean matches(ItemStack block) {
        return false;
    }

    @Override
    default boolean matchesGeneric(Object object) {
        return this.matches((Block) object);
    }

    int weight();

    @Override
    default int compareTo(@NotNull MaterialPredicate materialPredicate) {
        if (materialPredicate instanceof BlockMaterialPredicate) {
            int other = ((BlockMaterialPredicate) materialPredicate).weight();
            return Integer.compare(other, this.weight());
        }
        return MaterialPredicate.super.compareTo(materialPredicate);
    }

    //

    @ApiStatus.Internal
    class Impl implements BlockMaterialPredicate {

        private final MetaMaterial metaMaterial;
        private final Material bukkitMaterial;
        private final byte data;
        private final boolean ignoreData;
        Impl(MetaMaterial metaMaterial, Material bukkitMaterial, byte data, boolean ignoreData) {
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
        public boolean matches(Block block) throws UnsupportedOperationException {
            return this.bukkitMaterial.equals(block.getType()) && (this.ignoreData || DataUtil.getData(block) == this.data);
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

}
