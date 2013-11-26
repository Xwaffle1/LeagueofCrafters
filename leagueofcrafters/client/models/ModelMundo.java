// Date: 11/20/2013 4:05:28 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package leagueofcrafters.client.models;

import leagueofcrafters.entity.EntityMundo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelMundo extends ModelBase {
	// fields
	ModelRenderer Body;
	ModelRenderer Body2;
	ModelRenderer Head;
	ModelRenderer Jaw;
	ModelRenderer LArm;
	ModelRenderer LArm2;
	ModelRenderer RArm;
	ModelRenderer RArm2;
	ModelRenderer Syringe;
	ModelRenderer Needle;
	ModelRenderer TestTube;
	ModelRenderer Tongue;
	ModelRenderer LLeg;
	ModelRenderer RLeg;
	ModelRenderer LLeg2;
	ModelRenderer RLeg2;
	ModelRenderer LFoot;
	ModelRenderer RFoot;
	ModelRenderer AxeHandle;
	ModelRenderer Axeblade;
	ModelRenderer LeftLeg;
	ModelRenderer RightLeg;

	public ModelMundo() {
		textureWidth = 128;
		textureHeight = 64;

		Body = new ModelRenderer(this, 0, 22);
		Body.addBox(0F, 0F, 0F, 10, 10, 7);
		Body.setRotationPoint(-5F, 4F, -2F);
		Body.setTextureSize(128, 64);
		Body.mirror = true;
		setRotation(Body, 0.1487144F, 0F, 0F);
		Body2 = new ModelRenderer(this, 0, 0);
		Body2.addBox(0F, 0F, 0F, 16, 13, 9);
		Body2.setRotationPoint(-8F, -5F, -8F);
		Body2.setTextureSize(128, 64);
		Body2.mirror = true;
		setRotation(Body2, 0.4461433F, 0F, 0F);
		Head = new ModelRenderer(this, 52, 0);
		Head.addBox(0F, 0F, 0F, 8, 8, 6);
		Head.setRotationPoint(-4F, -11F, -11.3F);
		Head.setTextureSize(128, 64);
		Head.mirror = true;
		setRotation(Head, 0.2974289F, 0F, 0F);
		Jaw = new ModelRenderer(this, 52, 15);
		Jaw.addBox(0F, 0F, 0F, 9, 4, 7);
		Jaw.setRotationPoint(-4.5F, -5.3F, -10.5F);
		Jaw.setTextureSize(128, 64);
		Jaw.mirror = true;
		setRotation(Jaw, 0.2974289F, 0F, 0F);

		LArm = new ModelRenderer(this, 19, 49);
		LArm.addBox(0F, 0F, 0F, 4, 11, 4);
		LArm.setRotationPoint(3F, -4.5F, -0.5F);
		LArm.setTextureSize(128, 64);
		LArm.mirror = true;
		setRotation(LArm, -0.4833219F, -0.4089647F, -0.7435722F);
		LArm2 = new ModelRenderer(this, 7, 51);
		LArm2.addBox(0F, 0F, 0F, 3, 10, 3);
		LArm2.setRotationPoint(10.2F, -0.2F, -4F);
		LArm2.setTextureSize(128, 64);
		LArm2.mirror = true;
		setRotation(LArm2, -0.4658687F, -0.1115358F, 0.1115358F);

		RArm = new ModelRenderer(this, 19, 49);
		RArm.addBox(0F, 0F, 0F, 4, 11, 4);
		RArm.setRotationPoint(-5.3F, -3F, 2F);
		RArm.setTextureSize(128, 64);
		RArm.mirror = true;
		setRotation(RArm, -0.1858931F, 2.9557F, -0.8027482F);
		RArm2 = new ModelRenderer(this, 7, 51);
		RArm2.addBox(0F, 0F, 0F, 3, 10, 3);
		RArm2.setRotationPoint(-13.6F, 0.5F, -0.8F);
		RArm2.setTextureSize(128, 64);
		RArm2.mirror = true;
		setRotation(RArm2, -0.5762685F, -0.3346075F, 0.4833219F);
		Syringe = new ModelRenderer(this, 0, 39);
		Syringe.addBox(0F, 0F, 0F, 2, 4, 2);
		Syringe.setRotationPoint(6.5F, -13.5F, -2.5F);
		Syringe.setTextureSize(128, 64);
		Syringe.mirror = true;
		setRotation(Syringe, -0.2230717F, 0.4833219F, 0.4461433F);
		Needle = new ModelRenderer(this, 0, 45);
		Needle.addBox(0F, 0F, 0F, 0, 3, 1);
		Needle.setRotationPoint(6F, -10F, -2.5F);
		Needle.setTextureSize(128, 64);
		Needle.mirror = true;
		setRotation(Needle, -0.2230717F, 0.4833219F, 0.4461433F);
		TestTube = new ModelRenderer(this, 38, 55);
		TestTube.addBox(0F, 0F, 0F, 2, 7, 2);
		TestTube.setRotationPoint(7.8F, 9.2F, -9.2F);
		TestTube.setTextureSize(128, 64);
		TestTube.mirror = true;
		setRotation(TestTube, 0.4089647F, 0F, -0.8179294F);
		Tongue = new ModelRenderer(this, 52, 26);
		Tongue.addBox(0F, 0F, 0F, 3, 0, 4);
		Tongue.setRotationPoint(-1.5F, -2F, -11.5F);
		Tongue.setTextureSize(128, 64);
		Tongue.mirror = true;
		setRotation(Tongue, 0.7807508F, 0F, 0F);

		LeftLeg = new ModelRenderer(this, "LeftLeg");
		LLeg = new ModelRenderer(this, 112, 0);
		LLeg.addBox(0F, 0F, 0F, 4, 7, 4);
		LLeg.setRotationPoint(1.5F, 11F, 1F);
		LLeg.setTextureSize(128, 64);
		LLeg.mirror = true;
		setRotation(LLeg, -0.5205006F, -0.4833219F, 0F);
		LLeg2 = new ModelRenderer(this, 112, 11);
		LLeg2.addBox(0F, 0F, 0F, 4, 7, 4);
		LLeg2.setRotationPoint(3F, 17F, -2F);
		LLeg2.setTextureSize(128, 64);
		LLeg2.mirror = true;
		setRotation(LLeg2, 0F, -0.4833219F, 0F);
		LFoot = new ModelRenderer(this, 108, 22);
		LFoot.addBox(0F, 0F, 0F, 4, 4, 6);
		LFoot.setRotationPoint(5.1F, 20F, -6F);
		LFoot.setTextureSize(128, 64);
		LFoot.mirror = true;
		setRotation(LFoot, 0F, -0.4833219F, 0F);

		LeftLeg.addChild(LLeg);
		LeftLeg.addChild(LLeg2);
		LeftLeg.addChild(LFoot);

		RightLeg = new ModelRenderer(this, "RightLeg");
		RLeg = new ModelRenderer(this, 112, 0);
		RLeg.addBox(0F, 0F, 0F, 4, 7, 4);
		RLeg.setRotationPoint(-4.8F, 11F, 3F);
		RLeg.setTextureSize(128, 64);
		RLeg.mirror = true;
		setRotation(RLeg, -0.5205006F, 0.4833219F, 0F);
		RLeg2 = new ModelRenderer(this, 112, 11);
		RLeg2.addBox(0F, 0F, 0F, 4, 7, 4);
		RLeg2.setRotationPoint(-6.5F, 17F, -0.1F);
		RLeg2.setTextureSize(128, 64);
		RLeg2.mirror = true;
		setRotation(RLeg2, 0F, 0.4833219F, 0F);
		RFoot = new ModelRenderer(this, 108, 22);
		RFoot.addBox(0F, 0F, 0F, 4, 4, 6);
		RFoot.setRotationPoint(-8.5F, 20F, -4F);
		RFoot.setTextureSize(128, 64);
		RFoot.mirror = true;
		setRotation(RFoot, 0F, 0.4833219F, 0F);

		RightLeg.addChild(RLeg);
		RightLeg.addChild(RLeg2);
		RightLeg.addChild(RFoot);

		AxeHandle = new ModelRenderer(this, 50, 61);
		AxeHandle.addBox(0F, 0F, -3F, 12, 2, 1);
		AxeHandle.setRotationPoint(-12F, 10F, -2F);
		AxeHandle.setTextureSize(128, 64);
		AxeHandle.mirror = true;
		setRotation(AxeHandle, -0.2602503F, 1.635859F, -0.2974289F);
		Axeblade = new ModelRenderer(this, 50, 52);
		Axeblade.addBox(0F, 0F, 0F, 15, 8, 0);
		Axeblade.setRotationPoint(-14.5F, 5.2F, -11F);
		Axeblade.setTextureSize(128, 64);
		Axeblade.mirror = true;
		setRotation(Axeblade, -0.2602503F, 1.635859F, -0.2974289F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.renderMundo((EntityMundo) entity, f, f1, f2, f3, f4, f5);
	}

	private void renderMundo(EntityMundo entity, float f, float f1, float f2, float f3, float f4, float f5) {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body.render(f5);
		Body2.render(f5);
		Head.render(f5);
		Jaw.render(f5);
		LArm.render(f5);
		LArm2.render(f5);
		Syringe.render(f5);
		Needle.render(f5);
		TestTube.render(f5);
		Tongue.render(f5);
		RArm.render(f5);
		RArm2.render(f5);
		LeftLeg.render(f5);
		RightLeg.render(f5);
		if (entity.timer <= 75) {
			AxeHandle.render(f5);
			Axeblade.render(f5);
		}
		this.armRotations(entity);

	}

	private void armRotations(EntityMundo entity) {

		if (entity.timer <= 15) {
			RArm2.setRotationPoint(-11F, -8F, 1.5F);
			setRotation(RArm2, 3.141593F, 0.7807508F, 0.4833219F);
			RArm.setRotationPoint(-5F, 0F, 0F);
			setRotation(RArm, -0.1858931F, 3.141593F, 2.289893F);
			AxeHandle.setRotationPoint(-11F, -16F, 0F);
			setRotation(AxeHandle, 0F, -0.2974289F, -0.2602503F);
			Axeblade.setRotationPoint(-3F, -24.1F, 0F);
			setRotation(Axeblade, 0F, -0.2974289F, -0.2602503F);

		} else {
			RArm.setRotationPoint(-4.9F, -3.5F, 2F);
			setRotation(RArm, -0.1858931F, 2.9557F, 0.8027482F);
			RArm2.setRotationPoint(-13.6F, 0.5F, -0.8F);
			setRotation(RArm2, -0.5762685F, -0.3346075F, 0.4833219F);
			AxeHandle.setRotationPoint(-12F, 7F, -2F);
			setRotation(AxeHandle, -0.2602503F, 2F, -0.2974289F);
			Axeblade.setRotationPoint(-18.5F, 3F, -11F);
			setRotation(Axeblade, -0.2602503F, 2F, -0.2974289F);

		}
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * .4F * f1 * 0.5F;
		this.LeftLeg.rotateAngleY = 0.0f;

		this.RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * .4F * f1;
		this.RightLeg.rotateAngleY = 0.0F;

	}

}
