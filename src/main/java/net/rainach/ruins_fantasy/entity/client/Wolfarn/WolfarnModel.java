package net.rainach.ruins_fantasy.entity.client.Wolfarn;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.rainach.ruins_fantasy.entity.animations.ModAnimationDefinitions;
import net.rainach.ruins_fantasy.entity.custom.WolfarnEntity;

public class WolfarnModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart wolfarn;
	private final ModelPart head;

	public WolfarnModel(ModelPart root) {
		this.wolfarn = root.getChild("wolfarn");
		this.head = wolfarn.getChild("body").getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition wolfarn = partdefinition.addOrReplaceChild("wolfarn", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = wolfarn.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.5F, -14.0F, -12.0F, 13.0F, 14.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(78, 3).addBox(-6.5F, 0.0F, -12.0F, 13.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(0, 27).addBox(-5.0F, -12.0F, 0.0F, 10.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, 1.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(42, 18).addBox(-5.5F, -4.0F, -9.0F, 11.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(58, 3).addBox(-2.5F, 5.0F, -9.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offset(0.0F, -11.0F, -11.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 3.0F, -7.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5F, 3.0F, -7.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition ear_r = head.addOrReplaceChild("ear_r", CubeListBuilder.create(), PartPose.offset(-4.0F, -2.0F, -3.0F));

		PartDefinition ear_r1 = ear_r.addOrReplaceChild("ear_r1", CubeListBuilder.create().texOffs(52, 68).addBox(-3.0F, -5.0F, -1.0F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition ear_l = head.addOrReplaceChild("ear_l", CubeListBuilder.create(), PartPose.offset(4.0F, -2.0F, -3.0F));

		PartDefinition ear_r2 = ear_l.addOrReplaceChild("ear_r2", CubeListBuilder.create().texOffs(19, 68).addBox(-1.0F, -5.0F, -1.0F, 4.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition up_jaw = head.addOrReplaceChild("up_jaw", CubeListBuilder.create().texOffs(60, 5).addBox(-2.5F, -3.0F, -7.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(-2.0F, 1.0F, -6.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, -8.0F));

		PartDefinition down_jaw = head.addOrReplaceChild("down_jaw", CubeListBuilder.create().texOffs(39, 0).addBox(-2.5F, -1.0F, -8.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(60, 37).addBox(-2.0F, -2.0F, -7.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, -7.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 11.0F));

		PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(43, 37).addBox(-2.5F, 0.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition leg1 = wolfarn.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(33, 63).addBox(-1.0F, -1.0F, -3.0F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -9.0F, -6.0F));

		PartDefinition leg2 = wolfarn.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(55, 52).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, -9.0F, -6.0F));

		PartDefinition leg3 = wolfarn.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(19, 51).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, -10.0F, 7.0F));

		PartDefinition leg4 = wolfarn.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, -10.0F, 7.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.WOLFARN_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((WolfarnEntity) entity).idleAnimationState, ModAnimationDefinitions.WOLFARN_IDLE, ageInTicks, 1f);
		this.animate(((WolfarnEntity) entity).attackAnimationState, ModAnimationDefinitions.WOLFARN_ATTACK, ageInTicks, 1f);


	}
	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		wolfarn.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return wolfarn;

	}
}