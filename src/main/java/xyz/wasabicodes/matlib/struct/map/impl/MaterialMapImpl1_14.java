package xyz.wasabicodes.matlib.struct.map.impl;

import xyz.wasabicodes.matlib.struct.MetaMaterial;
import org.bukkit.Color;
import org.bukkit.inventory.meta.PotionMeta;
import xyz.wasabicodes.matlib.struct.applicator.Applicators;

public class MaterialMapImpl1_14 extends MaterialMapImpl {

    public MaterialMapImpl1_14() {
        // 1.15 -> 1.14
        set("BEE_NEST", new MetaMaterial(m("BARREL"), false));
        set("BEE_SPAWN_EGG", new MetaMaterial(m("BAT_SPAWN_EGG"), false));
        set("BEEHIVE", new MetaMaterial(m("SPAWNER"), false));
        set("HONEY_BLOCK", new MetaMaterial(m("SLIME_BLOCK"), false));
        set("HONEY_BOTTLE", new MetaMaterial(m("POTION"), false, Applicators.blockAir(), Applicators.itemMeta(m("POTION"), (PotionMeta pm) -> pm.setColor(Color.YELLOW), PotionMeta.class)));
        set("HONEYCOMB", new MetaMaterial(m("SLIME_BALL"), false));
        set("HONEYCOMB_BLOCK", new MetaMaterial(m("SPAWNER"), false));
    }

}
