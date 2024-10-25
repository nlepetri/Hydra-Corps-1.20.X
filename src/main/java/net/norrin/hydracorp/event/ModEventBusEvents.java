package net.norrin.hydracorp.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.norrin.hydracorp.HydraCorp;
import net.norrin.hydracorp.enitity.ModEntities;

import net.norrin.hydracorp.enitity.custom.SkulkCrowEntity;

@Mod.EventBusSubscriber(modid = HydraCorp.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.CROW.get(), SkulkCrowEntity.createAttributes().build());
    }
}