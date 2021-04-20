package io.github.actuallyasmartname;

import io.github.actuallyasmartname.armor.armorregister;
import io.github.actuallyasmartname.item.items;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier("status_armor", "status_armor"), () -> new ItemStack(items.REGEN_DYE));
	@Override
	public void onInitialize() {
        items.registeritems();
		armorregister.registerArmor();
		System.out.println("Hello Fabric world!");
	}
}
