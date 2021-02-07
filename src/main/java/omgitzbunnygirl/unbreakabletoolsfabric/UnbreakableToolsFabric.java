package omgitzbunnygirl.unbreakabletoolsfabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import omgitzbunnygirl.unbreakabletoolsfabric.item.*;

public class UnbreakableToolsFabric implements ModInitializer {


    public static final ItemGroup UNBREAKABLE_TOOLS_GROUP = FabricItemGroupBuilder.build(new Identifier("unbreakabletoolsfabric", "unbreakable_tools_group"), () -> new ItemStack(Items.ENCHANTED_BOOK));


    // Tools
    // Wooden
    public static ToolItem UNBREAKABLE_WOODEN_PICKAXE = new UnbreakablePickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_WOODEN_AXE = new UnbreakableAxeItem(ToolMaterials.WOOD, 6.0F, -3.2F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_WOODEN_HOE = new UnbreakableHoeItem(ToolMaterials.WOOD, 0, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_WOODEN_SHOVEL = new UnbreakableShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_WOODEN_SWORD = new UnbreakableSwordItem(ToolMaterials.WOOD, 3, -2.8F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));

    // Stone
    public static ToolItem UNBREAKABLE_STONE_PICKAXE = new UnbreakablePickaxeItem(ToolMaterials.STONE, 1, -2.8F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_STONE_AXE = new UnbreakableAxeItem(ToolMaterials.STONE, 7.0F, -3.2F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_STONE_HOE = new UnbreakableHoeItem(ToolMaterials.STONE, 1, -2.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_STONE_SHOVEL = new UnbreakableShovelItem(ToolMaterials.STONE, 1.5F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_STONE_SWORD = new UnbreakableSwordItem(ToolMaterials.STONE, 3, -2.4F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));

    // Iron
    public static ToolItem UNBREAKABLE_IRON_PICKAXE = new UnbreakablePickaxeItem(ToolMaterials.IRON, 1, -2.8F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_IRON_AXE = new UnbreakableAxeItem(ToolMaterials.IRON, 6.0F, -3.1F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_IRON_HOE = new UnbreakableHoeItem(ToolMaterials.IRON, -2, -1.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_IRON_SHOVEL = new UnbreakableShovelItem(ToolMaterials.IRON, 1.5F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_IRON_SWORD = new UnbreakableSwordItem(ToolMaterials.IRON, 3, -2.4F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));

    // Diamond
    public static ToolItem UNBREAKABLE_DIAMOND_PICKAXE = new UnbreakablePickaxeItem(ToolMaterials.DIAMOND, 1, -2.8F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_DIAMOND_AXE = new UnbreakableAxeItem(ToolMaterials.DIAMOND, 5.0F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_DIAMOND_HOE = new UnbreakableHoeItem(ToolMaterials.DIAMOND, -3, -0.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_DIAMOND_SHOVEL = new UnbreakableShovelItem(ToolMaterials.DIAMOND, 1.5F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_DIAMOND_SWORD = new UnbreakableSwordItem(ToolMaterials.DIAMOND, 3, -2.4F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));

    // Golden
    public static ToolItem UNBREAKABLE_GOLDEN_PICKAXE = new UnbreakablePickaxeItem(ToolMaterials.GOLD, 1, -2.8F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_GOLDEN_AXE = new UnbreakableAxeItem(ToolMaterials.GOLD, 6.0F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_GOLDEN_HOE = new UnbreakableHoeItem(ToolMaterials.GOLD, 0, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_GOLDEN_SHOVEL = new UnbreakableShovelItem(ToolMaterials.GOLD, 1.5F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_GOLDEN_SWORD = new UnbreakableSwordItem(ToolMaterials.GOLD, 3, -2.4F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));

    // Netherite
    public static ToolItem UNBREAKABLE_NETHERITE_PICKAXE = new UnbreakablePickaxeItem(ToolMaterials.NETHERITE, 1, -2.8F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_NETHERITE_AXE = new UnbreakableAxeItem(ToolMaterials.NETHERITE, 5.0F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_NETHERITE_HOE = new UnbreakableHoeItem(ToolMaterials.NETHERITE, -4, 0.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_NETHERITE_SHOVEL = new UnbreakableShovelItem(ToolMaterials.NETHERITE, 1.5F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_NETHERITE_SWORD = new UnbreakableSwordItem(ToolMaterials.NETHERITE, 3, -2.4F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));

    // Other Tools
    public static UnbreakableBowItem UNBREAKABLE_BOW = new UnbreakableBowItem(new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));

    // Unbreakable Book
    public static UnbreakableBookItem UNBREAKABLE_BOOK = new UnbreakableBookItem(new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxCount(1).maxDamage(-2147483648));

    // Loot Tables
    private static final Identifier ABANDONED_MINESHAFT_LOOT_TABLE_ID = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier BURIED_TREASURE_LOOT_TABLE_ID = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier DESERT_PYRAMID_LOOT_TABLE_ID = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier JUNGLE_TEMPLE_LOOT_TABLE_ID = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier SHIPWRECK_TREASURE_LOOT_TABLE_ID = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier SIMPLE_DUNGEON_LOOT_TABLE_ID = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier STRONGHOLD_LIBRARY_LOOT_TABLE_ID = new Identifier("minecraft", "chests/stronghold_library");
    private static final Identifier TREASURE_FISHING_LOOT_TABLE_ID = new Identifier("minecraft", "gameplay/fishing/treasure");


    @Override
    public void onInitialize() {
        // Tools
        // Wooden
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_wooden_pickaxe"), UNBREAKABLE_WOODEN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_wooden_axe"), UNBREAKABLE_WOODEN_AXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_wooden_hoe"), UNBREAKABLE_WOODEN_HOE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_wooden_shovel"), UNBREAKABLE_WOODEN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_wooden_sword"), UNBREAKABLE_WOODEN_SWORD);

        // Stone
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_stone_pickaxe"), UNBREAKABLE_STONE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_stone_axe"), UNBREAKABLE_STONE_AXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_stone_hoe"), UNBREAKABLE_STONE_HOE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_stone_shovel"), UNBREAKABLE_STONE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_stone_sword"), UNBREAKABLE_STONE_SWORD);

        // Iron
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_iron_pickaxe"), UNBREAKABLE_IRON_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_iron_axe"), UNBREAKABLE_IRON_AXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_iron_hoe"), UNBREAKABLE_IRON_HOE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_iron_shovel"), UNBREAKABLE_IRON_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_iron_sword"), UNBREAKABLE_IRON_SWORD);

        // Diamond
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_diamond_pickaxe"), UNBREAKABLE_DIAMOND_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_diamond_axe"), UNBREAKABLE_DIAMOND_AXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_diamond_hoe"), UNBREAKABLE_DIAMOND_HOE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_diamond_shovel"), UNBREAKABLE_DIAMOND_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_diamond_sword"), UNBREAKABLE_DIAMOND_SWORD);

        // Golden
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_golden_pickaxe"), UNBREAKABLE_GOLDEN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_golden_axe"), UNBREAKABLE_GOLDEN_AXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_golden_hoe"), UNBREAKABLE_GOLDEN_HOE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_golden_shovel"), UNBREAKABLE_GOLDEN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_golden_sword"), UNBREAKABLE_GOLDEN_SWORD);

        // Netherite
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_netherite_pickaxe"), UNBREAKABLE_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_netherite_axe"), UNBREAKABLE_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_netherite_hoe"), UNBREAKABLE_NETHERITE_HOE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_netherite_shovel"), UNBREAKABLE_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_netherite_sword"), UNBREAKABLE_NETHERITE_SWORD);

        // Other Tools
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_bow"), UNBREAKABLE_BOW);

        // Unbreakable Book
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_book"), UNBREAKABLE_BOOK);


        // Loot tables
        // Abandoned Minseshaft
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (ABANDONED_MINESHAFT_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                        .weight(10)
                        .build());

                supplier.withPool(poolBuilder.build());
            }
        });

        // Buried Treasure
        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (BURIED_TREASURE_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                        .weight(5)
                        .build());

                supplier.withPool(poolBuilder.build());
            }
        });

        // Desert Pyramid
        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (DESERT_PYRAMID_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootTableRange.between(2.0F, 4.0F))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                        .weight(10)
                        .build());

                supplier.withPool(poolBuilder.build());
            }
        });

        // Jungle Temple
        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (JUNGLE_TEMPLE_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootTableRange.between(2.0F, 6.0F))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                        .weight(10)
                        .build());

                supplier.withPool(poolBuilder.build());
            }
        });

        // Shipwreck Treasure
        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (SHIPWRECK_TREASURE_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootTableRange.between(3.0F, 6.0F))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                        .weight(5)
                        .build());

                supplier.withPool(poolBuilder.build());
            }
        });

        // Simple Dungeon
        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (SIMPLE_DUNGEON_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootTableRange.between(1.0F, 3.0F))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                        .weight(10)
                        .build());

                supplier.withPool(poolBuilder.build());
            }
        });

        // Stronghold Library
        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (STRONGHOLD_LIBRARY_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootTableRange.between(2.0F, 10.0F))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                        .weight(10)
                        .build());

                supplier.withPool(poolBuilder.build());
            }
        });

        // Fishing
        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {
            if (TREASURE_FISHING_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withEntry(ItemEntry.builder(UNBREAKABLE_BOOK)
                        .weight(10)
                        .build());

                supplier.withPool(poolBuilder.build());
            }
        });

    }
}
