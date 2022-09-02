# MaterialLib
<img src="https://img.shields.io/github/v/release/WasabiThumb/MaterialLib?include_prereleases&style=flat-square"> <img src="https://img.shields.io/github/downloads/WasabiThumb/MaterialLib/total?style=flat-square"> <img src="https://img.shields.io/github/license/WasabiThumb/MaterialLib?style=flat-square"> <img src="https://img.shields.io/github/last-commit/WasabiThumb/MaterialLib?style=flat-square">

A tool to convert Material names from the latest version of the Bukkit API (currently 1.19.X) to suitable alternatives on the current server platform.

MaterialLib currently supports 1.8+, there is no intention on backporting further at this time.

The main use cases for MaterialLib would be to make version-independent Inventory GUIs, and not having to deal with data values on pre-1.13 servers.

## Examples
### Player Head
This code will only work on 1.13+
```java
ItemStack is = new ItemStack(Material.PLAYER_HEAD, 1);
```
However, with MaterialLib, this code will work on 1.8+
```java
MetaMaterial mm = MaterialLib.getMaterial("PLAYER_HEAD");
ItemStack is = mm.createItemStack(1);
```
It's that easy! On 1.13+ this will work exactly the same, but below 1.13 it will create an ItemStack with the SKULL material and a data value of 3

Since 1.1.0, it's possible to *reverse lookup* MetaMaterials given a Block or ItemStack like so:
```java
MetaMaterial mm = MaterialLib.getMaterial(is);
// This will give the PLAYER_HEAD MetaMaterial regardless
// of version, rather than the SKULL or PLAYER_HEAD Bukkit material
// that the ItemStack actually has.
```        

### Concrete
Concrete was added in 1.12, meaning that an exact match can only be found on 1.12 and above. Below is an example of how this works.
```java
Block b = Bukkit.getWorld("world").getSpawnLocation().getBlock();
MetaMaterial mm = MaterialLib.getMaterial("RED_CONCRETE");
mm.apply(b);
// On 1.13+, this sets the block at spawn to Material.RED_CONCRETE
// On 1.12, this sets the block at spawn to Material.CONCRETE with data value 14 (making it red)
// Below 1.12, this sets the block at spawn to Material.STAINED_CLAY with data value 14 (red terracotta)
Material m = mm.getBukkitMaterial();
// This will get the Material associated with this MetaMaterial
// Notably, using this material to change the type of the block will not always
// produce the same result, because the data value will not be updated
// unlike when using the MetaMaterial
```
But what if you only want exact matches? The example below shows how to achieve that:
```java
MetaMaterial mm = MaterialLib.getMaterial("CYAN_CONCRETE");
if (!mm.isExactMatch()) mm = null;
```

## Using
Since version 1.1.0, MaterialLib has been hosted on [the Central repository](https://repo1.maven.org/maven2/xyz/wasabicodes/matlib/).
You can add the library as a dependency like so:
```xml
<dependency>
    <groupId>xyz.wasabicodes</groupId>
    <artifactId>matlib</artifactId>
    <version>1.1.1</version>
</dependency>
```

## Notes
- The vast majority of mappings in MaterialLib are determined by comparing the list of Material enum names between versions. This misses some nuances, like `BRICK` meaning the brick item in 1.13+ but actually meaning the bricks block in 1.12 and below. Manual exceptions are added in these cases and there are probably some cases I have missed. Please make an issue on GitHub if you find any.
- Some MetaMaterials actually use a Bukkit material that differs from the one supplied by `#getBukkitMaterial()` depending on if it is being applied to a Block or an ItemStack, for example `SPRUCE_DOOR` and `SPRUCE_DOOR_ITEM` (< 1.13) being used for the same `SPRUCE_DOOR` MetaMaterial.
- Other times a MetaMaterial will add special data to an ItemStack, such as adding Sharpness I to a diamond sword when a Trident is not present in the current version, or turning glasses of honey into yellow colored potions on versions that both support colored potions and do not have glasses of honey.
- This library contains a fair amount of redundant code that makes it larger than necessary, however optimizing the code would make it incredibly hard to maintain. In the future, I may make a "lite" version that supports less versions (probably 1.13+) with a lower binary size.
- There is no consistent rule for what happens when trying to use materials that are too new for the current server version, only that it should resolve to some material and that function is preserved when possible (slabs turn into other slabs, etc).
