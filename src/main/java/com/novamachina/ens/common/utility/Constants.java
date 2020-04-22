package com.novamachina.ens.common.utility;

public class Constants {

    public static class ModInfo {

        public static final String MOD_ID = "ens";
    }

    public static class Blocks {

        public static final String CRUSHED_ANDESITE   = createBlockName("crushed_andesite");
        public static final String CRUSHED_DIORITE    = createBlockName("crushed_diorite");
        public static final String CRUSHED_END_STONE  = createBlockName("crushed_end_stone");
        public static final String CRUSHED_GRANITE    = createBlockName("crushed_granite");
        public static final String CRUSHED_NETHERRACK = createBlockName("crushed_netherrack");
        public static final String DUST               = createBlockName("dust");

        private static String createBlockName(String name) {
            return "block_" + name;
        }
    }

    public static class Items {

        public static final String CROOK_WOOD          = createCrookName("wood");
        public static final String CROOK_STONE         = createCrookName("stone");
        public static final String CROOK_ANDESITE      = createCrookName("andesite");
        public static final String CROOK_GRANITE       = createCrookName("granite");
        public static final String CROOK_DIORITE       = createCrookName("diorite");
        public static final String CROOK_GOLD          = createCrookName("gold");
        public static final String CROOK_IRON          = createCrookName("iron");
        public static final String CROOK_DIAMOND       = createCrookName("diamond");
        public static final String CROOK_BONE          = createCrookName("bone");
        public static final String CROOK_CLAY_UNCOOKED = createCrookName("clay_uncooked");
        public static final String CROOK_CLAY          = createCrookName("clay");
        public static final String CROOK_PRISMARINE    = createCrookName("prismarine");
        public static final String CROOK_NETHERRACK    = createCrookName("netherrack");
        public static final String CROOK_PURPUR        = createCrookName("purpur");
        public static final String CROOK_BLAZE         = createCrookName("blaze");
        public static final String SILKWORM            = createItemName("silkworm");
        public static final String HAMMER_WOOD         = createHammername("wood");
        public static final String HAMMER_STONE        = createHammername("stone");
        public static final String HAMMER_IRON         = createHammername("iron");
        public static final String HAMMER_DIAMOND      = createHammername("diamond");
        public static final String HAMMER_GOLD         = createHammername("gold");
        public static final String OAK_SEED            = "oak";
        public static final String SPRUCE_SEED         = "spruce";
        public static final String BIRCH_SEED          = "birch";
        public static final String JUNGLE_SEED         = "jungle";
        public static final String ACACIA_SEED         = "acacia";
        public static final String DARK_OAK_SEED       = "darkoak";
        public static final String CACTUS_SEED         = "cactus";
        public static final String SUGARCANE_SEED      = "sugarcane";
        public static final String CARROT_SEED         = "carrot";
        public static final String POTATO_SEED         = "potato";
        public static final String SWEET_BERRY_SEED    = "berry";
        public static final String ANCIENT_SPORE       = createItemName("ancientspores");
        public static final String GRASS_SEED          = createItemName("grassseeds");
        public static final String COOKED_SILKWORM     = createItemName("cooked_silkworm");
        public static final String PORCELAIN_CLAY      = createItemName("porcelain_clay");
        public static final String STONE_PEBBLE        = createItemName("stone_pebble");
        public static final String GRANITE_PEBBLE      = createItemName("granite_pebble");
        public static final String DIORITE_PEBBLE      = createItemName("diorite_pebble");
        public static final String ANDESITE_PEBBLE     = createItemName("andesite_pebble");

        private static String createHammername(String name) {
            return createItemName(name) + "_hammer";
        }


        private static String createCrookName(String name) {
            return createItemName(name) + "_crook";
        }

        private static String createItemName(String name) {
            return "item_" + name;
        }


    }

    public class Ore {

        public static final String GOLD = "gold";
        public static final String IRON = "iron";
    }

    public class Registry {

        public static final String CROOK_REGISTRY    = "CROOK_REGISTRY";
        public static final String HAMMER_REGISTRY   = "HAMMER_REGISTRY";
        public static final String ORE_REGISTRY      = "ORE_REGISTRY";
        public static final String SEED_REGISTRY     = "SEED_REGISTRY";
        public static final String RESOURCE_REGISTRY = "RESOURCE_REGISTRY";
    }
}
