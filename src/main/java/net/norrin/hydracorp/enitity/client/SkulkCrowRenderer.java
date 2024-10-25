package net.norrin.hydracorp.enitity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.norrin.hydracorp.HydraCorp;
import net.norrin.hydracorp.enitity.custom.SkulkCrowEntity;

public class SkulkCrowRenderer extends MobRenderer<SkulkCrowEntity, SkulkCrowModel<SkulkCrowEntity>> {
    public SkulkCrowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SkulkCrowModel<>(pContext.bakeLayer(ModModelLayers.CROW_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(SkulkCrowEntity pEntity) {
        return new ResourceLocation(HydraCorp.MODID, "textures/entity/skulkcrow.png");
    }

    @Override
    public void render(SkulkCrowEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()){
            pMatrixStack.scale(.5f,.5f,.5f)
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
