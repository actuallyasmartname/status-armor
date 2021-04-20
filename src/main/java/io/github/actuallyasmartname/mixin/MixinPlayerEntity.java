package io.github.actuallyasmartname.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import io.github.actuallyasmartname.armor.armorregister;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@Mixin(PlayerEntity.class)
public abstract class MixinPlayerEntity extends LivingEntity{


	protected MixinPlayerEntity(EntityType<? extends LivingEntity> entityType, World world) {
		super(entityType, world);
		//TODO Auto-generated constructor stub
	}
	@Inject(at = @At("HEAD"), method = "tick")
	private void tick(CallbackInfo info) {
		updateRegenHelmet();
		updateRegenChest();
		updateRegenLeggings();
		updateRegenBoots();
		if (!this.world.isClient)  {
			updateRegenHelmet();
			updateRegenChest();
			updateRegenLeggings();
			updateRegenBoots();
		}

	}
	public void updateRegenHelmet() {
		ItemStack regenHelmet = this.getEquippedStack(EquipmentSlot.HEAD);
		if (regenHelmet.getItem() == armorregister.REGEN_HELMET) {
			this.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2, 0, false, false, false));
		}
	}
	public void updateRegenChest() {
		ItemStack regenChest = this.getEquippedStack(EquipmentSlot.CHEST);
		if (regenChest.getItem() == armorregister.REGEN_CHESTPLATE) {
			this.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2, 0, false, false, false));
		}
	}
	public void updateRegenLeggings() {
		ItemStack regenLeggings = this.getEquippedStack(EquipmentSlot.CHEST);
		if (regenLeggings.getItem() == armorregister.REGEN_LEGGINGS) {
			this.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2, 0, false, false, false));
		}
	}
	public void updateRegenBoots() {
		ItemStack regenBoots = this.getEquippedStack(EquipmentSlot.FEET);
		if (regenBoots.getItem() == armorregister.REGEN_BOOTS) {
			this.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2, 0, false, false, false));
		}
	}
}
