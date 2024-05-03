package xyz.wasabicodes.matlib.struct.map;

import org.jetbrains.annotations.NotNull;
import xyz.wasabicodes.matlib.struct.MetaMaterial;

import java.util.Map;

public interface MaterialMap extends Map<String, MetaMaterial> {

    @NotNull MaterialMap copy();

}
