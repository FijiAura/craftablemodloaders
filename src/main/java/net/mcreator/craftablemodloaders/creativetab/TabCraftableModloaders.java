
package net.mcreator.craftablemodloaders.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.craftablemodloaders.item.ItemLogo;
import net.mcreator.craftablemodloaders.ElementsCraftableModLoadersMod;

@ElementsCraftableModLoadersMod.ModElement.Tag
public class TabCraftableModloaders extends ElementsCraftableModLoadersMod.ModElement {
	public TabCraftableModloaders(ElementsCraftableModLoadersMod instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcraftable_modloaders") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemLogo.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
