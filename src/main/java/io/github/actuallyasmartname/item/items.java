package io.github.actuallyasmartname.item;
import io.github.actuallyasmartname.Main;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class items {
    private static String MODID = "status_armor";
    public static final Item REGEN_DYE = new regendye(new Item.Settings().group(Main.ITEM_GROUP));
    public static final Item EXTENDED_REGEN_DYE = new extendedregendye(new Item.Settings().group(Main.ITEM_GROUP));

    public static void registeritems() {
       Registry.register(Registry.ITEM, new Identifier(MODID, "regen_dye"), REGEN_DYE);
       Registry.register(Registry.ITEM, new Identifier(MODID, "extended_regen_dye"), EXTENDED_REGEN_DYE);
       System.out.println("Register successful for Items");
    }
}
