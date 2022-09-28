package KaiserWilheim.Kaiserdom.group;


import KaiserWilheim.Kaiserdom.items.ItemRegister;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class KaiserdomGroup extends ItemGroup
{
	public KaiserdomGroup()
	{
		super("Kaiserdom");
	}
	
	@Override
	public ItemStack makeIcon()
	{
		return new ItemStack(ItemRegister.IngotCopper.get());
	}
}
