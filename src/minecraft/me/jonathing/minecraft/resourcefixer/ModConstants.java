package me.jonathing.minecraft.resourcefixer;

import net.minecraft.client.Minecraft;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

public class ModConstants
{
	public static final String NAME = "Legacy Resource Fixer";
	//public static final String devVersion = "";
    public static final String majorVersion = "1";
    public static final String minorVersion = "1";
    public static final String patchVersion = "0";
    public static final String VERSION_ID = /*devVersion + */majorVersion + "." + minorVersion + "." + patchVersion;
    public static final String MODID = "resourcefixer";
    public static final String resourcesDir = System.getProperty("user.dir") + File.separator + "resources";
	public static final ModLogger LOG = new ModLogger(MODID);
}
