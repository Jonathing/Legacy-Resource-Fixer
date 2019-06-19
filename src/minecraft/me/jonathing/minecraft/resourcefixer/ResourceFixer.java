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
		downloadResource("", "/newsound/ambient/weather/thunder1.ogg");
		downloadResource("", "/newsound/ambient/weather/thunder2.ogg");
		downloadResource("", "/newsound/ambient/weather/thunder3.ogg");
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
		downloadResource("", "/newsound/mob/silverfish/kill.ogg");
		downloadResource("", "/newsound/mob/silverfish/say1.ogg");
		downloadResource("", "/newsound/mob/silverfish/say2.ogg");
		downloadResource("", "/newsound/mob/silverfish/say3.ogg");
		downloadResource("", "/newsound/mob/silverfish/say4.ogg");
		downloadResource("", "/newsound/mob/silverfish/step1.ogg");
		downloadResource("", "/newsound/mob/silverfish/step2.ogg");
		downloadResource("", "/newsound/mob/silverfish/step3.ogg");
		downloadResource("", "/newsound/mob/silverfish/step4.ogg");
		//END silverfish
		
		//wolf
		downloadResource("", "/newsound/mob/wolf/bark1.ogg");
		downloadResource("", "/newsound/mob/wolf/bark2.ogg");
		downloadResource("", "/newsound/mob/wolf/bark3.ogg");
		downloadResource("", "/newsound/mob/wolf/death.ogg");
		downloadResource("", "/newsound/mob/wolf/growl1.ogg");
		downloadResource("", "/newsound/mob/wolf/growl2.ogg");
		downloadResource("", "/newsound/mob/wolf/growl3.ogg");
		downloadResource("", "/newsound/mob/wolf/howl1.ogg");
		downloadResource("", "/newsound/mob/wolf/howl2.ogg");
		downloadResource("", "/newsound/mob/wolf/hurt1.ogg");
		downloadResource("", "/newsound/mob/wolf/hurt2.ogg");
		downloadResource("", "/newsound/mob/wolf/hurt3.ogg");
		downloadResource("", "/newsound/mob/wolf/panting.ogg");
		downloadResource("", "/newsound/mob/wolf/shake.ogg");
		downloadResource("", "/newsound/mob/wolf/whine.ogg");
		//END wolf
		
		//zombie
		downloadResource("", "/newsound/mob/zombie/metal1.ogg");
		downloadResource("", "/newsound/mob/zombie/metal2.ogg");
		downloadResource("", "/newsound/mob/zombie/metal3.ogg");
		downloadResource("", "/newsound/mob/zombie/wood1.ogg");
		downloadResource("", "/newsound/mob/zombie/wood2.ogg");
		downloadResource("", "/newsound/mob/zombie/wood3.ogg");
		downloadResource("", "/newsound/mob/zombie/wood4.ogg");
		downloadResource("", "/newsound/mob/zombie/woodbreak.ogg");
		//END zombie
		
		//zombiepig
		downloadResource("", "/newsound/mob/zombiepig/zpig1.ogg");
		downloadResource("", "/newsound/mob/zombiepig/zpig2.ogg");
		downloadResource("", "/newsound/mob/zombiepig/zpig3.ogg");
		downloadResource("", "/newsound/mob/zombiepig/zpig4.ogg");
		downloadResource("", "/newsound/mob/zombiepig/zpigangry1.ogg");
		downloadResource("", "/newsound/mob/zombiepig/zpigangry2.ogg");
		downloadResource("", "/newsound/mob/zombiepig/zpigangry3.ogg");
		downloadResource("", "/newsound/mob/zombiepig/zpigangry4.ogg");
		downloadResource("", "/newsound/mob/zombiepig/zpigdeath.ogg");
		downloadResource("", "/newsound/mob/zombiepig/zpighurt1.ogg");
		downloadResource("", "/newsound/mob/zombiepig/zpighurt1.ogg");
		//END zombiepig
		
		downloadResource("", "/newsound/mob/chicken1.ogg");
		downloadResource("", "/newsound/mob/chicken2.ogg");
		downloadResource("", "/newsound/mob/chicken3.ogg");
		downloadResource("", "/newsound/mob/chickenhurt1.ogg");
		downloadResource("", "/newsound/mob/chickenhurt2.ogg");
		downloadResource("", "/newsound/mob/chickenplop.ogg");
		downloadResource("", "/newsound/mob/cow1.ogg");
		downloadResource("", "/newsound/mob/cow2.ogg");
		downloadResource("", "/newsound/mob/cow3.ogg");
		downloadResource("", "/newsound/mob/cow4.ogg");
		downloadResource("", "/newsound/mob/cowhurt1.ogg");
		downloadResource("", "/newsound/mob/cowhurt2.ogg");
		downloadResource("", "/newsound/mob/cowhurt3.ogg");
		downloadResource("", "/newsound/mob/creeper1.ogg");
		downloadResource("", "/newsound/mob/creeper2.ogg");
		downloadResource("", "/newsound/mob/creeper3.ogg");
		downloadResource("", "/newsound/mob/creeper4.ogg");
		downloadResource("", "/newsound/mob/creeperdeath.ogg");
		downloadResource("", "/newsound/mob/pig1.ogg");
		downloadResource("", "/newsound/mob/pig2.ogg");
		downloadResource("", "/newsound/mob/pig3.ogg");
		downloadResource("", "/newsound/mob/pigdeath.ogg");
		downloadResource("", "/newsound/mob/sheep1.ogg");
		downloadResource("", "/newsound/mob/sheep2.ogg");
		downloadResource("", "/newsound/mob/sheep3.ogg");
		downloadResource("", "/newsound/mob/skeleton1.ogg");
		downloadResource("", "/newsound/mob/skeleton2.ogg");
		downloadResource("", "/newsound/mob/skeleton3.ogg");
		downloadResource("", "/newsound/mob/skeletondeath.ogg");
		downloadResource("", "/newsound/mob/skeletonhurt1.ogg");
		downloadResource("", "/newsound/mob/skeletonhurt2.ogg");
		downloadResource("", "/newsound/mob/skeletonhurt3.ogg");
		downloadResource("", "/newsound/mob/skeletonhurt4.ogg");
		downloadResource("", "/newsound/mob/slime1.ogg");
		downloadResource("", "/newsound/mob/slime2.ogg");
		downloadResource("", "/newsound/mob/slime3.ogg");
		downloadResource("", "/newsound/mob/slime4.ogg");
		downloadResource("", "/newsound/mob/slime5.ogg");
		downloadResource("", "/newsound/mob/slimeattack1.ogg");
		downloadResource("", "/newsound/mob/slimeattack2.ogg");
		downloadResource("", "/newsound/mob/spider1.ogg");
		downloadResource("", "/newsound/mob/spider2.ogg");
		downloadResource("", "/newsound/mob/spider3.ogg");
		downloadResource("", "/newsound/mob/spider4.ogg");
		downloadResource("", "/newsound/mob/spiderdeath.ogg");
		downloadResource("", "/newsound/mob/zombie1.ogg");
		downloadResource("", "/newsound/mob/zombie2.ogg");
		downloadResource("", "/newsound/mob/zombie3.ogg");
		downloadResource("", "/newsound/mob/zombiedeath.ogg");
		downloadResource("", "/newsound/mob/zombiehurt1.ogg");
		downloadResource("", "/newsound/mob/zombiehurt2.ogg");
		
		//END mob
		
		//note
		downloadResource("", "/newsound/note/bass.ogg");
		downloadResource("", "/newsound/note/bassattack.ogg");
		downloadResource("", "/newsound/note/bd.ogg");
		downloadResource("", "/newsound/note/harp.ogg");
		downloadResource("", "/newsound/note/hat.ogg");
		downloadResource("", "/newsound/note/pling.ogg");
		downloadResource("", "/newsound/note/snare.ogg");
		//END note
		
		//portal
		downloadResource("", "/newsound/portal/portal.ogg");
		downloadResource("", "/newsound/portal/travel.ogg");
		downloadResource("", "/newsound/portal/trigger.ogg");
		//END portal
		
		//random
		downloadResource("", "/newsound/random/bow.ogg");
		downloadResource("", "/newsound/random/bowhit1.ogg");
		downloadResource("", "/newsound/random/bowhit2.ogg");
		downloadResource("", "/newsound/random/bowhit3.ogg");
		downloadResource("", "/newsound/random/bowhit4.ogg");
		downloadResource("", "/newsound/random/break.ogg");
		downloadResource("", "/newsound/random/breath.ogg");
		downloadResource("", "/newsound/random/burp.ogg");
		downloadResource("", "/newsound/random/chestclosed.ogg");
		downloadResource("", "/newsound/random/chestopen.ogg");
		downloadResource("", "/newsound/random/click.ogg");
		downloadResource("", "/newsound/random/door_close.ogg");
		downloadResource("", "/newsound/random/door_open.ogg");
		downloadResource("", "/newsound/random/drink.ogg");
		downloadResource("", "/newsound/random/drr.ogg");
		downloadResource("", "/newsound/random/eat1.ogg");
		downloadResource("", "/newsound/random/eat2.ogg");
		downloadResource("", "/newsound/random/eat3.ogg");
		downloadResource("", "/newsound/random/explode1.ogg");
		downloadResource("", "/newsound/random/explode2.ogg");
		downloadResource("", "/newsound/random/explode3.ogg");
		downloadResource("", "/newsound/random/explode4.ogg");
		downloadResource("", "/newsound/random/fizz.ogg");
		downloadResource("", "/newsound/random/fuze.ogg");
		downloadResource("", "/newsound/random/glass1.ogg");
		downloadResource("", "/newsound/random/glass2.ogg");
		downloadResource("", "/newsound/random/glass3.ogg");
		downloadResource("", "/newsound/random/hurt.ogg");
		downloadResource("", "/newsound/random/levelup.ogg");
		downloadResource("", "/newsound/random/old_explode.ogg");
		downloadResource("", "/newsound/random/orb.ogg");
		downloadResource("", "/newsound/random/pop.ogg");
		downloadResource("", "/newsound/random/splash.ogg");
		downloadResource("", "/newsound/random/wood_click.ogg");
		//END random
		
		//step
		downloadResource("", "/newsound/step/cloth1.ogg");
		downloadResource("", "/newsound/step/cloth2.ogg");
		downloadResource("", "/newsound/step/cloth3.ogg");
		downloadResource("", "/newsound/step/cloth4.ogg");
		downloadResource("", "/newsound/step/grass1.ogg");
		downloadResource("", "/newsound/step/grass2.ogg");
		downloadResource("", "/newsound/step/grass3.ogg");
		downloadResource("", "/newsound/step/grass4.ogg");
		downloadResource("", "/newsound/step/gravel1.ogg");
		downloadResource("", "/newsound/step/gravel2.ogg");
		downloadResource("", "/newsound/step/gravel3.ogg");
		downloadResource("", "/newsound/step/gravel4.ogg");
		downloadResource("", "/newsound/step/sand1.ogg");
		downloadResource("", "/newsound/step/sand2.ogg");
		downloadResource("", "/newsound/step/sand3.ogg");
		downloadResource("", "/newsound/step/sand4.ogg");
		downloadResource("", "/newsound/step/snow1.ogg");
		downloadResource("", "/newsound/step/snow2.ogg");
		downloadResource("", "/newsound/step/snow3.ogg");
		downloadResource("", "/newsound/step/snow4.ogg");
		downloadResource("", "/newsound/step/stone1.ogg");
		downloadResource("", "/newsound/step/stone2.ogg");
		downloadResource("", "/newsound/step/stone3.ogg");
		downloadResource("", "/newsound/step/stone4.ogg");
		downloadResource("", "/newsound/step/wood1.ogg");
		downloadResource("", "/newsound/step/wood2.ogg");
		downloadResource("", "/newsound/step/wood3.ogg");
		downloadResource("", "/newsound/step/wood4.ogg");
		//END step
		
		//tile
		
		//piston
		downloadResource("", "/newsound/tile/piston/in.ogg");
		downloadResource("", "/newsound/tile/piston/out.ogg");
		//END piston
		
		//END tile
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
		downloadResource("", "/sound3/ambient/cave/cave2.ogg");
		downloadResource("", "/sound3/ambient/cave/cave3.ogg");
		downloadResource("", "/sound3/ambient/cave/cave4.ogg");
		downloadResource("", "/sound3/ambient/cave/cave5.ogg");
		downloadResource("", "/sound3/ambient/cave/cave6.ogg");
		downloadResource("", "/sound3/ambient/cave/cave7.ogg");
		downloadResource("", "/sound3/ambient/cave/cave8.ogg");
		downloadResource("", "/sound3/ambient/cave/cave9.ogg");
		downloadResource("", "/sound3/ambient/cave/cave10.ogg");
		downloadResource("", "/sound3/ambient/cave/cave11.ogg");
		//END cave
		
		//weather ALL LOCAL
		downloadResource("", "/sound3/ambient/weather/rain1.ogg");
		downloadResource("", "/sound3/ambient/weather/rain2.ogg");
		downloadResource("", "/sound3/ambient/weather/rain3.ogg");
		downloadResource("", "/sound3/ambient/weather/rain4.ogg");
		downloadResource("", "/sound3/ambient/weather/thunder1.ogg");
		downloadResource("", "/sound3/ambient/weather/thunder2.ogg");
		downloadResource("", "/sound3/ambient/weather/thunder3.ogg");
		//END weather
		
		//END ambient
		
		//damage
		downloadResource("", "/sound3/damage/fallbig.ogg");
		downloadResource("", "/sound3/damage/fallsmall.ogg");
		downloadResource("", "/sound3/damage/hit1.ogg");
		downloadResource("", "/sound3/damage/hit2.ogg");
		downloadResource("", "/sound3/damage/hit3.ogg");
		//END damage
		
		//fire
		downloadResource("", "/sound3/fire/fire.ogg");
		downloadResource("", "/sound3/fire/ignite.ogg");
		//END fire
		
		//fireworks
		downloadResource("", "/sound3/fireworks/blast_far1.ogg");
		downloadResource("", "/sound3/fireworks/blast1.ogg");
		downloadResource("", "/sound3/fireworks/largeBlast_far1.ogg");
		downloadResource("", "/sound3/fireworks/largeBlast1.ogg");
		downloadResource("", "/sound3/fireworks/launch1.ogg");
		downloadResource("", "/sound3/fireworks/twinkle_far1.ogg");
		downloadResource("", "/sound3/fireworks/twinkle1.ogg");
		//END fireworks
		
		//liquid
		downloadResource("", "/sound3/liquid/lava.ogg");
		downloadResource("", "/sound3/liquid/lavapop.ogg");
		downloadResource("", "/sound3/liquid/splash.ogg");
		downloadResource("", "/sound3/liquid/splash2.ogg");
		downloadResource("", "/sound3/liquid/swim1.ogg");
		downloadResource("", "/sound3/liquid/swim2.ogg");
		downloadResource("", "/sound3/liquid/swim3.ogg");
		downloadResource("", "/sound3/liquid/swim4.ogg");
		downloadResource("", "/sound3/liquid/water.ogg");
		//END liquid
		
		//minecart
		downloadResource("", "/sound3/minecart/base.ogg");
		downloadResource("", "/sound3/minecart/inside.ogg");
		//END minecart
		
		//mob
		
		//bat
		downloadResource("", "/sound3/mob/bat/death.ogg");
		downloadResource("", "/sound3/mob/bat/hurt1.ogg");
		downloadResource("", "/sound3/mob/bat/hurt2.ogg");
		downloadResource("", "/sound3/mob/bat/hurt3.ogg");
		downloadResource("", "/sound3/mob/bat/hurt4.ogg");
		downloadResource("", "/sound3/mob/bat/idle1.ogg");
		downloadResource("", "/sound3/mob/bat/idle2.ogg");
		downloadResource("", "/sound3/mob/bat/idle3.ogg");
		downloadResource("", "/sound3/mob/bat/idle4.ogg");
		downloadResource("", "/sound3/mob/bat/loop.ogg");
		downloadResource("", "/sound3/mob/bat/takeoff.ogg");
		//END bat
		
		//blaze
		downloadResource("", "/sound3/mob/blaze/breathe1.ogg");
		downloadResource("", "/sound3/mob/blaze/breathe2.ogg");
		downloadResource("", "/sound3/mob/blaze/breathe3.ogg");
		downloadResource("", "/sound3/mob/blaze/breathe4.ogg");
		downloadResource("", "/sound3/mob/blaze/death.ogg");
		downloadResource("", "/sound3/mob/blaze/hit1.ogg");
		downloadResource("", "/sound3/mob/blaze/hit2.ogg");
		downloadResource("", "/sound3/mob/blaze/hit3.ogg");
		downloadResource("", "/sound3/mob/blaze/hit4.ogg");
		//END blaze
		
		//cat
		downloadResource("", "/sound3/mob/cat/hiss1.ogg");
		downloadResource("", "/sound3/mob/cat/hiss2.ogg");
		downloadResource("", "/sound3/mob/cat/hiss3.ogg");
		downloadResource("", "/sound3/mob/cat/hitt1.ogg");
		downloadResource("", "/sound3/mob/cat/hitt2.ogg");
		downloadResource("", "/sound3/mob/cat/hitt3.ogg");
		downloadResource("", "/sound3/mob/cat/meow1.ogg");
		downloadResource("", "/sound3/mob/cat/meow2.ogg");
		downloadResource("", "/sound3/mob/cat/meow3.ogg");
		downloadResource("", "/sound3/mob/cat/meow4.ogg");
		downloadResource("", "/sound3/mob/cat/purr1.ogg");
		downloadResource("", "/sound3/mob/cat/purr2.ogg");
		downloadResource("", "/sound3/mob/cat/purr3.ogg");
		downloadResource("", "/sound3/mob/cat/purreow1.ogg");
		downloadResource("", "/sound3/mob/cat/purreow2.ogg");
		//END cat
		
		//chicken
		downloadResource("", "/sound3/mob/chicken/say1.ogg");
		downloadResource("", "/sound3/mob/chicken/say2.ogg");
		downloadResource("", "/sound3/mob/chicken/say3.ogg");
		downloadResource("", "/sound3/mob/chicken/hurt1.ogg");
		downloadResource("", "/sound3/mob/chicken/hurt2.ogg");
		downloadResource("", "/sound3/mob/chicken/plop.ogg");
		downloadResource("", "/sound3/mob/chicken/step1.ogg");
		downloadResource("", "/sound3/mob/chicken/step2.ogg");
		//END chicken
		
		//cow
		downloadResource("", "/sound3/mob/cow/say1.ogg");
		downloadResource("", "/sound3/mob/cow/say2.ogg");
		downloadResource("", "/sound3/mob/cow/say3.ogg");
		downloadResource("", "/sound3/mob/cow/say4.ogg");
		downloadResource("", "/sound3/mob/cow/hurt1.ogg");
		downloadResource("", "/sound3/mob/cow/hurt2.ogg");
		downloadResource("", "/sound3/mob/cow/hurt3.ogg");
		downloadResource("", "/sound3/mob/cow/step1.ogg");
		downloadResource("", "/sound3/mob/cow/step2.ogg");
		downloadResource("", "/sound3/mob/cow/step3.ogg");
		downloadResource("", "/sound3/mob/cow/step4.ogg");
		//END cow
		
		//creeper
		downloadResource("", "/sound3/mob/creeper/say1.ogg");
		downloadResource("", "/sound3/mob/creeper/say2.ogg");
		downloadResource("", "/sound3/mob/creeper/say3.ogg");
		downloadResource("", "/sound3/mob/creeper/say4.ogg");
		downloadResource("", "/sound3/mob/creeper/death.ogg");
		//END creeper
		
		//enderdragon
		downloadResource("", "/sound3/mob/enderdragon/end.ogg");
		downloadResource("", "/sound3/mob/enderdragon/growl1.ogg");
		downloadResource("", "/sound3/mob/enderdragon/growl2.ogg");
		downloadResource("", "/sound3/mob/enderdragon/growl3.ogg");
		downloadResource("", "/sound3/mob/enderdragon/growl4.ogg");
		downloadResource("", "/sound3/mob/enderdragon/hit1.ogg");
		downloadResource("", "/sound3/mob/enderdragon/hit2.ogg");
		downloadResource("", "/sound3/mob/enderdragon/hit3.ogg");
		downloadResource("", "/sound3/mob/enderdragon/hit4.ogg");
		downloadResource("", "/sound3/mob/enderdragon/wings1.ogg");
		downloadResource("", "/sound3/mob/enderdragon/wings2.ogg");
		downloadResource("", "/sound3/mob/enderdragon/wings3.ogg");
		downloadResource("", "/sound3/mob/enderdragon/wings4.ogg");
		downloadResource("", "/sound3/mob/enderdragon/wings5.ogg");
		downloadResource("", "/sound3/mob/enderdragon/wings6.ogg");
		//END enderdragon
		
		//endermen
		downloadResource("", "/sound3/mob/endermen/death.ogg");
		downloadResource("", "/sound3/mob/endermen/hit1.ogg");
		downloadResource("", "/sound3/mob/endermen/hit2.ogg");
		downloadResource("", "/sound3/mob/endermen/hit3.ogg");
		downloadResource("", "/sound3/mob/endermen/hit4.ogg");
		downloadResource("", "/sound3/mob/endermen/idle1.ogg");
		downloadResource("", "/sound3/mob/endermen/idle2.ogg");
		downloadResource("", "/sound3/mob/endermen/idle3.ogg");
		downloadResource("", "/sound3/mob/endermen/idle4.ogg");
		downloadResource("", "/sound3/mob/endermen/idle5.ogg");
		downloadResource("", "/sound3/mob/endermen/portal.ogg");
		downloadResource("", "/sound3/mob/endermen/portal2.ogg");
		downloadResource("", "/sound3/mob/endermen/scream1.ogg");
		downloadResource("", "/sound3/mob/endermen/scream2.ogg");
		downloadResource("", "/sound3/mob/endermen/scream3.ogg");
		downloadResource("", "/sound3/mob/endermen/scream4.ogg");
		downloadResource("", "/sound3/mob/endermen/stare.ogg");
		//END endermen
		
		//ghast
		downloadResource("", "/sound3/mob/ghast/affectionate scream.ogg");
		downloadResource("", "/sound3/mob/ghast/charge.ogg");
		downloadResource("", "/sound3/mob/ghast/death.ogg");
		downloadResource("", "/sound3/mob/ghast/fireball4.ogg");
		downloadResource("", "/sound3/mob/ghast/moan1.ogg");
		downloadResource("", "/sound3/mob/ghast/moan2.ogg");
		downloadResource("", "/sound3/mob/ghast/moan3.ogg");
		downloadResource("", "/sound3/mob/ghast/moan4.ogg");
		downloadResource("", "/sound3/mob/ghast/moan5.ogg");
		downloadResource("", "/sound3/mob/ghast/moan6.ogg");
		downloadResource("", "/sound3/mob/ghast/moan7.ogg");
		downloadResource("", "/sound3/mob/ghast/scream1.ogg");
		downloadResource("", "/sound3/mob/ghast/scream2.ogg");
		downloadResource("", "/sound3/mob/ghast/scream3.ogg");
		downloadResource("", "/sound3/mob/ghast/scream4.ogg");
		downloadResource("", "/sound3/mob/ghast/scream5.ogg");
		//END ghast
		
		//iron golem
		downloadResource("", "/sound3/mob/irongolem/death.ogg");
		downloadResource("", "/sound3/mob/irongolem/hit1.ogg");
		downloadResource("", "/sound3/mob/irongolem/hit2.ogg");
		downloadResource("", "/sound3/mob/irongolem/hit3.ogg");
		downloadResource("", "/sound3/mob/irongolem/hit4.ogg");
		downloadResource("", "/sound3/mob/irongolem/throw.ogg");
		downloadResource("", "/sound3/mob/irongolem/walk1.ogg");
		downloadResource("", "/sound3/mob/irongolem/walk2.ogg");
		downloadResource("", "/sound3/mob/irongolem/walk3.ogg");
		downloadResource("", "/sound3/mob/irongolem/walk4.ogg");
		//END iron golem
		
		//magma cube
		downloadResource("", "/sound3/mob/magmacube/big1.ogg");
		downloadResource("", "/sound3/mob/magmacube/big2.ogg");
		downloadResource("", "/sound3/mob/magmacube/big3.ogg");
		downloadResource("", "/sound3/mob/magmacube/big4.ogg");
		downloadResource("", "/sound3/mob/magmacube/jump1.ogg");
		downloadResource("", "/sound3/mob/magmacube/jump2.ogg");
		downloadResource("", "/sound3/mob/magmacube/jump3.ogg");
		downloadResource("", "/sound3/mob/magmacube/jump4.ogg");
		downloadResource("", "/sound3/mob/magmacube/small1.ogg");
		downloadResource("", "/sound3/mob/magmacube/small2.ogg");
		downloadResource("", "/sound3/mob/magmacube/small3.ogg");
		downloadResource("", "/sound3/mob/magmacube/small4.ogg");
		downloadResource("", "/sound3/mob/magmacube/small5.ogg");
		//END magma cube
		
		//pig
		downloadResource("", "/sound3/mob/pig/say1.ogg");
		downloadResource("", "/sound3/mob/pig/say2.ogg");
		downloadResource("", "/sound3/mob/pig/say3.ogg");
		downloadResource("", "/sound3/mob/pig/death.ogg");
		downloadResource("", "/sound3/mob/pig/step1.ogg");
		downloadResource("", "/sound3/mob/pig/step2.ogg");
		downloadResource("", "/sound3/mob/pig/step3.ogg");
		downloadResource("", "/sound3/mob/pig/step4.ogg");
		downloadResource("", "/sound3/mob/pig/step5.ogg");
		//END pig
		
		//sheep
		downloadResource("", "/sound3/mob/sheep/say1.ogg");
		downloadResource("", "/sound3/mob/sheep/say2.ogg");
		downloadResource("", "/sound3/mob/sheep/say3.ogg");
		downloadResource("", "/sound3/mob/sheep/shear.ogg");
		downloadResource("", "/sound3/mob/sheep/step1.ogg");
		downloadResource("", "/sound3/mob/sheep/step2.ogg");
		downloadResource("", "/sound3/mob/sheep/step3.ogg");
		downloadResource("", "/sound3/mob/sheep/step4.ogg");
		downloadResource("", "/sound3/mob/sheep/step5.ogg");
		//END sheep
		
		//silverfish
		downloadResource("", "/sound3/mob/silverfish/hit1.ogg");
		downloadResource("", "/sound3/mob/silverfish/hit2.ogg");
		downloadResource("", "/sound3/mob/silverfish/hit3.ogg");
		downloadResource("", "/sound3/mob/silverfish/kill.ogg");
		downloadResource("", "/sound3/mob/silverfish/say1.ogg");
		downloadResource("", "/sound3/mob/silverfish/say2.ogg");
		downloadResource("", "/sound3/mob/silverfish/say3.ogg");
		downloadResource("", "/sound3/mob/silverfish/say4.ogg");
		downloadResource("", "/sound3/mob/silverfish/step1.ogg");
		downloadResource("", "/sound3/mob/silverfish/step2.ogg");
		downloadResource("", "/sound3/mob/silverfish/step3.ogg");
		downloadResource("", "/sound3/mob/silverfish/step4.ogg");
		//END silverfish
		
		//skeleton
		downloadResource("", "/sound3/mob/skeleton/say1.ogg");
		downloadResource("", "/sound3/mob/skeleton/say2.ogg");
		downloadResource("", "/sound3/mob/skeleton/say3.ogg");
		downloadResource("", "/sound3/mob/skeleton/death.ogg");
		downloadResource("", "/sound3/mob/skeleton/hurt1.ogg");
		downloadResource("", "/sound3/mob/skeleton/hurt2.ogg");
		downloadResource("", "/sound3/mob/skeleton/hurt3.ogg");
		downloadResource("", "/sound3/mob/skeleton/hurt4.ogg");
		downloadResource("", "/sound3/mob/skeleton/step1.ogg");
		downloadResource("", "/sound3/mob/skeleton/step2.ogg");
		downloadResource("", "/sound3/mob/skeleton/step3.ogg");
		downloadResource("", "/sound3/mob/skeleton/step4.ogg");
		//END skeleton
		
		//slime
		downloadResource("", "/sound3/mob/slime/small1.ogg");
		downloadResource("", "/sound3/mob/slime/small2.ogg");
		downloadResource("", "/sound3/mob/slime/small3.ogg");
		downloadResource("", "/sound3/mob/slime/small4.ogg");
		downloadResource("", "/sound3/mob/slime/small5.ogg");
		downloadResource("", "/sound3/mob/slime/attack1.ogg");
		downloadResource("", "/sound3/mob/slime/attack2.ogg");
		downloadResource("", "/sound3/mob/slime/big1.ogg");
		downloadResource("", "/sound3/mob/slime/big2.ogg");
		downloadResource("", "/sound3/mob/slime/big3.ogg");
		downloadResource("", "/sound3/mob/slime/big4.ogg");
		//END slime
		
		//spider
		downloadResource("", "/sound3/mob/spider/say1.ogg");
		downloadResource("", "/sound3/mob/spider/say2.ogg");
		downloadResource("", "/sound3/mob/spider/say3.ogg");
		downloadResource("", "/sound3/mob/spider/say4.ogg");
		downloadResource("", "/sound3/mob/spider/death.ogg");
		downloadResource("", "/sound3/mob/spider/step1.ogg");
		downloadResource("", "/sound3/mob/spider/step2.ogg");
		downloadResource("", "/sound3/mob/spider/step3.ogg");
		downloadResource("", "/sound3/mob/spider/step4.ogg");
		//END spider
		
		//wither
		downloadResource("", "/sound3/mob/wither/death.ogg");
		downloadResource("", "/sound3/mob/wither/hurt1.ogg");
		downloadResource("", "/sound3/mob/wither/hurt2.ogg");
		downloadResource("", "/sound3/mob/wither/hurt3.ogg");
		downloadResource("", "/sound3/mob/wither/hurt4.ogg");
		downloadResource("", "/sound3/mob/wither/idle1.ogg");
		downloadResource("", "/sound3/mob/wither/idle2.ogg");
		downloadResource("", "/sound3/mob/wither/idle3.ogg");
		downloadResource("", "/sound3/mob/wither/idle4.ogg");
		downloadResource("", "/sound3/mob/wither/shoot.ogg");
		downloadResource("", "/sound3/mob/wither/spawn.ogg");
		//END wither
		
		//wolf
		downloadResource("", "/sound3/mob/wolf/bark1.ogg");
		downloadResource("", "/sound3/mob/wolf/bark2.ogg");
		downloadResource("", "/sound3/mob/wolf/bark3.ogg");
		downloadResource("", "/sound3/mob/wolf/death.ogg");
		downloadResource("", "/sound3/mob/wolf/growl1.ogg");
		downloadResource("", "/sound3/mob/wolf/growl2.ogg");
		downloadResource("", "/sound3/mob/wolf/growl3.ogg");
		downloadResource("", "/sound3/mob/wolf/howl1.ogg");
		downloadResource("", "/sound3/mob/wolf/howl2.ogg");
		downloadResource("", "/sound3/mob/wolf/hurt1.ogg");
		downloadResource("", "/sound3/mob/wolf/hurt2.ogg");
		downloadResource("", "/sound3/mob/wolf/hurt3.ogg");
		downloadResource("", "/sound3/mob/wolf/panting.ogg");
		downloadResource("", "/sound3/mob/wolf/shake.ogg");
		downloadResource("", "/sound3/mob/wolf/whine.ogg");
		downloadResource("", "/sound3/mob/wolf/step1.ogg");
		downloadResource("", "/sound3/mob/wolf/step2.ogg");
		downloadResource("", "/sound3/mob/wolf/step3.ogg");
		downloadResource("", "/sound3/mob/wolf/step4.ogg");
		downloadResource("", "/sound3/mob/wolf/step5.ogg");
		//END wolf
		
		//zombie
		downloadResource("", "/sound3/mob/zombie/metal1.ogg");
		downloadResource("", "/sound3/mob/zombie/metal2.ogg");
		downloadResource("", "/sound3/mob/zombie/metal3.ogg");
		downloadResource("", "/sound3/mob/zombie/wood1.ogg");
		downloadResource("", "/sound3/mob/zombie/wood2.ogg");
		downloadResource("", "/sound3/mob/zombie/wood3.ogg");
		downloadResource("", "/sound3/mob/zombie/wood4.ogg");
		downloadResource("", "/sound3/mob/zombie/woodbreak.ogg");
		downloadResource("", "/sound3/mob/zombie/say1.ogg");
		downloadResource("", "/sound3/mob/zombie/say2.ogg");
		downloadResource("", "/sound3/mob/zombie/say3.ogg");
		downloadResource("", "/sound3/mob/zombie/death.ogg");
		downloadResource("", "/sound3/mob/zombie/hurt1.ogg");
		downloadResource("", "/sound3/mob/zombie/hurt2.ogg");
		downloadResource("", "/sound3/mob/zombie/infect.ogg");
		downloadResource("", "/sound3/mob/zombie/remedy.ogg");
		downloadResource("", "/sound3/mob/zombie/unfect.ogg");
		downloadResource("", "/sound3/mob/zombie/step1.ogg");
		downloadResource("", "/sound3/mob/zombie/step2.ogg");
		downloadResource("", "/sound3/mob/zombie/step3.ogg");
		downloadResource("", "/sound3/mob/zombie/step4.ogg");
		downloadResource("", "/sound3/mob/zombie/step5.ogg");
		//END zombie
		
		//zombiepig
		downloadResource("", "/sound3/mob/zombiepig/zpig1.ogg");
		downloadResource("", "/sound3/mob/zombiepig/zpig2.ogg");
		downloadResource("", "/sound3/mob/zombiepig/zpig3.ogg");
		downloadResource("", "/sound3/mob/zombiepig/zpig4.ogg");
		downloadResource("", "/sound3/mob/zombiepig/zpigangry1.ogg");
		downloadResource("", "/sound3/mob/zombiepig/zpigangry2.ogg");
		downloadResource("", "/sound3/mob/zombiepig/zpigangry3.ogg");
		downloadResource("", "/sound3/mob/zombiepig/zpigangry4.ogg");
		downloadResource("", "/sound3/mob/zombiepig/zpigdeath.ogg");
		downloadResource("", "/sound3/mob/zombiepig/zpighurt1.ogg");
		downloadResource("", "/sound3/mob/zombiepig/zpighurt1.ogg");
		//END zombiepig
		
		//END mob

		//note
		downloadResource("", "/sound3/note/bass.ogg");
		downloadResource("", "/sound3/note/bassattack.ogg");
		downloadResource("", "/sound3/note/bd.ogg");
		downloadResource("", "/sound3/note/harp.ogg");
		downloadResource("", "/sound3/note/hat.ogg");
		downloadResource("", "/sound3/note/pling.ogg");
		downloadResource("", "/sound3/note/snare.ogg");
		//END note
		
		//portal
		downloadResource("", "/sound3/portal/portal.ogg");
		downloadResource("", "/sound3/portal/travel.ogg");
		downloadResource("", "/sound3/portal/trigger.ogg");
		//END portal
		
		//random
		downloadResource("", "/sound3/random/anvil_break.ogg");
		downloadResource("", "/sound3/random/anvil_land.ogg");
		downloadResource("", "/sound3/random/anvil_use.ogg");
		downloadResource("", "/sound3/random/bow.ogg");
		downloadResource("", "/sound3/random/bowhit1.ogg");
		downloadResource("", "/sound3/random/bowhit2.ogg");
		downloadResource("", "/sound3/random/bowhit3.ogg");
		downloadResource("", "/sound3/random/bowhit4.ogg");
		downloadResource("", "/sound3/random/break.ogg");
		downloadResource("", "/sound3/random/breath.ogg");
		downloadResource("", "/sound3/random/burp.ogg");
		downloadResource("", "/sound3/random/chestclosed.ogg");
		downloadResource("", "/sound3/random/chestopen.ogg");
		downloadResource("", "/sound3/random/classic_hurt.ogg");
		downloadResource("", "/sound3/random/click.ogg");
		downloadResource("", "/sound3/random/door_close.ogg");
		downloadResource("", "/sound3/random/door_open.ogg");
		downloadResource("", "/sound3/random/drink.ogg");
		downloadResource("", "/sound3/random/eat1.ogg");
		downloadResource("", "/sound3/random/eat2.ogg");
		downloadResource("", "/sound3/random/eat3.ogg");
		downloadResource("", "/sound3/random/explode1.ogg");
		downloadResource("", "/sound3/random/explode2.ogg");
		downloadResource("", "/sound3/random/explode3.ogg");
		downloadResource("", "/sound3/random/explode4.ogg");
		downloadResource("", "/sound3/random/fizz.ogg");
		downloadResource("", "/sound3/random/fuze.ogg");
		downloadResource("", "/sound3/random/glass1.ogg");
		downloadResource("", "/sound3/random/glass2.ogg");
		downloadResource("", "/sound3/random/glass3.ogg");
		downloadResource("", "/sound3/random/levelup.ogg");
		downloadResource("", "/sound3/random/orb.ogg");
		downloadResource("", "/sound3/random/pop.ogg");
		downloadResource("", "/sound3/random/splash.ogg");
		downloadResource("", "/sound3/random/successful_hit.ogg");
		downloadResource("", "/sound3/random/wood_click.ogg");
		//END random
		
		//step
		downloadResource("", "/sound3/step/cloth1.ogg");
		downloadResource("", "/sound3/step/cloth2.ogg");
		downloadResource("", "/sound3/step/cloth3.ogg");
		downloadResource("", "/sound3/step/cloth4.ogg");
		downloadResource("", "/sound3/step/grass1.ogg");
		downloadResource("", "/sound3/step/grass2.ogg");
		downloadResource("", "/sound3/step/grass3.ogg");
		downloadResource("", "/sound3/step/grass4.ogg");
		downloadResource("", "/sound3/step/grass5.ogg");
		downloadResource("", "/sound3/step/grass6.ogg");
		downloadResource("", "/sound3/step/gravel1.ogg");
		downloadResource("", "/sound3/step/gravel2.ogg");
		downloadResource("", "/sound3/step/gravel3.ogg");
		downloadResource("", "/sound3/step/gravel4.ogg");
		downloadResource("", "/sound3/step/ladder1.ogg");
		downloadResource("", "/sound3/step/ladder2.ogg");
		downloadResource("", "/sound3/step/ladder3.ogg");
		downloadResource("", "/sound3/step/ladder4.ogg");
		downloadResource("", "/sound3/step/ladder5.ogg");
		downloadResource("", "/sound3/step/sand1.ogg");
		downloadResource("", "/sound3/step/sand2.ogg");
		downloadResource("", "/sound3/step/sand3.ogg");
		downloadResource("", "/sound3/step/sand4.ogg");
		downloadResource("", "/sound3/step/sand5.ogg");
		downloadResource("", "/sound3/step/snow1.ogg");
		downloadResource("", "/sound3/step/snow2.ogg");
		downloadResource("", "/sound3/step/snow3.ogg");
		downloadResource("", "/sound3/step/snow4.ogg");
		downloadResource("", "/sound3/step/stone1.ogg");
		downloadResource("", "/sound3/step/stone2.ogg");
		downloadResource("", "/sound3/step/stone3.ogg");
		downloadResource("", "/sound3/step/stone4.ogg");
		downloadResource("", "/sound3/step/stone5.ogg");
		downloadResource("", "/sound3/step/stone6.ogg");
		downloadResource("", "/sound3/step/wood1.ogg");
		downloadResource("", "/sound3/step/wood2.ogg");
		downloadResource("", "/sound3/step/wood3.ogg");
		downloadResource("", "/sound3/step/wood4.ogg");
		downloadResource("", "/sound3/step/wood5.ogg");
		downloadResource("", "/sound3/step/wood6.ogg");
		//END step
		
		//tile
		
		//piston
		downloadResource("", "/sound3/tile/piston/in.ogg");
		downloadResource("", "/sound3/tile/piston/out.ogg");
		//END piston
		
		//END tile
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
