
package net.mcreator.craftablemodloaders.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.craftablemodloaders.creativetab.TabCraftableModloaders;
import net.mcreator.craftablemodloaders.ElementsCraftableModLoadersMod;

@ElementsCraftableModLoadersMod.ModElement.Tag
public class ItemNeoForgeItem extends ElementsCraftableModLoadersMod.ModElement {
	@GameRegistry.ObjectHolder("craftable_mod_loaders:neo_forge_item")
	public static final Item block = null;
	public ItemNeoForgeItem(ElementsCraftableModLoadersMod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("craftable_mod_loaders:neo_forge_item", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("neo_forge_item");
			setRegistryName("neo_forge_item");
			setCreativeTab(TabCraftableModloaders.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
