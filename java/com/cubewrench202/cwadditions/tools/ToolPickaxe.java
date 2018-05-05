package com.cubewrench202.cwadditions.tools;

import java.util.Set;

import com.cubewrench202.cwadditions.Main;
import com.cubewrench202.cwadditions.init.ModBlocks;
import com.cubewrench202.cwadditions.init.ModItems;
import com.cubewrench202.cwadditions.util.IHasModel;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ToolPickaxe extends ItemTool implements IHasModel{
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(ModBlocks.RUBY_BLOCK, ModBlocks.RUBY_ORE, Blocks.ICE, Blocks.GLASS, Blocks.GLASS_PANE, Blocks.GLOWSTONE, Blocks.STONE, Blocks.ANVIL, Blocks.BEACON, Blocks.CAULDRON, Blocks.COAL_BLOCK, Blocks.COAL_ORE, Blocks.IRON_BARS, Blocks.IRON_BLOCK, Blocks.IRON_DOOR, Blocks.IRON_ORE, Blocks.IRON_TRAPDOOR, Blocks.REDSTONE_BLOCK, Blocks.REDSTONE_LAMP, Blocks.REDSTONE_ORE, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.GOLDEN_RAIL, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.OBSIDIAN, Blocks.COAL_BLOCK, Blocks.COAL_ORE, Blocks.EMERALD_BLOCK, Blocks.EMERALD_ORE, Blocks.PISTON, Blocks.PISTON_EXTENSION, Blocks.PISTON_HEAD, Blocks.STICKY_PISTON, Blocks.DROPPER, Blocks.DISPENSER, Blocks.ENCHANTING_TABLE, Blocks.NETHER_BRICK, Blocks.NETHER_BRICK_FENCE, Blocks.NETHER_BRICK_STAIRS, Blocks.END_STONE, Blocks.ENDER_CHEST);
	
	public ToolPickaxe(String name, ToolMaterial material) 
	{
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabcwa);
		
		ModItems.ITEMS.add(this);
			
	}
	
	public float getStrVsBlock(ItemStack stack, IBlockState state)
	{
		Material material = state.getMaterial();
		return material != Material.ANVIL&& material != Material.GLASS && material != Material.ROCK && material != Material.IRON && material != Material.ICE && material != Material.PISTON && material != Material.REDSTONE_LIGHT && material != Material.PACKED_ICE ? super.getDestroySpeed(stack, state) : this.efficiency;
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
