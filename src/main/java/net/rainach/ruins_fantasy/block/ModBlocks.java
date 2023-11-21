package net.rainach.ruins_fantasy.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;
import net.rainach.ruins_fantasy.RuinsFantasy;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.rainach.ruins_fantasy.item.ModItems;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RuinsFantasy.MOD_ID);

    public static final RegistryObject<Block> TOMBS_BRICKS =registerBlock("tombs_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> TOMBS_CARVED_BRICKS =registerBlock("tombs_carved_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> TOMBS_BRICKS_COLUMN =registerBlock("tombs_bricks_column",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> TOMBS_BRICKS_STAIRS =registerBlock("tombs_bricks_stairs",
            () -> new StairBlock(() -> ModBlocks.TOMBS_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> TOMBS_BRICKS_SLAB =registerBlock("tombs_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS)));


    private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
