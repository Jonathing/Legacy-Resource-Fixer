package me.jonathing.minecraft.resourcefixer;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid=ModConstants.MODID, name=ModConstants.NAME, version=ModConstants.VERSION_ID)

public class ResourceFixerInit
{
	// THIS IS THE ONE
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		ModConstants.LOG.info("Legacy Resource Fixer pre-initialized.");
		
		// Identify resources folder
		ModConstants.LOG.warn("Resources directory is " + ModConstants.resourcesDir);
		
		// Run ResourceFixer
		ModConstants.LOG.info("Legacy Resource Fixer starting...");
		ModConstants.LOG.warn("If you do not have any resources installed, this will take a while.");
		long startTime = System.currentTimeMillis();
		ResourceFixer.music();
		ResourceFixer.newmusic();
		ResourceFixer.newsound();
		ResourceFixer.pe();
		ResourceFixer.sound();
		ResourceFixer.soundThree();
		ResourceFixer.streaming();
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		ModConstants.LOG.info("Legacy Resource Fixer finished. Took " + elapsedTime + "ms.");
	}
	
	/*
	@Init
	public void load(FMLInitializationEvent event)
	{
		
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	*/
}
