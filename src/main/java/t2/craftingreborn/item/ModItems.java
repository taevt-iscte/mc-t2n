package t2.craftingreborn.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import t2.craftingreborn.CraftingReborn;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CraftingReborn.MODID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steelingot",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
