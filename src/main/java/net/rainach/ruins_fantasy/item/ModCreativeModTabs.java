package net.rainach.ruins_fantasy.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rainach.ruins_fantasy.RuinsFantasy;
import net.rainach.ruins_fantasy.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RuinsFantasy.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TR_BLOCKS_TAB = CREATIVE_MODE_TABS.register("tr_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TOMBS_BRICKS.get()))
                    .displayItems((pParameters, pOutput) -> {


                        pOutput.accept(ModBlocks.TOMBS_BRICKS.get());
                        pOutput.accept(ModBlocks.TOMBS_CARVED_BRICKS.get());
                        pOutput.accept(ModBlocks.TOMBS_BRICKS_COLUMN.get());
                        pOutput.accept(ModBlocks.TOMBS_BRICKS_SLAB.get());
                        pOutput.accept(ModBlocks.TOMBS_BRICKS_STAIRS.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
