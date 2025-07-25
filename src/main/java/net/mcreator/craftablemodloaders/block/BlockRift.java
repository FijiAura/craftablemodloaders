
package net.mcreator.craftablemodloaders.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.craftablemodloaders.creativetab.TabCraftableModloaders;
import net.mcreator.craftablemodloaders.ElementsCraftableModLoadersMod;

@ElementsCraftableModLoadersMod.ModElement.Tag
public class BlockRift extends ElementsCraftableModLoadersMod.ModElement {
	@GameRegistry.ObjectHolder("craftable_mod_loaders:rift")
	public static final Block block = null;
	public BlockRift(ElementsCraftableModLoadersMod instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("rift"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("craftable_mod_loaders:rift", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("rift");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", -1);
			setHardness(0.5F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabCraftableModloaders.tab);
		}
	}
}
