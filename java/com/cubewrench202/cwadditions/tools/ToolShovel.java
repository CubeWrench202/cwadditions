package com.cubewrench202.cwadditions.tools;

import com.cubewrench202.cwadditions.Main;
import com.cubewrench202.cwadditions.init.ModItems;
import com.cubewrench202.cwadditions.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel{

	public ToolShovel(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabcwa);
		
		ModItems.ITEMS.add(this);
			
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
