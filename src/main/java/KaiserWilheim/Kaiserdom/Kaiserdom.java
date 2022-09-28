package KaiserWilheim.Kaiserdom;

import KaiserWilheim.Kaiserdom.items.ItemRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.ModID)
public class Kaiserdom
{
	public Kaiserdom()
	{
		ItemRegister.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}

