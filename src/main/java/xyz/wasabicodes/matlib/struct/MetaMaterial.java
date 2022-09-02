package xyz.wasabicodes.matlib.struct;

import xyz.wasabicodes.matlib.struct.applicator.Applicators;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.Locale;
import java.util.function.Consumer;

public class MetaMaterial {

    private final Material bukkitMaterial;
    private final boolean exact;
    private final Consumer<Block> blockApply;
    private final Consumer<ItemStack> itemApply;
    private String name;
    private boolean nameDefined = false;
    public MetaMaterial(Material bukkitMaterial, boolean exact, Consumer<Block> blockApply, Consumer<ItemStack> itemApply) {
        this.bukkitMaterial = bukkitMaterial;
        this.exact = exact;
        this.blockApply = blockApply;
        this.itemApply = itemApply;
        this.name = (bukkitMaterial != null ? bukkitMaterial.name().toLowerCase(Locale.ROOT) : null);
    }

    public MetaMaterial(Material bukkitMaterial, boolean exact, byte data) {
        this(bukkitMaterial, exact, Applicators.blockData(bukkitMaterial, data), Applicators.itemData(bukkitMaterial, data));
    }

    public MetaMaterial(Material bukkitMaterial, boolean exact, @Range(from=Byte.MIN_VALUE, to=Byte.MAX_VALUE) int data) {
        this(bukkitMaterial, exact, Applicators.blockData(bukkitMaterial, data), Applicators.itemData(bukkitMaterial, data));
    }

    public MetaMaterial(String bukkitMaterial, boolean exact, byte data) {
        this(bukkitMaterial, exact, Applicators.blockData(bukkitMaterial, data), Applicators.itemData(bukkitMaterial, data));
    }

    public MetaMaterial(String bukkitMaterial, boolean exact, @Range(from=Byte.MIN_VALUE, to=Byte.MAX_VALUE) int data) {
        this(bukkitMaterial, exact, Applicators.blockData(bukkitMaterial, data), Applicators.itemData(bukkitMaterial, data));
    }

    public MetaMaterial(Material bukkitMaterial, boolean exact) {
        this(bukkitMaterial, exact, Applicators.blockBasic(bukkitMaterial), Applicators.itemBasic(bukkitMaterial));
    }

    public MetaMaterial(Material bukkitMaterial) {
        this(bukkitMaterial, true, Applicators.blockBasic(bukkitMaterial), Applicators.itemBasic(bukkitMaterial));
        nameDefined = true;
    }

    public MetaMaterial(String bukkitMaterial, boolean exact, Consumer<Block> blockApply, Consumer<ItemStack> itemApply) {
        this(Material.matchMaterial(bukkitMaterial), exact, blockApply, itemApply);
    }

    public MetaMaterial(String bukkitMaterial, boolean exact) {
        this(Material.matchMaterial(bukkitMaterial), exact, Applicators.blockBasic(bukkitMaterial), Applicators.itemBasic(bukkitMaterial));
    }

    public MetaMaterial(String bukkitMaterial) {
        this(Material.matchMaterial(bukkitMaterial), true, Applicators.blockBasic(bukkitMaterial), Applicators.itemBasic(bukkitMaterial));
    }

    /**
     * Gets the Bukkit material applied by this MetaMaterial. Note that, for example,
     * ItemStack#setType(Material) is often but not always the same as MetaMaterial#apply(ItemStack)
     * @return The bukkit material
     */
    public final @NotNull Material getBukkitMaterial() {
        return bukkitMaterial;
    }

    public Consumer<Block> getBlockApplicator() {
        return blockApply;
    }

    public Consumer<ItemStack> getItemApplicator() {
        return itemApply;
    }

    /**
     * Returns whether this MetaMaterial is functionally the same as the newer material it represents
     * @return A boolean
     */
    public final boolean isExactMatch() {
        return exact;
    }

    /**
     * Applies this MetaMaterial to a Block
     * @param block The target block
     */
    public final void apply(@NotNull Block block) {
        blockApply.accept(block);
    }

    /**
     * Applies this MetaMaterial to an ItemStack
     * @param is The target ItemStack
     */
    public final void apply(@NotNull ItemStack is) {
        itemApply.accept(is);
    }

    public boolean setName(String name) {
        if (!nameDefined) {
            this.name = name;
            nameDefined = true;
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Creates a new ItemStack with this material
     * @param count The size of the new ItemStack
     * @return A new ItemStack
     */
    @Contract("_ -> new")
    public final @NotNull ItemStack createItemStack(int count) {
        ItemStack is = new ItemStack(bukkitMaterial, count);
        apply(is);
        return is;
    }

}
