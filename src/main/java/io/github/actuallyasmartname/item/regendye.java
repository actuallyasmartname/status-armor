package io.github.actuallyasmartname.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class regendye extends Item{

    public regendye(Settings settings) {
        super(settings);
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
    
}
