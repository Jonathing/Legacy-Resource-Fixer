package me.jonathing.minecraft.resourcefixer;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ResourceFixer
{
	
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
