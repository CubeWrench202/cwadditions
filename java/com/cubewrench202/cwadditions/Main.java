package com.cubewrench202.cwadditions;

import com.cubewrench202.cwadditions.init.ModItems;
import com.cubewrench202.cwadditions.proxy.CommonProxy;
import com.cubewrench202.cwadditions.util.Reference;
import com.cubewrench202.cwadditions.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		RegistryHandler.otherRegistries();
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
	public static final CreativeTabs tabcwa = new CreativeTabs("tab_cwa") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.RUBY);
		}
	};
	

}
