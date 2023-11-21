package net.rainach.ruins_fantasy.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rainach.ruins_fantasy.RuinsFantasy;
import net.rainach.ruins_fantasy.entity.ModEntities;
import net.rainach.ruins_fantasy.entity.custom.WolfarnEntity;

@Mod.EventBusSubscriber(modid = RuinsFantasy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.WOLFARN.get(), WolfarnEntity.createAttributes().build());
    }
}
