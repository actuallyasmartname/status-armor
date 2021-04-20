package io.github.actuallyasmartname.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class extendedregendye extends Item{

    public extendedregendye(Settings settings) {
        super(settings);
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

}
