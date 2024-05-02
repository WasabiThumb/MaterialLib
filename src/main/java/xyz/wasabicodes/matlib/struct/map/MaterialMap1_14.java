package xyz.wasabicodes.matlib.struct.map;

import xyz.wasabicodes.matlib.struct.MetaMaterial;
import org.bukkit.Color;
import org.bukkit.inventory.meta.PotionMeta;
import xyz.wasabicodes.matlib.struct.applicator.Applicators;

public class MaterialMap1_14 extends MaterialMap {

    public MaterialMap1_14() {
        // 1.20 -> 1.19
        set("ACACIA_HANGING_SIGN", new MetaMaterial(m("ACACIA_SIGN"), false));
        set("ACACIA_WALL_HANGING_SIGN", new MetaMaterial(m("ACACIA_WALL_SIGN"), false));
        set("ANGLER_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("ARCHER_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("ARMS_UP_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("BAMBOO_BLOCK", new MetaMaterial(m("BIRCH_WOOD"), false));
        set("BAMBOO_BUTTON", new MetaMaterial(m("BIRCH_BUTTON"), false));
        set("BAMBOO_CHEST_RAFT", new MetaMaterial(m("BIRCH_BOAT"), false));
        set("BAMBOO_DOOR", new MetaMaterial(m("BIRCH_DOOR"), false));
        set("BAMBOO_FENCE", new MetaMaterial(m("BIRCH_FENCE"), false));
        set("BAMBOO_FENCE_GATE", new MetaMaterial(m("BIRCH_FENCE_GATE"), false));
        set("BAMBOO_HANGING_SIGN", new MetaMaterial(m("BIRCH_SIGN"), false));
        set("BAMBOO_MOSAIC", new MetaMaterial(m("BIRCH_PLANKS"), false));
        set("BAMBOO_MOSAIC_SLAB", new MetaMaterial(m("BIRCH_SLAB"), false));
        set("BAMBOO_MOSAIC_STAIRS", new MetaMaterial(m("BIRCH_STAIRS"), false));
        set("BAMBOO_PLANKS", new MetaMaterial(m("BIRCH_PLANKS"), false));
        set("BAMBOO_PRESSURE_PLATE", new MetaMaterial(m("BIRCH_PRESSURE_PLATE"), false));
        set("BAMBOO_RAFT", new MetaMaterial(m("BIRCH_BOAT"), false));
        set("BAMBOO_SIGN", new MetaMaterial(m("BIRCH_SIGN"), false));
        set("BAMBOO_SLAB", new MetaMaterial(m("BIRCH_SLAB"), false));
        set("BAMBOO_STAIRS", new MetaMaterial(m("BIRCH_STAIRS"), false));
        set("BAMBOO_TRAPDOOR", new MetaMaterial(m("BIRCH_TRAPDOOR"), false));
        set("BAMBOO_WALL_HANGING_SIGN", new MetaMaterial(m("BIRCH_WALL_SIGN"), false));
        set("BAMBOO_WALL_SIGN", new MetaMaterial(m("BIRCH_WALL_SIGN"), false));
        set("BLADE_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("BREWER_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("BRUSH", new MetaMaterial(m("GOLDEN_SHOVEL"), false));
        set("BURN_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("CALIBRATED_SCULK_SENSOR", new MetaMaterial(m("DAYLIGHT_DETECTOR"), false));
        set("CAMEL_SPAWN_EGG", new MetaMaterial(m("DONKEY_SPAWN_EGG"), false));
        set("CHERRY_BOAT", new MetaMaterial(m("ACACIA_BOAT"), false));
        set("CHERRY_BUTTON", new MetaMaterial(m("ACACIA_BUTTON"), false));
        set("CHERRY_CHEST_BOAT", new MetaMaterial(m("ACACIA_BOAT"), false));
        set("CHERRY_DOOR", new MetaMaterial(m("ACACIA_DOOR"), false));
        set("CHERRY_FENCE", new MetaMaterial(m("ACACIA_FENCE"), false));
        set("CHERRY_FENCE_GATE", new MetaMaterial(m("ACACIA_FENCE_GATE"), false));
        set("CHERRY_HANGING_SIGN", new MetaMaterial(m("ACACIA_SIGN"), false));
        set("CHERRY_LEAVES", new MetaMaterial(m("ACACIA_LEAVES"), false));
        set("CHERRY_LOG", new MetaMaterial(m("ACACIA_LOG"), false));
        set("CHERRY_PLANKS", new MetaMaterial(m("ACACIA_PLANKS"), false));
        set("CHERRY_PRESSURE_PLATE", new MetaMaterial(m("ACACIA_PRESSURE_PLATE"), false));
        set("CHERRY_SAPLING", new MetaMaterial(m("ACACIA_SAPLING"), false));
        set("CHERRY_SIGN", new MetaMaterial(m("ACACIA_SIGN"), false));
        set("CHERRY_SLAB", new MetaMaterial(m("ACACIA_SLAB"), false));
        set("CHERRY_STAIRS", new MetaMaterial(m("ACACIA_STAIRS"), false));
        set("CHERRY_TRAPDOOR", new MetaMaterial(m("ACACIA_TRAPDOOR"), false));
        set("CHERRY_WALL_HANGING_SIGN", new MetaMaterial(m("ACACIA_WALL_SIGN"), false));
        set("CHERRY_WALL_SIGN", new MetaMaterial(m("ACACIA_WALL_SIGN"), false));
        set("CHERRY_WOOD", new MetaMaterial(m("ACACIA_WOOD"), false));
        set("CHISELED_BOOKSHELF", new MetaMaterial(m("BOOKSHELF"), false));
        set("COAST_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("CRIMSON_HANGING_SIGN", new MetaMaterial(m("ACACIA_SIGN"), false));
        set("CRIMSON_WALL_HANGING_SIGN", new MetaMaterial(m("ACACIA_WALL_SIGN"), false));
        set("DANGER_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("DARK_OAK_HANGING_SIGN", new MetaMaterial(m("DARK_OAK_SIGN"), false));
        set("DARK_OAK_WALL_HANGING_SIGN", new MetaMaterial(m("DARK_OAK_WALL_SIGN"), false));
        set("DECORATED_POT", new MetaMaterial(m("FLOWER_POT"), false));
        set("DUNE_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("ENDER_DRAGON_SPAWN_EGG", new MetaMaterial(m("BAT_SPAWN_EGG"), false));
        set("EXPLORER_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("EYE_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("FRIEND_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("HEART_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("HEARTBREAK_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("HOST_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("HOWL_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("IRON_GOLEM_SPAWN_EGG", new MetaMaterial(m("SHEEP_SPAWN_EGG"), false));
        set("JUNGLE_HANGING_SIGN", new MetaMaterial(m("JUNGLE_SIGN"), false));
        set("JUNGLE_WALL_HANGING_SIGN", new MetaMaterial(m("JUNGLE_WALL_SIGN"), false));
        set("MANGROVE_HANGING_SIGN", new MetaMaterial(m("ACACIA_SIGN"), false));
        set("MANGROVE_WALL_HANGING_SIGN", new MetaMaterial(m("ACACIA_WALL_SIGN"), false));
        set("MINER_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("MOURNER_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("MUSIC_DISC_RELIC", new MetaMaterial(m("MUSIC_DISC_CHIRP"), false));
        set("NETHERITE_UPGRADE_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("OAK_HANGING_SIGN", new MetaMaterial(m("OAK_SIGN"), false));
        set("OAK_WALL_HANGING_SIGN", new MetaMaterial(m("OAK_WALL_SIGN"), false));
        set("PIGLIN_HEAD", new MetaMaterial(m("PLAYER_HEAD"), false));
        set("PIGLIN_WALL_HEAD", new MetaMaterial(m("PLAYER_WALL_HEAD"), false));
        set("PINK_PETALS", new MetaMaterial(m("ALLIUM"), false));
        set("PITCHER_CROP", new MetaMaterial(m("LILY_OF_THE_VALLEY"), false));
        set("PITCHER_PLANT", new MetaMaterial(m("LILY_OF_THE_VALLEY"), false));
        set("PITCHER_POD", new MetaMaterial(m("COCOA"), false));
        set("PLENTY_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("POTTED_CHERRY_SAPLING", new MetaMaterial(m("POTTED_ACACIA_SAPLING"), false));
        set("POTTED_TORCHFLOWER", new MetaMaterial(m("POTTED_RED_TULIP"), false));
        set("PRIZE_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("RAISER_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("RIB_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("SHEAF_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("SHELTER_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("SKULL_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("SNIFFER_EGG", new MetaMaterial(m("DRAGON_EGG"), false));
        set("SNIFFER_SPAWN_EGG", new MetaMaterial(m("PIG_SPAWN_EGG"), false));
        set("SNORT_POTTERY_SHERD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("SNOW_GOLEM_SPAWN_EGG", new MetaMaterial(m("SNOWBALL"), false));
        set("SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("SPRUCE_HANGING_SIGN", new MetaMaterial(m("SPRUCE_SIGN"), false));
        set("SPRUCE_WALL_HANGING_SIGN", new MetaMaterial(m("SPRUCE_WALL_SIGN"), false));
        set("STRIPPED_BAMBOO_BLOCK", new MetaMaterial(m("BIRCH_WOOD"), false));
        set("STRIPPED_CHERRY_LOG", new MetaMaterial(m("STRIPPED_ACACIA_LOG"), false));
        set("STRIPPED_CHERRY_WOOD", new MetaMaterial(m("STRIPPED_ACACIA_WOOD"), false));
        set("SUSPICIOUS_GRAVEL", new MetaMaterial(m("GRAVEL"), false));
        set("SUSPICIOUS_SAND", new MetaMaterial(m("SAND"), false));
        set("TIDE_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("TORCHFLOWER", new MetaMaterial(m("RED_TULIP"), false));
        set("TORCHFLOWER_CROP", new MetaMaterial(m("RED_TULIP"), false));
        set("TORCHFLOWER_SEEDS", new MetaMaterial(m("RED_TULIP"), false));
        set("VEX_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("WARD_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("WARPED_HANGING_SIGN", new MetaMaterial(m("BIRCH_SIGN"), false));
        set("WARPED_WALL_HANGING_SIGN", new MetaMaterial(m("BIRCH_WALL_SIGN"), false));
        set("WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("WILD_ARMOR_TRIM_SMITHING_TEMPLATE", new MetaMaterial(m("PAPER"), false));
        set("WITHER_SPAWN_EGG", new MetaMaterial(m("CAVE_SPIDER_SPAWN_EGG"), false));

        // 1.19 -> 1.18
        set("ACACIA_CHEST_BOAT", new MetaMaterial(m("ACACIA_BOAT"), false));
        set("ALLAY_SPAWN_EGG", new MetaMaterial(m("BAT_SPAWN_EGG"), false));
        set("BIRCH_CHEST_BOAT", new MetaMaterial(m("BIRCH_BOAT"), false));
        set("DARK_OAK_CHEST_BOAT", new MetaMaterial(m("DARK_OAK_BOAT"), false));
        set("DISC_FRAGMENT_5", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("ECHO_SHARD", new MetaMaterial(m("PRISMARINE_SHARD"), false));
        set("FROG_SPAWN_EGG", new MetaMaterial(m("CHICKEN_SPAWN_EGG"), false));
        set("FROGSPAWN", new MetaMaterial(m("SPAWNER"), false));
        set("GOAT_HORN", new MetaMaterial(m("NOTE_BLOCK"), false));
        set("JUNGLE_CHEST_BOAT", new MetaMaterial(m("JUNGLE_BOAT"), false));
        set("MANGROVE_BOAT", new MetaMaterial(m("ACACIA_BOAT"), false));
        set("MANGROVE_BUTTON", new MetaMaterial(m("ACACIA_BUTTON"), false));
        set("MANGROVE_CHEST_BOAT", new MetaMaterial(m("ACACIA_BOAT"), false));
        set("MANGROVE_DOOR", new MetaMaterial(m("ACACIA_DOOR"), false));
        set("MANGROVE_FENCE", new MetaMaterial(m("ACACIA_FENCE"), false));
        set("MANGROVE_FENCE_GATE", new MetaMaterial(m("ACACIA_FENCE_GATE"), false));
        set("MANGROVE_LEAVES", new MetaMaterial(m("ACACIA_LEAVES"), false));
        set("MANGROVE_LOG", new MetaMaterial(m("ACACIA_LOG"), false));
        set("MANGROVE_PLANKS", new MetaMaterial(m("ACACIA_PLANKS"), false));
        set("MANGROVE_PRESSURE_PLATE", new MetaMaterial(m("ACACIA_PRESSURE_PLATE"), false));
        set("MANGROVE_PROPAGULE", new MetaMaterial(m("ACACIA_SAPLING"), false));
        set("MANGROVE_ROOTS", new MetaMaterial(m("ACACIA_LOG"), false));
        set("MANGROVE_SIGN", new MetaMaterial(m("ACACIA_SIGN"), false));
        set("MANGROVE_SLAB", new MetaMaterial(m("ACACIA_SLAB"), false));
        set("MANGROVE_STAIRS", new MetaMaterial(m("ACACIA_STAIRS"), false));
        set("MANGROVE_TRAPDOOR", new MetaMaterial(m("ACACIA_TRAPDOOR"), false));
        set("MANGROVE_WALL_SIGN", new MetaMaterial(m("ACACIA_WALL_SIGN"), false));
        set("MANGROVE_WOOD", new MetaMaterial(m("ACACIA_WOOD"), false));
        set("MUD", new MetaMaterial(m("DIRT"), false));
        set("MUD_BRICK_SLAB", new MetaMaterial(m("BRICK_SLAB"), false));
        set("MUD_BRICK_STAIRS", new MetaMaterial(m("BRICK_STAIRS"), false));
        set("MUD_BRICK_WALL", new MetaMaterial(m("BRICK_WALL"), false));
        set("MUD_BRICKS", new MetaMaterial(m("BRICKS"), false));
        set("MUDDY_MANGROVE_ROOTS", new MetaMaterial(m("ACACIA_LOG"), false));
        set("MUSIC_DISC_5", new MetaMaterial(m("MUSIC_DISC_BLOCKS"), false));
        set("OAK_CHEST_BOAT", new MetaMaterial(m("OAK_BOAT"), false));
        set("OCHRE_FROGLIGHT", new MetaMaterial(m("GLOWSTONE"), false));
        set("PACKED_MUD", new MetaMaterial(m("COARSE_DIRT"), false));
        set("PEARLESCENT_FROGLIGHT", new MetaMaterial(m("GLOWSTONE"), false));
        set("POTTED_MANGROVE_PROPAGULE", new MetaMaterial(m("POTTED_ACACIA_SAPLING"), false));
        set("RECOVERY_COMPASS", new MetaMaterial(m("COMPASS"), false));
        set("REINFORCED_DEEPSLATE", new MetaMaterial(m("STONE"), false));
        set("SCULK", new MetaMaterial(m("COARSE_DIRT"), false));
        set("SCULK_CATALYST", new MetaMaterial(m("DAYLIGHT_DETECTOR"), false));
        set("SCULK_SHRIEKER", new MetaMaterial(m("DAYLIGHT_DETECTOR"), false));
        set("SCULK_VEIN", new MetaMaterial(m("COARSE_DIRT"), false));
        set("SPRUCE_CHEST_BOAT", new MetaMaterial(m("SPRUCE_BOAT"), false));
        set("STRIPPED_MANGROVE_LOG", new MetaMaterial(m("STRIPPED_ACACIA_LOG"), false));
        set("TADPOLE_BUCKET", new MetaMaterial(m("SALMON_BUCKET"), false));
        set("TADPOLE_SPAWN_EGG", new MetaMaterial(m("SALMON_SPAWN_EGG"), false));
        set("VERDANT_FROGLIGHT", new MetaMaterial(m("GLOWSTONE"), false));
        set("WARDEN_SPAWN_EGG", new MetaMaterial(m("ENDERMAN_SPAWN_EGG"), false));

        // 1.18 -> 1.17
        set("MUSIC_DISC_OTHERSIDE", new MetaMaterial(m("MUSIC_DISC_CHIRP"), false));

        // 1.17 -> 1.16
        set("AMETHYST_BLOCK", new MetaMaterial(m("EMERALD_BLOCK"), false));
        set("AMETHYST_CLUSTER", new MetaMaterial(m("FIRE_CORAL_WALL_FAN"), false));
        set("AMETHYST_SHARD", new MetaMaterial(m("EMERALD"), false));
        set("AXOLOTL_BUCKET", new MetaMaterial(m("SALMON_BUCKET"), false));
        set("AXOLOTL_SPAWN_EGG", new MetaMaterial(m("SALMON_SPAWN_EGG"), false));
        set("AZALEA", new MetaMaterial(m("OAK_LEAVES"), false));
        set("AZALEA_LEAVES", new MetaMaterial(m("OAK_LEAVES"), false));
        set("BIG_DRIPLEAF", new MetaMaterial(m("OAK_LEAVES"), false));
        set("BIG_DRIPLEAF_STEM", new MetaMaterial(m("OAK_LEAVES"), false));
        set("BLACK_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("BLACK_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("BLUE_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("BLUE_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("BROWN_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("BROWN_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("BUDDING_AMETHYST", new MetaMaterial(m("EMERALD_BLOCK"), false));
        set("BUNDLE", new MetaMaterial(m("CHEST"), false));
        set("CALCITE", new MetaMaterial(m("DIORITE"), false));
        set("CANDLE", new MetaMaterial(m("TORCH"), false));
        set("CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("CAVE_VINES", new MetaMaterial(m("VINE"), false));
        set("CAVE_VINES_PLANT", new MetaMaterial(m("VINE"), false));
        set("CHISELED_DEEPSLATE", new MetaMaterial(m("CHISELED_STONE_BRICKS"), false));
        set("COBBLED_DEEPSLATE", new MetaMaterial(m("COBBLESTONE"), false));
        set("COBBLED_DEEPSLATE_SLAB", new MetaMaterial(m("COBBLESTONE_SLAB"), false));
        set("COBBLED_DEEPSLATE_STAIRS", new MetaMaterial(m("COBBLESTONE_STAIRS"), false));
        set("COBBLED_DEEPSLATE_WALL", new MetaMaterial(m("COBBLESTONE_WALL"), false));
        set("COPPER_BLOCK", new MetaMaterial(m("IRON_BLOCK"), false));
        set("COPPER_INGOT", new MetaMaterial(m("IRON_INGOT"), false));
        set("COPPER_ORE", new MetaMaterial(m("IRON_ORE"), false));
        set("CRACKED_DEEPSLATE_BRICKS", new MetaMaterial(m("CRACKED_STONE_BRICKS"), false));
        set("CRACKED_DEEPSLATE_TILES", new MetaMaterial(m("CRACKED_STONE_BRICKS"), false));
        set("CUT_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("CUT_COPPER_SLAB", new MetaMaterial(m("STONE_SLAB"), false));
        set("CUT_COPPER_STAIRS", new MetaMaterial(m("STONE_STAIRS"), false));
        set("CYAN_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("CYAN_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("DEEPSLATE", new MetaMaterial(m("STONE"), false));
        set("DEEPSLATE_BRICK_SLAB", new MetaMaterial(m("STONE_BRICK_SLAB"), false));
        set("DEEPSLATE_BRICK_STAIRS", new MetaMaterial(m("STONE_BRICK_STAIRS"), false));
        set("DEEPSLATE_BRICK_WALL", new MetaMaterial(m("STONE_BRICK_WALL"), false));
        set("DEEPSLATE_BRICKS", new MetaMaterial(m("STONE_BRICKS"), false));
        set("DEEPSLATE_COAL_ORE", new MetaMaterial(m("COAL_ORE"), false));
        set("DEEPSLATE_COPPER_ORE", new MetaMaterial(m("IRON_ORE"), false));
        set("DEEPSLATE_DIAMOND_ORE", new MetaMaterial(m("DIAMOND_ORE"), false));
        set("DEEPSLATE_EMERALD_ORE", new MetaMaterial(m("EMERALD_ORE"), false));
        set("DEEPSLATE_GOLD_ORE", new MetaMaterial(m("GOLD_ORE"), false));
        set("DEEPSLATE_IRON_ORE", new MetaMaterial(m("IRON_ORE"), false));
        set("DEEPSLATE_LAPIS_ORE", new MetaMaterial(m("LAPIS_ORE"), false));
        set("DEEPSLATE_REDSTONE_ORE", new MetaMaterial(m("REDSTONE_ORE"), false));
        set("DEEPSLATE_TILE_SLAB", new MetaMaterial(m("STONE_BRICK_SLAB"), false));
        set("DEEPSLATE_TILE_STAIRS", new MetaMaterial(m("STONE_BRICK_STAIRS"), false));
        set("DEEPSLATE_TILE_WALL", new MetaMaterial(m("STONE_BRICK_WALL"), false));
        set("DEEPSLATE_TILES", new MetaMaterial(m("STONE_BRICKS"), false));
        set("DIRT_PATH", new MetaMaterial(m("GRASS_PATH")));
        set("DRIPSTONE_BLOCK", new MetaMaterial(m("STONE"), false));
        set("EXPOSED_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("EXPOSED_CUT_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("EXPOSED_CUT_COPPER_SLAB", new MetaMaterial(m("STONE_SLAB"), false));
        set("EXPOSED_CUT_COPPER_STAIRS", new MetaMaterial(m("STONE_STAIRS"), false));
        set("FLOWERING_AZALEA", new MetaMaterial(m("OAK_LEAVES"), false));
        set("FLOWERING_AZALEA_LEAVES", new MetaMaterial(m("OAK_LEAVES"), false));
        set("GLOW_BERRIES", new MetaMaterial(m("SWEET_BERRIES"), false));
        set("GLOW_INK_SAC", new MetaMaterial(m("INK_SAC"), false));
        set("GLOW_ITEM_FRAME", new MetaMaterial(m("ITEM_FRAME"), false));
        set("GLOW_LICHEN", new MetaMaterial(m("VINE"), false));
        set("GLOW_SQUID_SPAWN_EGG", new MetaMaterial(m("SQUID_SPAWN_EGG"), false));
        set("GOAT_SPAWN_EGG", new MetaMaterial(m("SHEEP_SPAWN_EGG"), false));
        set("GRAY_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("GRAY_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("GREEN_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("GREEN_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("HANGING_ROOTS", new MetaMaterial(m("DEAD_BRAIN_CORAL_FAN"), false));
        set("INFESTED_DEEPSLATE", new MetaMaterial(m("INFESTED_STONE"), false));
        set("LARGE_AMETHYST_BUD", new MetaMaterial(m("FIRE_CORAL_WALL_FAN"), false));
        set("LAVA_CAULDRON", new MetaMaterial(m("CAULDRON"), false));
        set("LIGHT", new MetaMaterial(m("GLOWSTONE"), false));
        set("LIGHT_BLUE_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("LIGHT_BLUE_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("LIGHT_GRAY_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("LIGHT_GRAY_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("LIGHTNING_ROD", new MetaMaterial(m("END_ROD"), false));
        set("LIME_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("LIME_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("MAGENTA_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("MAGENTA_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("MEDIUM_AMETHYST_BUD", new MetaMaterial(m("FIRE_CORAL_WALL_FAN"), false));
        set("MOSS_BLOCK", new MetaMaterial(m("DIRT"), false));
        set("MOSS_CARPET", new MetaMaterial(m("LIME_CARPET"), false));
        set("ORANGE_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("ORANGE_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("OXIDIZED_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("OXIDIZED_CUT_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("OXIDIZED_CUT_COPPER_SLAB", new MetaMaterial(m("STONE_SLAB"), false));
        set("OXIDIZED_CUT_COPPER_STAIRS", new MetaMaterial(m("STONE_STAIRS"), false));
        set("PINK_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("PINK_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("POINTED_DRIPSTONE", new MetaMaterial(m("STONE"), false));
        set("POLISHED_DEEPSLATE", new MetaMaterial(m("POLISHED_ANDESITE"), false));
        set("POLISHED_DEEPSLATE_SLAB", new MetaMaterial(m("POLISHED_ANDESITE_SLAB"), false));
        set("POLISHED_DEEPSLATE_STAIRS", new MetaMaterial(m("POLISHED_ANDESITE_STAIRS"), false));
        set("POLISHED_DEEPSLATE_WALL", new MetaMaterial(m("ANDESITE_WALL"), false));
        set("POTTED_AZALEA_BUSH", new MetaMaterial(m("POTTED_CACTUS"), false));
        set("POTTED_FLOWERING_AZALEA_BUSH", new MetaMaterial(m("POTTED_CACTUS"), false));
        set("POWDER_SNOW", new MetaMaterial(m("SNOW_BLOCK"), false));
        set("POWDER_SNOW_BUCKET", new MetaMaterial(m("MILK_BUCKET"), false));
        set("POWDER_SNOW_CAULDRON", new MetaMaterial(m("CAULDRON"), false));
        set("PURPLE_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("PURPLE_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("RAW_COPPER", new MetaMaterial(m("IRON_ORE"), false));
        set("RAW_COPPER_BLOCK", new MetaMaterial(m("IRON_ORE"), false));
        set("RAW_GOLD", new MetaMaterial(m("GOLD_ORE"), false));
        set("RAW_GOLD_BLOCK", new MetaMaterial(m("GOLD_ORE"), false));
        set("RAW_IRON", new MetaMaterial(m("IRON_ORE"), false));
        set("RAW_IRON_BLOCK", new MetaMaterial(m("IRON_ORE"), false));
        set("RED_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("RED_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("ROOTED_DIRT", new MetaMaterial(m("COARSE_DIRT"), false));
        set("SCULK_SENSOR", new MetaMaterial(m("DAYLIGHT_DETECTOR"), false));
        set("SMALL_AMETHYST_BUD", new MetaMaterial(m("FIRE_CORAL_WALL_FAN"), false));
        set("SMALL_DRIPLEAF", new MetaMaterial(m("OAK_LEAVES"), false));
        set("SMOOTH_BASALT", new MetaMaterial(m("SMOOTH_STONE"), false));
        set("SPORE_BLOSSOM", new MetaMaterial(m("BUBBLE_CORAL_FAN"), false));
        set("SPYGLASS", new MetaMaterial(m("GLASS_BOTTLE"), false));
        set("TINTED_GLASS", new MetaMaterial(m("BLACK_STAINED_GLASS"), false));
        set("TUFF", new MetaMaterial(m("PODZOL"), false));
        set("WATER_CAULDRON", new MetaMaterial(m("CAULDRON"), false));
        set("WAXED_COPPER_BLOCK", new MetaMaterial(m("IRON_BLOCK"), false));
        set("WAXED_CUT_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("WAXED_CUT_COPPER_SLAB", new MetaMaterial(m("STONE_BRICK_SLAB"), false));
        set("WAXED_CUT_COPPER_STAIRS", new MetaMaterial(m("STONE_BRICK_STAIRS"), false));
        set("WAXED_EXPOSED_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("WAXED_EXPOSED_CUT_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("WAXED_EXPOSED_CUT_COPPER_SLAB", new MetaMaterial(m("STONE_BRICK_SLAB"), false));
        set("WAXED_EXPOSED_CUT_COPPER_STAIRS", new MetaMaterial(m("STONE_BRICK_STAIRS"), false));
        set("WAXED_OXIDIZED_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("WAXED_OXIDIZED_CUT_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("WAXED_OXIDIZED_CUT_COPPER_SLAB", new MetaMaterial(m("STONE_BRICK_SLAB"), false));
        set("WAXED_OXIDIZED_CUT_COPPER_STAIRS", new MetaMaterial(m("STONE_BRICK_STAIRS"), false));
        set("WAXED_WEATHERED_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("WAXED_WEATHERED_CUT_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("WAXED_WEATHERED_CUT_COPPER_SLAB", new MetaMaterial(m("STONE_BRICK_SLAB"), false));
        set("WAXED_WEATHERED_CUT_COPPER_STAIRS", new MetaMaterial(m("STONE_BRICK_STAIRS"), false));
        set("WEATHERED_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("WEATHERED_CUT_COPPER", new MetaMaterial(m("IRON_BLOCK"), false));
        set("WEATHERED_CUT_COPPER_SLAB", new MetaMaterial(m("STONE_BRICK_SLAB"), false));
        set("WEATHERED_CUT_COPPER_STAIRS", new MetaMaterial(m("STONE_BRICK_STAIRS"), false));
        set("WHITE_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("WHITE_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));
        set("YELLOW_CANDLE", new MetaMaterial(m("TORCH"), false));
        set("YELLOW_CANDLE_CAKE", new MetaMaterial(m("CAKE"), false));

        // 1.16 -> 1.15
        set("ANCIENT_DEBRIS", new MetaMaterial(m("NETHER_QUARTZ_ORE"), false));
        set("BASALT", new MetaMaterial(m("STONE"), false));
        set("BLACKSTONE", new MetaMaterial(m("STONE"), false));
        set("BLACKSTONE_SLAB", new MetaMaterial(m("STONE_SLAB"), false));
        set("BLACKSTONE_STAIRS", new MetaMaterial(m("STONE_STAIRS"), false));
        set("BLACKSTONE_WALL", new MetaMaterial(m("STONE_BRICK_WALL"), false));
        set("CHAIN", new MetaMaterial(m("IRON_BARS"), false));
        set("CHISELED_NETHER_BRICKS", new MetaMaterial(m("NETHER_BRICKS"), false));
        set("CHISELED_POLISHED_BLACKSTONE", new MetaMaterial(m("POLISHED_GRANITE"), false));
        set("CRACKED_NETHER_BRICKS", new MetaMaterial(m("NETHER_BRICKS"), false));
        set("CRACKED_POLISHED_BLACKSTONE_BRICKS", new MetaMaterial(m("CRACKED_STONE_BRICKS"), false));
        set("CRIMSON_BUTTON", new MetaMaterial(m("ACACIA_BUTTON"), false));
        set("CRIMSON_DOOR", new MetaMaterial(m("ACACIA_DOOR"), false));
        set("CRIMSON_FENCE", new MetaMaterial(m("ACACIA_FENCE"), false));
        set("CRIMSON_FENCE_GATE", new MetaMaterial(m("ACACIA_FENCE_GATE"), false));
        set("CRIMSON_FUNGUS", new MetaMaterial(m("RED_MUSHROOM"), false));
        set("CRIMSON_BUTTON", new MetaMaterial(m("ACACIA_BUTTON"), false));
        set("CRIMSON_HYPHAE", new MetaMaterial(m("ACACIA_WOOD"), false));
        set("CRIMSON_NYLIUM", new MetaMaterial(m("NETHERRACK"), false));
        set("CRIMSON_PLANKS", new MetaMaterial(m("ACACIA_PLANKS"), false));
        set("CRIMSON_PRESSURE_PLATE", new MetaMaterial(m("ACACIA_PRESSURE_PLATE"), false));
        set("CRIMSON_ROOTS", new MetaMaterial(m("BROWN_MUSHROOM"), false));
        set("CRIMSON_SIGN", new MetaMaterial(m("ACACIA_SIGN"), false));
        set("CRIMSON_STAIRS", new MetaMaterial(m("ACACIA_STAIRS"), false));
        set("CRIMSON_STEM", new MetaMaterial(m("ACACIA_LOG"), false));
        set("CRIMSON_TRAPDOOR", new MetaMaterial(m("ACACIA_TRAPDOOR"), false));
        set("CRIMSON_WALL_SIGN", new MetaMaterial(m("ACACIA_WALL_SIGN"), false));
        set("CRYING_OBSIDIAN", new MetaMaterial(m("OBSIDIAN"), false));
        set("GILDED_BLACKSTONE", new MetaMaterial(m("STONE"), false));
        set("HOGLIN_SPAWN_EGG", new MetaMaterial(m("PIG_SPAWN_EGG"), false));
        set("LODESTONE", new MetaMaterial(m("BEACON"), false));
        set("MUSIC_DISC_PIGSTEP", new MetaMaterial(m("MUSIC_DISC_CHIRP"), false));
        set("NETHER_GOLD_ORE", new MetaMaterial(m("GOLD_ORE"), false));
        set("NETHER_SPROUTS", new MetaMaterial(m("BROWN_MUSHROOM"), false));
        set("NETHERITE_AXE", new MetaMaterial(m("DIAMOND_AXE"), false));
        set("NETHERITE_BLOCK", new MetaMaterial(m("DIAMOND_BLOCK"), false));
        set("NETHERITE_BOOTS", new MetaMaterial(m("DIAMOND_BOOTS"), false));
        set("NETHERITE_CHESTPLATE", new MetaMaterial(m("DIAMOND_CHESTPLATE"), false));
        set("NETHERITE_HELMET", new MetaMaterial(m("DIAMOND_HELMET"), false));
        set("NETHERITE_HOE", new MetaMaterial(m("DIAMOND_HOE"), false));
        set("NETHERITE_INGOT", new MetaMaterial(m("GOLD_INGOT"), false));
        set("NETHERITE_LEGGINGS", new MetaMaterial(m("DIAMOND_LEGGINGS"), false));
        set("NETHERITE_PICKAXE", new MetaMaterial(m("DIAMOND_PICKAXE"), false));
        set("NETHERITE_SCRAP", new MetaMaterial(m("GOLD_NUGGET"), false));
        set("NETHERITE_SHOVEL", new MetaMaterial(m("DIAMOND_SHOVEL"), false));
        set("NETHERITE_SWORD", new MetaMaterial(m("DIAMOND_SWORD"), false));
        set("PIGLIN_BANNER_PATTEN", new MetaMaterial(m("CREEPER_BANNER_PATTERN"), false));
        set("PIGLIN_BRUTE_SPAWN_EGG", new MetaMaterial(m("ZOMBIE_PIGMAN_SPAWN_EGG"), false));
        set("PIGLIN_SPAWN_EGG", new MetaMaterial(m("ZOMBIE_PIGMAN_SPAWN_EGG"), false));
        set("POLISHED_BASALT", new MetaMaterial(m("POLISHED_GRANITE"), false));
        set("POLISHED_BLACKSTONE", new MetaMaterial(m("POLISHED_GRANITE"), false));
        set("POLISHED_BLACKSTONE_BRICK_SLAB", new MetaMaterial(m("STONE_BRICK_SLAB"), false));
        set("POLISHED_BLACKSTONE_BRICK_STAIRS", new MetaMaterial(m("STONE_BRICK_STAIRS"), false));
        set("POLISHED_BLACKSTONE_BRICK_WALL", new MetaMaterial(m("STONE_BRICK_WALL"), false));
        set("POLISHED_BLACKSTONE_BUTTON", new MetaMaterial(m("STONE_BUTTON"), false));
        set("POLISHED_BLACKSTONE_PRESSURE_PLATE", new MetaMaterial(m("STONE_PRESSURE_PLATE"), false));
        set("POLISHED_BLACKSTONE_SLAB", new MetaMaterial(m("POLISHED_GRANITE_SLAB"), false));
        set("POLISHED_BLACKSTONE_STAIRS", new MetaMaterial(m("POLISHED_GRANITE_STAIRS"), false));
        set("POLISHED_BLACKSTONE_WALL", new MetaMaterial(m("STONE_BRICK_WALL"), false));
        set("POTTED_CRIMSON_FUNGUS", new MetaMaterial(m("POTTED_RED_MUSHROOM"), false));
        set("POTTED_CRIMSON_ROOTS", new MetaMaterial(m("POTTED_RED_MUSHROOM"), false));
        set("WARPED_CRIMSON_FUNGUS", new MetaMaterial(m("POTTED_BROWN_MUSHROOM"), false));
        set("WARPED_CRIMSON_ROOTS", new MetaMaterial(m("POTTED_BROWN_MUSHROOM"), false));
        set("QUARTZ_BRICKS", new MetaMaterial(m("END_STONE_BRICKS"), false));
        set("RESPAWN_ANCHOR", new MetaMaterial(m("BEACON"), false));
        set("SHROOMLIGHT", new MetaMaterial(m("GLOWSTONE"), false));
        set("SOUL_CAMPFIRE", new MetaMaterial(m("CAMPFIRE"), false));
        set("SOUL_FIRE", new MetaMaterial(m("FIRE"), false));
        set("SOUL_LANTERN", new MetaMaterial(m("LANTERN"), false));
        set("SOUL_SOIL", new MetaMaterial(m("SOUL_SAND"), false));
        set("SOUL_TORCH", new MetaMaterial(m("TORCH"), false));
        set("SOUL_WALL_TORCH", new MetaMaterial(m("WALL_TORCH"), false));
        set("STRIDER_SPAWN_EGG", new MetaMaterial(m("PIG_SPAWN_EGG"), false));
        set("STRIPPED_CRIMSON_HYPHAE", new MetaMaterial(m("STRIPPED_ACACIA_WOOD"), false));
        set("STRIPPED_CRIMSON_STEM", new MetaMaterial(m("STRIPPED_ACACIA_LOG"), false));
        set("STRIPPED_WARPED_HYPHAE", new MetaMaterial(m("STRIPPED_BIRCH_WOOD"), false));
        set("STRIPPED_WARPED_STEM", new MetaMaterial(m("STRIPPED_BIRCH_LOG"), false));
        set("TARGET", new MetaMaterial(m("RED_WOOL"), false));
        set("TWISTING_VINES", new MetaMaterial(m("VINE"), false));
        set("TWISTING_VINES_PLANT", new MetaMaterial(m("VINE"), false));
        set("WARPED_BUTTON", new MetaMaterial(m("BIRCH_BUTTON"), false));
        set("WARPED_DOOR", new MetaMaterial(m("BIRCH_DOOR"), false));
        set("WARPED_FENCE", new MetaMaterial(m("BIRCH_FENCE"), false));
        set("WARPED_FENCE_GATE", new MetaMaterial(m("BIRCH_FENCE_GATE"), false));
        set("WARPED_FUNGUS", new MetaMaterial(m("BROWN_MUSHROOM"), false));
        set("WARPED_FUNGUS_ON_A_STICK", new MetaMaterial(m("CARROT_ON_A_STICK"), false));
        set("WARPED_HYPHAE", new MetaMaterial(m("BIRCH_WOOD"), false));
        set("WARPED_NYLIUM", new MetaMaterial(m("NETHERRACK"), false));
        set("WARPED_PLANKS", new MetaMaterial(m("BIRCH_PLANKS"), false));
        set("WARPED_PRESSURE_PLATE", new MetaMaterial(m("BIRCH_PRESSURE_PLATE"), false));
        set("WARPED_ROOTS", new MetaMaterial(m("BROWN_MUSHROOM"), false));
        set("WARPED_SIGN", new MetaMaterial(m("BIRCH_SIGN"), false));
        set("WARPED_SLAB", new MetaMaterial(m("BIRCH_SLAB"), false));
        set("WARPED_STAIRS", new MetaMaterial(m("BIRCH_STAIRS"), false));
        set("WARPED_STEM", new MetaMaterial(m("BIRCH_LOG"), false));
        set("WARPED_TRAPDOOR", new MetaMaterial(m("BIRCH_TRAPDOOR"), false));
        set("WARPED_WALL_SIGN", new MetaMaterial(m("BIRCH_WALL_SIGN"), false));
        set("WARPED_WART_BLOCK", new MetaMaterial(m("BIRCH_LEAVES"), false));
        set("WEEPING_VINES", new MetaMaterial(m("VINE"), false));
        set("WEEPING_VINES_PLANT", new MetaMaterial(m("VINE"), false));
        set("ZOGLIN_SPAWN_EGG", new MetaMaterial(m("PIG_SPAWN_EGG"), false));
        set("ZOMBIFIED_PIGLIN_SPAWN_EGG", new MetaMaterial(m("ZOMBIE_PIGMAN_SPAWN_EGG"), false));

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
