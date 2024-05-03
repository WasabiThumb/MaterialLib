package xyz.wasabicodes.matlib.struct.map.reverse;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import xyz.wasabicodes.matlib.struct.MetaMaterial;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import java.util.Collections;
import java.util.Set;

/**
 * @see ItemMaterialPredicate
 * @see BlockMaterialPredicate
 */
@ApiStatus.Internal
public interface MaterialPredicate extends Comparable<MaterialPredicate> {

    MetaMaterial getMetaMaterial();

    boolean matches(Block block);

    boolean matches(ItemStack itemStack);

    default boolean matchesGeneric(Object object) throws ClassCastException {
        if (object instanceof Block) {
            return this.matches((Block) object);
        } else if (object instanceof ItemStack) {
            return this.matches((ItemStack) object);
        }
        return false;
    }

    default String getAppliesTo() {
        return this.getMetaMaterial().getBukkitMaterial().name();
    }

    @Override
    default int compareTo(@NotNull MaterialPredicate materialPredicate) {
        return this.getMetaMaterial().getName().compareTo(materialPredicate.getMetaMaterial().getName());
    }

}
