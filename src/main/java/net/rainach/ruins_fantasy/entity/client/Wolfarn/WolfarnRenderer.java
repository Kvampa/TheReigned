package net.rainach.ruins_fantasy.entity.client.Wolfarn;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.rainach.ruins_fantasy.RuinsFantasy;
import net.rainach.ruins_fantasy.entity.client.ModModelLayers;
import net.rainach.ruins_fantasy.entity.custom.WolfarnEntity;

public class WolfarnRenderer extends MobRenderer<WolfarnEntity, WolfarnModel<WolfarnEntity>> {
    private static final ResourceLocation WOLFARN_LOCATION = new ResourceLocation(RuinsFantasy.MOD_ID, "textures/entity/wolfarn.png");
    private static final ResourceLocation WOLFARN_ANGRY_LOCATION = new ResourceLocation(RuinsFantasy.MOD_ID, "textures/entity/wolfarn_angry.png");
    public WolfarnRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new WolfarnModel<>(pContext.bakeLayer(ModModelLayers.WOLFARN_LAYER)), 0.9f);
    }

    @Override
    public ResourceLocation getTextureLocation(WolfarnEntity pEntity) {
        return  WOLFARN_LOCATION;

    }

    @Override
    public void render(WolfarnEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f,0.5f,0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
