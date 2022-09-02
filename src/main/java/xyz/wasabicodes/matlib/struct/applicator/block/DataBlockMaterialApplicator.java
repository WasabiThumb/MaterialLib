package xyz.wasabicodes.matlib.struct.applicator.block;

import xyz.wasabicodes.matlib.util.DataUtil;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class DataBlockMaterialApplicator extends BlockMaterialApplicator {

    private final byte data;
    public DataBlockMaterialApplicator(Material material, byte data) {
        super(material);
        this.data = data;
    }

    public DataBlockMaterialApplicator(String materialName, byte data) {
        this(Material.matchMaterial(materialName), data);
    }

    public byte getData() {
        return data;
    }

    @Override
    public void accept(Block block) {
        block.setType(getMaterial());
        DataUtil.setData(block, this.data);
    }

}
