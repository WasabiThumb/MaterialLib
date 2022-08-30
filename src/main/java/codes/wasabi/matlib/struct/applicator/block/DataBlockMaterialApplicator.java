package codes.wasabi.matlib.struct.applicator.block;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;

import java.lang.reflect.Method;
import java.util.function.BiConsumer;

public class DataBlockMaterialApplicator extends BlockMaterialApplicator {

    private static BiConsumer<Block, Byte> setData;
    static {
        Class<? extends Block> c = Block.class;
        try {
            Method m = c.getMethod("setData", byte.class);
            setData = (block, aByte) -> {
                try {
                    m.invoke(block, aByte);
                } catch (Exception ignored) { }
            };
        } catch (NoSuchMethodException e) {
            setData = (block, aByte) -> block.setBlockData(Bukkit.getUnsafe().fromLegacy(block.getType(), aByte));
        }
    }

    private final byte data;
    public DataBlockMaterialApplicator(Material material, byte data) {
        super(material);
        this.data = data;
    }

    public DataBlockMaterialApplicator(String materialName, byte data) {
        this(Material.matchMaterial(materialName), data);
    }

    @Override
    public void accept(Block block) {
        block.setType(getMaterial());
        setData.accept(block, this.data);
    }

}
