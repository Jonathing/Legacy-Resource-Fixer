package me.jonathing.minecraft.resourcefixer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ResourceFixer
{
	public static void music()
	{
		downloadResource("https://resources.download.minecraft.net/50/50a59a4f56e4046701b758ddbb1c1587efa4cadf", "/music/calm1.ogg");
		downloadResource("https://resources.download.minecraft.net/74/74da65c99aa578486efa7b69983d3533e14c0d6e", "/music/calm2.ogg");
		downloadResource("https://resources.download.minecraft.net/14/14ae57a6bce3d4254daa8be2b098c2d99743cc3f", "/music/calm3.ogg");
	}
	
	public static void newmusic()
	{
		downloadResource("https://resources.download.minecraft.net/df/df1ff11b79757432c5c3f279e5ecde7b63ceda64", "/newmusic/hal1.ogg");
		downloadResource("https://resources.download.minecraft.net/ce/ceaaaa1d57dfdfbb0bd4da5ea39628b42897a687", "/newmusic/hal2.ogg");
		downloadResource("https://resources.download.minecraft.net/dd/dd85fb564e96ee2dbd4754f711ae9deb08a169f9", "/newmusic/hal3.ogg");
		downloadResource("https://resources.download.minecraft.net/5e/5e7d63e75c6e042f452bc5e151276911ef92fed8", "/newmusic/hal4.ogg");
		downloadResource("https://resources.download.minecraft.net/cc/cc1a80b6becfc6d6489c069f053d0a8adc71c339", "/newmusic/nuance1.ogg");
		downloadResource("https://resources.download.minecraft.net/78/78152dc42b036e0de7616e6e669ce5a81d17f82a", "/newmusic/nuance2.ogg");
		downloadResource("https://resources.download.minecraft.net/0f/0f374764aafba398f4ba90dba05a53a9e6166138", "/newmusic/piano1.ogg");
		downloadResource("https://resources.download.minecraft.net/98/98a918eb2694defd19726436d4b9dca9e7dd6a65", "/newmusic/piano2.ogg");
		downloadResource("https://resources.download.minecraft.net/95/9528b6a76e7bac64ca1145cc682e8a8448cc04e5", "/newmusic/piano3.ogg");
	}
	
	public static void newsound()
	{
		
	}
	
	public static void pe()
	{
		
	}
	
	public static void sound()
	{
		
	}
	
	public static void sound3()
	{
		
	}
	
	public static void streaming()
	{
		
	}
	
	/**
	 * Method used to download a file using Java I/O library.
	 * @author Lalit Bhagtani from Code Destine
	 * @param url URL to download the file from. Must be a direct download link.
	 * @param file File name to save the download to.
	 */
	public static void downloadResource(String url, String file)
	{
		String filePath = ModConstants.resourcesDir + file;
		
		BufferedInputStream bufferedIS = null;
	    FileOutputStream fileOS = null;
	    try {
	      File newFile = new File(filePath);
	      if (!newFile.exists())
	      {
	    	  if (!newFile.getParentFile().exists())
	    	  {
	    		  newFile.getParentFile().mkdirs();
	    	  }
	    	  newFile.createNewFile();
	      }
	      else
	      {
	    	  ModConstants.LOG.warn("file " + newFile.toString() + " already exists.");
	    	  return;
	      }
	      URL urlObj = new URL(url);
	      bufferedIS = new BufferedInputStream(urlObj.openStream());
	      fileOS = new FileOutputStream(filePath);

	      int data = bufferedIS.read();
	      while(data != -1){
	        fileOS.write(data);
	        data = bufferedIS.read();
	      }
	    } catch (MalformedURLException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }finally{
	      try {
	        if(fileOS != null){
	          fileOS.close();
	        }
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	      try {
	        if(bufferedIS != null){
	          bufferedIS.close();
	        }
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	    }
	}
}
