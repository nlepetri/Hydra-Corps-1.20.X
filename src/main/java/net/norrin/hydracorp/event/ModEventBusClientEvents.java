package net.norrin.hydracorp.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.norrin.hydracorp.HydraCorp;
import net.norrin.hydracorp.enitity.client.ModModelLayers;
import net.norrin.hydracorp.enitity.client.SkulkCrowModel;

@Mod.EventBusSubscriber(modid = HydraCorp.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.CROW_LAYER, SkulkCrowModel::createBodyLayer);
    }
}

