package net.norrin.hydracorp.enitity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.norrin.hydracorp.HydraCorp;
import net.norrin.hydracorp.enitity.custom.SkulkCrowEntity;

import javax.swing.text.html.parser.Entity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HydraCorp.MODID);

    public static final RegistryObject<EntityType<SkulkCrowEntity>> CROW =
            ENTITY_TYPES.register("skulkcrow", () -> EntityType.Builder.of(SkulkCrowEntity::new, MobCategory.CREATURE).sized(.9f, .5f).build("skulkcrow"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
