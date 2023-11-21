package net.rainach.ruins_fantasy.event;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rainach.ruins_fantasy.RuinsFantasy;
import net.rainach.ruins_fantasy.entity.client.ModModelLayers;
import net.rainach.ruins_fantasy.entity.client.Wolfarn.WolfarnModel;

@Mod.EventBusSubscriber(modid = RuinsFantasy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.WOLFARN_LAYER, WolfarnModel::createBodyLayer);
    }

}
