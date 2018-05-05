package com.cubewrench202.cwadditions.init;

import java.util.ArrayList;
import java.util.List;

import com.cubewrench202.cwadditions.armor.ArmorBase;
import com.cubewrench202.cwadditions.items.ItemBase;
import com.cubewrench202.cwadditions.tools.ToolAxe;
import com.cubewrench202.cwadditions.tools.ToolHoe;
import com.cubewrench202.cwadditions.tools.ToolPickaxe;
import com.cubewrench202.cwadditions.tools.ToolShovel;
import com.cubewrench202.cwadditions.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Base
	public static final ToolMaterial TOOL_BASE = EnumHelper.addToolMaterial("tool_base", 2, 750, 7.0F, 2.5F, 12);
	public static final ArmorMaterial ARMOR_RUBY = EnumHelper.addArmorMaterial("armor_ruby", Reference.MOD_ID + ":ruby", 33, new int[]{3, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_EMERALD = EnumHelper.addArmorMaterial("armor_emerald", Reference.MOD_ID + ":emerald", 33, new int[]{3, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_SAPPHIRE = EnumHelper.addArmorMaterial("armor_sapphire", Reference.MOD_ID + ":sapphire", 33, new int[]{3, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_AMETHYST = EnumHelper.addArmorMaterial("armor_amethyst", Reference.MOD_ID + ":amethyst", 33, new int[]{3, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_TOPAZ = EnumHelper.addArmorMaterial("armor_topaz", Reference.MOD_ID + ":topaz", 33, new int[]{3, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	
	
	
	//Material
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item AMETHYST = new ItemBase("amethyst");
	public static final Item TOPAZ = new ItemBase("topaz");
	
	//Tools
	public static final Item RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", TOOL_BASE);
	public static final Item RUBY_AXE = new ToolAxe("ruby_axe", TOOL_BASE);
	public static final Item RUBY_SHOVEL = new ToolShovel("ruby_shovel", TOOL_BASE);
	public static final Item RUBY_HOE = new ToolHoe("ruby_hoe", TOOL_BASE);
	public static final Item EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", TOOL_BASE);
	public static final Item EMERALD_AXE = new ToolAxe("emerald_axe", TOOL_BASE);
	public static final Item EMERALD_SHOVEL = new ToolShovel("emerald_shovel", TOOL_BASE);
	public static final Item EMERALD_HOE = new ToolHoe("emerald_hoe", TOOL_BASE);
	public static final Item SAPPHIRE_PICKAXE = new ToolPickaxe("sapphire_pickaxe", TOOL_BASE);
	public static final Item SAPPHIRE_AXE = new ToolAxe("sapphire_axe", TOOL_BASE);
	public static final Item SAPPHIRE_SHOVEL = new ToolShovel("sapphire_shovel", TOOL_BASE);
	public static final Item SAPPHIRE_HOE = new ToolHoe("sapphire_hoe", TOOL_BASE);
	public static final Item AMETHYST_PICKAXE = new ToolPickaxe("amethyst_pickaxe", TOOL_BASE);
	public static final Item AMETHYST_AXE = new ToolAxe("amethyst_axe", TOOL_BASE);
	public static final Item AMETHYST_SHOVEL = new ToolShovel("amethyst_shovel", TOOL_BASE);
	public static final Item AMETHYST_HOE = new ToolHoe("amethyst_hoe", TOOL_BASE);
	public static final Item TOPAZ_PICKAXE = new ToolPickaxe("topaz_pickaxe", TOOL_BASE);
	public static final Item TOPAZ_AXE = new ToolAxe("topaz_axe", TOOL_BASE);
	public static final Item TOPAZ_SHOVEL = new ToolShovel("topaz_shovel", TOOL_BASE);
	public static final Item TOPAZ_HOE = new ToolHoe("topaz_hoe", TOOL_BASE);
	
	//Weapons
	public static final Item RUBY_SWORD = new ItemBase("ruby_sword");
	public static final Item EMERALD_SWORD = new ItemBase("emerald_sword");
	public static final Item SAPPHIRE_SWORD = new ItemBase("sapphire_sword");
	public static final Item AMETHYST_SWORD = new ItemBase("amethyst_sword");
	public static final Item TOPAZ_SWORD = new ItemBase("topaz_sword");
	
	//Armors
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_RUBY, 1, EntityEquipmentSlot.FEET);
	public static final Item EMERALD_HELMET = new ArmorBase("emerald_helmet", ARMOR_EMERALD, 1, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE = new ArmorBase("emerald_chestplate", ARMOR_EMERALD, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS = new ArmorBase("emerald_leggings", ARMOR_EMERALD, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS = new ArmorBase("emerald_boots", ARMOR_EMERALD, 1, EntityEquipmentSlot.FEET);
	public static final Item SAPPHIRE_HELMET = new ArmorBase("sapphire_helmet", ARMOR_SAPPHIRE, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE = new ArmorBase("sapphire_chestplate", ARMOR_SAPPHIRE, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS = new ArmorBase("sapphire_leggings", ARMOR_SAPPHIRE, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS = new ArmorBase("sapphire_boots", ARMOR_SAPPHIRE, 1, EntityEquipmentSlot.FEET);
	public static final Item AMETHYST_HELMET = new ArmorBase("amethyst_helmet", ARMOR_AMETHYST, 1, EntityEquipmentSlot.HEAD);
	public static final Item AMETHYST_CHESTPLATE = new ArmorBase("amethyst_chestplate", ARMOR_AMETHYST, 1, EntityEquipmentSlot.CHEST);
	public static final Item AMETHYST_LEGGINGS = new ArmorBase("amethyst_leggings", ARMOR_AMETHYST, 2, EntityEquipmentSlot.LEGS);
	public static final Item AMETHYST_BOOTS = new ArmorBase("amethyst_boots", ARMOR_AMETHYST, 1, EntityEquipmentSlot.FEET);
	public static final Item TOPAZ_HELMET = new ArmorBase("topaz_helmet", ARMOR_TOPAZ, 1, EntityEquipmentSlot.HEAD);
	public static final Item TOPAZ_CHESTPLATE = new ArmorBase("topaz_chestplate", ARMOR_TOPAZ, 1, EntityEquipmentSlot.CHEST);
	public static final Item TOPAZ_LEGGINGS = new ArmorBase("topaz_leggings", ARMOR_TOPAZ, 2, EntityEquipmentSlot.LEGS);
	public static final Item TOPAZ_BOOTS = new ArmorBase("topaz_boots", ARMOR_TOPAZ, 1, EntityEquipmentSlot.FEET);
	
}
