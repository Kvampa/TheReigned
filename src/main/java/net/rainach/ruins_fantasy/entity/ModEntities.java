package net.rainach.ruins_fantasy.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rainach.ruins_fantasy.RuinsFantasy;
import net.rainach.ruins_fantasy.entity.custom.WolfarnEntity;

import javax.swing.text.html.parser.Entity;


public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RuinsFantasy.MOD_ID);

    public static final RegistryObject<EntityType<WolfarnEntity>> WOLFARN =
            ENTITY_TYPES.register("wolfarn", () -> EntityType.Builder.of(WolfarnEntity::new, MobCategory.CREATURE)
                    .sized(1f,1f).build("wolfarn"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
