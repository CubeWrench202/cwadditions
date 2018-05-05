package com.cubewrench202.cwadditions.armor;

import com.cubewrench202.cwadditions.Main;
import com.cubewrench202.cwadditions.init.ModItems;
import com.cubewrench202.cwadditions.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item.ToolMaterial;

public class ArmorBase extends ItemArmor implements IHasModel{
	
	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
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
