package io.github.actuallyasmartname.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class armorregister {
    public static final ArmorMaterial REGEN_ARMOR_MATERIAL = new RegenArmor();
    public static final Item REGEN_HELMET = new ArmorItem(REGEN_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item REGEN_CHESTPLATE = new ArmorItem(REGEN_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item REGEN_LEGGINGS = new ArmorItem(REGEN_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item REGEN_BOOTS = new ArmorItem(REGEN_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    public static void registerArmor() {
    String MODID = "status_armor";
       Registry.register(Registry.ITEM, new Identifier(MODID, "regen_helmet"), REGEN_HELMET);
       Registry.register(Registry.ITEM, new Identifier(MODID, "regen_chestplate"), REGEN_CHESTPLATE);
       Registry.register(Registry.ITEM, new Identifier(MODID, "regen_leggings"), REGEN_LEGGINGS);
       Registry.register(Registry.ITEM, new Identifier(MODID, "regen_boots"), REGEN_BOOTS);
    }
}
