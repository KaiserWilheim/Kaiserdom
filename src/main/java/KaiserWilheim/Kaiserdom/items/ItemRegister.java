package KaiserWilheim.Kaiserdom.items;

import KaiserWilheim.Kaiserdom.Utils;
import KaiserWilheim.Kaiserdom.items.ingot.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegister
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.ModID);
	public static final RegistryObject<Item> IngotCopper = ITEMS.register("ingot_copper", ingotCopper::new);
	public static final RegistryObject<Item> IngotTin= ITEMS.register("ingot_tin", ingotTin::new);
	public static final RegistryObject<Item> IngotBronze= ITEMS.register("ingot_bronze", ingotBronze::new);
	public static final RegistryObject<Item> IngotLead= ITEMS.register("ingot_lead", ingotLead::new);
}