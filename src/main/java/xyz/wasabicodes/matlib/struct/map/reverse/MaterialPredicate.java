package io.github.wasabithumb.matlib.struct.map.reverse;

import io.github.wasabithumb.matlib.struct.MetaMaterial;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

public interface MaterialPredicate {

    MetaMaterial getMetaMaterial();

    boolean matches(Block block);

    boolean matches(ItemStack itemStack);

}
