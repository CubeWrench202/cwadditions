package com.cubewrench202.cwadditions.world.gen;

import java.util.Random;

import com.cubewrench202.cwadditions.init.BlockOres;
import com.cubewrench202.cwadditions.init.ModBlocks;
import com.cubewrench202.cwadditions.util.handlers.EnumHandler;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ruby_ore, sapphire_ore, amethyst_ore, topaz_ore;
	
	public WorldGenCustomOres() 
	{
		ruby_ore = new WorldGenMinable(ModBlocks.RUBY_ORE.getDefaultState().withProperty(BlockOres.VARIANT, value), 9, BlockMatcher.forBlock(Blocks.STONE));
		amethyst_ore = new WorldGenMinable(ModBlocks.AMETHYST_ORE.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.RUBY), 9, BlockMatcher.forBlock(Blocks.STONE));
		sapphire_ore = new WorldGenMinable(ModBlocks.SAPPHIRE_ORE.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.RUBY), 9, BlockMatcher.forBlock(Blocks.STONE));
		topaz_ore = new WorldGenMinable(ModBlocks.TOPAZ_ORE.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.RUBY), 9, BlockMatcher.forBlock(Blocks.STONE));
		/*ore_overworld_ruby = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.RUBY), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_end_ruby = new WorldGenMinable(ModBlocks.ORE_END.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.RUBY), 9, BlockMatcher.forBlock(Blocks.END_STONE));*/
		
		/*ore_nether_sapphire = new WorldGenMinable(ModBlocks.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SAPPHIRE), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_sapphire = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SAPPHIRE), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_end_sapphire = new WorldGenMinable(ModBlocks.ORE_END.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SAPPHIRE), 9, BlockMatcher.forBlock(Blocks.END_STONE));*/
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			/*runGenerator(ore_nether_ruby, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(ore_nether_sapphire, world, random, chunkX, chunkZ, 50, 0, 100);*/
			
			break;
			
		case 0:
			
			runGenerator(ruby_ore, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(amethyst_ore, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(sapphire_ore, world, random, chunkX, chunkZ, 50, 0, 100);
			runGenerator(topaz_ore, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
			
		case 1:
			
			/*runGenerator(ore_end_ruby, world, random, chunkX, chunkZ, 50, 0, 256);
			runGenerator(ore_end_sapphire, world, random, chunkX, chunkZ, 50, 0, 256);*/
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
