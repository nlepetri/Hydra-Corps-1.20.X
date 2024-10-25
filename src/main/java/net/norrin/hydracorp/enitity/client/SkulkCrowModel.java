// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class SkulkCrowModel<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart Crow;
	private final ModelPart head;
	private final ModelPart flame;
	private final ModelPart flame2;
	private final ModelPart body;
	private final ModelPart L_Wing;
	private final ModelPart R_Wing2;
	private final ModelPart Tail;
	private final ModelPart L_Leg;
	private final ModelPart R_Leg2;

	public SkulkCrowModel(ModelPart root) {
		this.Crow = root.getChild("Crow");
		this.head = this.Crow.getChild("head");
		this.flame = this.head.getChild("flame");
		this.flame2 = this.head.getChild("flame2");
		this.body = this.Crow.getChild("body");
		this.L_Wing = this.body.getChild("L_Wing");
		this.R_Wing2 = this.body.getChild("R_Wing2");
		this.Tail = this.body.getChild("Tail");
		this.L_Leg = this.Crow.getChild("L_Leg");
		this.R_Leg2 = this.Crow.getChild("R_Leg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Crow = partdefinition.addOrReplaceChild("Crow", CubeListBuilder.create(), PartPose.offset(3.0F, 19.0F, 0.0F));

		PartDefinition head = Crow.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -4.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(16, 18).addBox(0.0F, -3.0F, -4.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -3.0F, -1.0F));

		PartDefinition flame = head.addOrReplaceChild("flame", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = flame.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition cube_r2 = flame.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 2).addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition cube_r3 = flame.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 23).addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -6.0F, 1.0F, 0.0F, 0.0F, -0.829F));

		PartDefinition cube_r4 = flame.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(6, 19).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition flame2 = head.addOrReplaceChild("flame2", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = flame2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 8).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -9.0F, 0.0F, 0.0F, 0.0F, -0.829F));

		PartDefinition cube_r6 = flame2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 6).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -6.0F, 0.0F, 0.0F, 0.0F, -0.829F));

		PartDefinition cube_r7 = flame2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(24, 4).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -6.0F, 1.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition cube_r8 = flame2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(6, 23).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition body = Crow.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-3.0F, -3.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 2.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition L_Wing = body.addOrReplaceChild("L_Wing", CubeListBuilder.create().texOffs(16, 0).addBox(-0.3149F, -0.0285F, -1.881F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 2.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition R_Wing2 = body.addOrReplaceChild("R_Wing2", CubeListBuilder.create().texOffs(16, 9).addBox(0.5F, 0.0359F, -1.222F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 1.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition Tail = body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(1.0F, 2.0258F, 5.4447F));

		PartDefinition cube_r10 = Tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9742F, 1.5553F, 0.8727F, 0.0F, 0.0F));

		PartDefinition L_Leg = Crow.addOrReplaceChild("L_Leg", CubeListBuilder.create().texOffs(14, 23).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 10).addBox(-1.0F, 3.0F, -2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 2.0F, 4.0F));

		PartDefinition R_Leg2 = Crow.addOrReplaceChild("R_Leg2", CubeListBuilder.create().texOffs(18, 23).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 11).addBox(0.0F, 3.0F, -2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 2.0F, 4.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Crow.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}