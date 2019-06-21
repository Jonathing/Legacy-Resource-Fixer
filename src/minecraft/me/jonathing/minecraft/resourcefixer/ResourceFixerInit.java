package me.jonathing.minecraft.resourcefixer;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=ModConstants.MODID, name=ModConstants.NAME, version=ModConstants.VERSION_ID)
public class ResourceFixerInit
{
	// THIS IS THE ONE
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
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
}
