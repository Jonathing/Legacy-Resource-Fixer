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
		//ambient
		
		//cave
		downloadResource("https://resources.download.minecraft.net/29/29d4dccf3353334c7aa2a49cb6fed3780a51a1ba", "/newsound/ambient/cave/cave1.ogg");
		downloadResource("", "/newsound/ambient/cave/cave2.ogg");
		downloadResource("", "/newsound/ambient/cave/cave3.ogg");
		downloadResource("", "/newsound/ambient/cave/cave4.ogg");
		downloadResource("", "/newsound/ambient/cave/cave5.ogg");
		downloadResource("", "/newsound/ambient/cave/cave6.ogg");
		downloadResource("", "/newsound/ambient/cave/cave7.ogg");
		downloadResource("", "/newsound/ambient/cave/cave8.ogg");
		downloadResource("", "/newsound/ambient/cave/cave9.ogg");
		downloadResource("", "/newsound/ambient/cave/cave10.ogg");
		downloadResource("", "/newsound/ambient/cave/cave11.ogg");
		//END cave
		
		//weather ALL LOCAL
		downloadResource("", "/newsound/ambient/weather/rain1.ogg");
		downloadResource("", "/newsound/ambient/weather/rain2.ogg");
		downloadResource("", "/newsound/ambient/weather/rain3.ogg");
		downloadResource("", "/newsound/ambient/weather/rain4.ogg");
		downloadResource("", "newsound/ambient/weather/thunder1.ogg");
		downloadResource("", "newsound/ambient/weather/thunder2.ogg");
		downloadResource("", "newsound/ambient/weather/thunder3.ogg");
		//END weather
		
		//END ambient
		
		//damage
		downloadResource("", "/newsound/damage/fallbig1.ogg");
		downloadResource("", "/newsound/damage/fallbig2.ogg");
		downloadResource("", "/newsound/damage/fallsmall.ogg");
		downloadResource("", "/newsound/damage/fallflesh1.ogg");
		downloadResource("", "/newsound/damage/fallflesh2.ogg");
		downloadResource("", "/newsound/damage/fallflesh3.ogg");
		//END damage
		
		//fire
		downloadResource("", "/newsound/fire/fire.ogg");
		downloadResource("", "/newsound/fire/ignite.ogg");
		//END fire
		
		//liquid
		downloadResource("", "/newsound/liquid/lava.ogg"); //LOCAL
		downloadResource("", "/newsound/liquid/lavapop.ogg");
		downloadResource("", "/newsound/liquid/splash.ogg"); //LOCAL
		downloadResource("", "/newsound/liquid/water.ogg");
		//END liquid
		
		//mob
		
		//blaze
		downloadResource("", "/newsound/mob/blaze/breathe1.ogg");
		downloadResource("", "/newsound/mob/blaze/breathe2.ogg");
		downloadResource("", "/newsound/mob/blaze/breathe3.ogg");
		downloadResource("", "/newsound/mob/blaze/breathe4.ogg");
		downloadResource("", "/newsound/mob/blaze/death.ogg");
		downloadResource("", "/newsound/mob/blaze/hit1.ogg");
		downloadResource("", "/newsound/mob/blaze/hit2.ogg");
		downloadResource("", "/newsound/mob/blaze/hit3.ogg");
		downloadResource("", "/newsound/mob/blaze/hit4.ogg");
		//END blaze
		
		//cat
		downloadResource("", "/newsound/mob/cat/hiss1.ogg");
		downloadResource("", "/newsound/mob/cat/hiss2.ogg");
		downloadResource("", "/newsound/mob/cat/hiss3.ogg");
		downloadResource("", "/newsound/mob/cat/hitt1.ogg");
		downloadResource("", "/newsound/mob/cat/hitt2.ogg");
		downloadResource("", "/newsound/mob/cat/hitt3.ogg");
		downloadResource("", "/newsound/mob/cat/meow1.ogg");
		downloadResource("", "/newsound/mob/cat/meow2.ogg");
		downloadResource("", "/newsound/mob/cat/meow3.ogg");
		downloadResource("", "/newsound/mob/cat/meow4.ogg");
		downloadResource("", "/newsound/mob/cat/purr1.ogg");
		downloadResource("", "/newsound/mob/cat/purr2.ogg");
		downloadResource("", "/newsound/mob/cat/purr3.ogg");
		downloadResource("", "/newsound/mob/cat/purreow1.ogg");
		downloadResource("", "/newsound/mob/cat/purreow2.ogg");
		//END cat
		
		//endermen
		downloadResource("", "/newsound/mob/endermen/death.ogg");
		downloadResource("", "/newsound/mob/endermen/hit1.ogg");
		downloadResource("", "/newsound/mob/endermen/hit2.ogg");
		downloadResource("", "/newsound/mob/endermen/hit3.ogg");
		downloadResource("", "/newsound/mob/endermen/hit4.ogg");
		downloadResource("", "/newsound/mob/endermen/idle1.ogg");
		downloadResource("", "/newsound/mob/endermen/idle2.ogg");
		downloadResource("", "/newsound/mob/endermen/idle3.ogg");
		downloadResource("", "/newsound/mob/endermen/idle4.ogg");
		downloadResource("", "/newsound/mob/endermen/idle5.ogg");
		downloadResource("", "/newsound/mob/endermen/portal.ogg");
		downloadResource("", "/newsound/mob/endermen/portal2.ogg");
		downloadResource("", "/newsound/mob/endermen/scream1.ogg");
		downloadResource("", "/newsound/mob/endermen/scream2.ogg");
		downloadResource("", "/newsound/mob/endermen/scream3.ogg");
		downloadResource("", "/newsound/mob/endermen/scream4.ogg");
		downloadResource("", "/newsound/mob/endermen/stare.ogg");
		//END endermen
		
		//ghast
		downloadResource("", "/newsound/mob/ghast/affectionate scream.ogg");
		downloadResource("", "/newsound/mob/ghast/charge.ogg");
		downloadResource("", "/newsound/mob/ghast/death.ogg");
		downloadResource("", "/newsound/mob/ghast/fireball4.ogg");
		downloadResource("", "/newsound/mob/ghast/moan1.ogg");
		downloadResource("", "/newsound/mob/ghast/moan2.ogg");
		downloadResource("", "/newsound/mob/ghast/moan3.ogg");
		downloadResource("", "/newsound/mob/ghast/moan4.ogg");
		downloadResource("", "/newsound/mob/ghast/moan5.ogg");
		downloadResource("", "/newsound/mob/ghast/moan6.ogg");
		downloadResource("", "/newsound/mob/ghast/moan7.ogg");
		downloadResource("", "/newsound/mob/ghast/scream1.ogg");
		downloadResource("", "/newsound/mob/ghast/scream2.ogg");
		downloadResource("", "/newsound/mob/ghast/scream3.ogg");
		downloadResource("", "/newsound/mob/ghast/scream4.ogg");
		downloadResource("", "/newsound/mob/ghast/scream5.ogg");
		//END ghast
		
		//iron golem
		downloadResource("", "/newsound/mob/irongolem/death.ogg");
		downloadResource("", "/newsound/mob/irongolem/hit1.ogg");
		downloadResource("", "/newsound/mob/irongolem/hit2.ogg");
		downloadResource("", "/newsound/mob/irongolem/hit3.ogg");
		downloadResource("", "/newsound/mob/irongolem/hit4.ogg");
		downloadResource("", "/newsound/mob/irongolem/throw.ogg");
		downloadResource("", "/newsound/mob/irongolem/walk1.ogg");
		downloadResource("", "/newsound/mob/irongolem/walk2.ogg");
		downloadResource("", "/newsound/mob/irongolem/walk3.ogg");
		downloadResource("", "/newsound/mob/irongolem/walk4.ogg");
		//END iron golem
		
		//magma cube
		downloadResource("", "/newsound/mob/magmacube/big1.ogg");
		downloadResource("", "/newsound/mob/magmacube/big2.ogg");
		downloadResource("", "/newsound/mob/magmacube/big3.ogg");
		downloadResource("", "/newsound/mob/magmacube/big4.ogg");
		downloadResource("", "/newsound/mob/magmacube/jump1.ogg");
		downloadResource("", "/newsound/mob/magmacube/jump2.ogg");
		downloadResource("", "/newsound/mob/magmacube/jump3.ogg");
		downloadResource("", "/newsound/mob/magmacube/jump4.ogg");
		downloadResource("", "/newsound/mob/magmacube/small1.ogg");
		downloadResource("", "/newsound/mob/magmacube/small2.ogg");
		downloadResource("", "/newsound/mob/magmacube/small3.ogg");
		downloadResource("", "/newsound/mob/magmacube/small4.ogg");
		downloadResource("", "/newsound/mob/magmacube/small5.ogg");
		//END magma cube
		
		//silverfish
		downloadResource("", "/newsound/mob/silverfish/hit1.ogg");
		downloadResource("", "/newsound/mob/silverfish/hit2.ogg");
		downloadResource("", "/newsound/mob/silverfish/hit3.ogg");
		downloadResource("", "/newsound/mob/silverfish/say1.ogg");
		downloadResource("", "/newsound/mob/silverfish/say2.ogg");
		downloadResource("", "/newsound/mob/silverfish/say3.ogg");
		downloadResource("", "/newsound/mob/silverfish/say4.ogg");
		downloadResource("", "/newsound/mob/silverfish/step1.ogg");
		downloadResource("", "/newsound/mob/silverfish/step2.ogg");
		downloadResource("", "/newsound/mob/silverfish/step3.ogg");
		downloadResource("", "/newsound/mob/silverfish/step4.ogg");
		//END silverfish
	}
	
	public static void pe()
	{
		downloadResource("", "/pe/humble.png");
	}
	
	public static void sound()
	{
		//step
		downloadResource("", "/sound/step/grass1.ogg");
		downloadResource("", "/sound/step/grass2.ogg");
		downloadResource("", "/sound/step/grass3.ogg");
		downloadResource("", "/sound/step/grass4.ogg");
		downloadResource("", "/sound/step/gravel1.ogg");
		downloadResource("", "/sound/step/gravel2.ogg");
		downloadResource("", "/sound/step/gravel3.ogg");
		downloadResource("", "/sound/step/gravel4.ogg");
		downloadResource("", "/sound/step/stone1.ogg");
		downloadResource("", "/sound/step/stone2.ogg");
		downloadResource("", "/sound/step/stone3.ogg");
		downloadResource("", "/sound/step/stone4.ogg");
		downloadResource("", "/sound/step/wood1.ogg");
		downloadResource("", "/sound/step/wood2.ogg");
		downloadResource("", "/sound/step/wood3.ogg");
		downloadResource("", "/sound/step/wood4.ogg");
		//END step
	}
	
	public static void soundThree()
	{
		//ambient
		
		//cave
		downloadResource("https://resources.download.minecraft.net/29/29d4dccf3353334c7aa2a49cb6fed3780a51a1ba", "/newsound/ambient/cave/cave1.ogg");
		downloadResource("", "/newsound/ambient/cave/cave2.ogg");
		downloadResource("", "/newsound/ambient/cave/cave3.ogg");
		downloadResource("", "/newsound/ambient/cave/cave4.ogg");
		downloadResource("", "/newsound/ambient/cave/cave5.ogg");
		downloadResource("", "/newsound/ambient/cave/cave6.ogg");
		downloadResource("", "/newsound/ambient/cave/cave7.ogg");
		downloadResource("", "/newsound/ambient/cave/cave8.ogg");
		downloadResource("", "/newsound/ambient/cave/cave9.ogg");
		downloadResource("", "/newsound/ambient/cave/cave10.ogg");
		downloadResource("", "/newsound/ambient/cave/cave11.ogg");
		//END cave
		
		//weather ALL LOCAL
		downloadResource("", "/newsound/ambient/weather/rain1.ogg");
		downloadResource("", "/newsound/ambient/weather/rain2.ogg");
		downloadResource("", "/newsound/ambient/weather/rain3.ogg");
		downloadResource("", "/newsound/ambient/weather/rain4.ogg");
		downloadResource("", "newsound/ambient/weather/thunder1.ogg");
		downloadResource("", "newsound/ambient/weather/thunder2.ogg");
		downloadResource("", "newsound/ambient/weather/thunder3.ogg");
		//END weather
		
		//END ambient
		
		//damage
		downloadResource("", "/newsound/damage/fallbig.ogg");
		downloadResource("", "/newsound/damage/fallsmall.ogg");
		downloadResource("", "/newsound/damage/hit1.ogg");
		downloadResource("", "/newsound/damage/hit2.ogg");
		downloadResource("", "/newsound/damage/hit3.ogg");
		//END damage
	}
	
	public static void streaming()
	{
		downloadResource("", "/streaming/11.mus");
		downloadResource("", "/streaming/13.mus");
		downloadResource("", "/streaming/13.ogg");
		downloadResource("", "/streaming/blocks.mus");
		downloadResource("", "/streaming/cat.mus");
		downloadResource("", "/streaming/cat.ogg");
		downloadResource("", "/streaming/chirp.mus");
		downloadResource("", "/streaming/far.mus");
		downloadResource("", "/streaming/mall.mus");
		downloadResource("", "/streaming/mellohi.mus");
		downloadResource("", "/streaming/stal.mus");
		downloadResource("", "/streaming/strad.mus");
		downloadResource("", "/streaming/wait.mus");
		downloadResource("", "/streaming/ward.mus");
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
