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
		downloadResource("https://resources.download.minecraft.net/56/5680749048457f5772ec95a73d856ad792fa1717", "/newsound/ambient/cave/cave2.ogg");
		downloadResource("https://resources.download.minecraft.net/d4/d4b06ccb8e331ece734f51d84a0a5fbc7164d8be", "/newsound/ambient/cave/cave3.ogg");
		downloadResource("https://resources.download.minecraft.net/48/48540d7788ce3d9e780cb448ce5676c53dbcfd23", "/newsound/ambient/cave/cave4.ogg");
		downloadResource("https://resources.download.minecraft.net/18/18a992d93128bb2e2861930cff3140c6940c0127", "/newsound/ambient/cave/cave5.ogg");
		downloadResource("https://resources.download.minecraft.net/cf/cf23204a9cca2ac7f9674168cc063cfb4dbe001f", "/newsound/ambient/cave/cave6.ogg");
		downloadResource("https://resources.download.minecraft.net/c8/c8dd60f7e7087da52a431c1dbc0f397317b374fb", "/newsound/ambient/cave/cave7.ogg");
		downloadResource("https://resources.download.minecraft.net/90/9024de3f1dd4bc1e8f445c7c5b812f25c7e31bf6", "/newsound/ambient/cave/cave8.ogg");
		downloadResource("https://resources.download.minecraft.net/b4/b463fa47816fe9a5dfe508093150e647403e4db6", "/newsound/ambient/cave/cave9.ogg");
		downloadResource("https://resources.download.minecraft.net/79/79a5b53bf22cca182ddff2a670942c49867663ec", "/newsound/ambient/cave/cave10.ogg");
		downloadResource("https://resources.download.minecraft.net/e3/e367d1dfa1ce07374e0aeaecbfb1526142a0dcc1", "/newsound/ambient/cave/cave11.ogg");
		downloadResource("https://resources.download.minecraft.net/a7/a720e85e35be0dc3186d01cc599121b87e7ee9f7", "/newsound/ambient/cave/cave12.ogg");
		downloadResource("https://resources.download.minecraft.net/63/63bbe3921abd75b9f6cd1e20330360d164da169b", "/newsound/ambient/cave/cave13.ogg");
		//END cave
		
		//weather ALL LOCAL
		downloadResource("https://resources.download.minecraft.net/d6/d68bae1949299ccd8297aaa423dd12e041e83773", "/newsound/ambient/weather/rain1.ogg");
		downloadResource("https://resources.download.minecraft.net/ba/ba58e1b6c8cc814a210db268d3e59a06b7ac62be", "/newsound/ambient/weather/rain2.ogg");
		downloadResource("https://resources.download.minecraft.net/4c/4cdd8fc380e85409fd94b93abdcad077d75ec58f", "/newsound/ambient/weather/rain3.ogg");
		downloadResource("https://resources.download.minecraft.net/08/08e555782cb2785b24e08a417a5e58aa08bd0695", "/newsound/ambient/weather/rain4.ogg");
		downloadResource("https://resources.download.minecraft.net/67/671ef0ae7b59014a2f637d7af6d781324ab6309f", "/newsound/ambient/weather/thunder1.ogg");
		downloadResource("https://resources.download.minecraft.net/a2/a20cbf2ddce541eaed520d7ec55665fe97428be6", "/newsound/ambient/weather/thunder2.ogg");
		downloadResource("https://resources.download.minecraft.net/9e/9ead5c928f9122e3c2f5fc4f6ce7fb4054a2b578", "/newsound/ambient/weather/thunder3.ogg");
		//END weather
		
		//END ambient
		
		//damage
		downloadResource("https://www.dropbox.com/s/x44vcx569exul4n/fallbig1.ogg?dl=1", "/newsound/damage/fallbig1.ogg");
		downloadResource("https://www.dropbox.com/s/31zuot8xoh9k60o/fallbig2.ogg?dl=1", "/newsound/damage/fallbig2.ogg");
		downloadResource("https://www.dropbox.com/s/j6ez1p6a03ldndw/fallsmall.ogg?dl=1", "/newsound/damage/fallsmall.ogg");
		downloadResource("https://www.dropbox.com/s/gaf1w4l0wq223oc/hurtflesh1.ogg?dl=1", "/newsound/damage/hurtflesh1.ogg");
		downloadResource("https://www.dropbox.com/s/ybfpu9v6gyo6ozh/hurtflesh2.ogg?dl=1", "/newsound/damage/hurtflesh2.ogg");
		downloadResource("https://www.dropbox.com/s/1k2eholy7kyu42o/hurtflesh3.ogg?dl=1", "/newsound/damage/hurtflesh3.ogg");
		//END damage
		
		//fire
		downloadResource("https://resources.download.minecraft.net/8b/8b260108a73470c16cd244325242d4780cfb7d78", "/newsound/fire/fire.ogg");
		downloadResource("https://resources.download.minecraft.net/a0/a0d1fbff7e938e92c10c1576339dda668f40e111", "/newsound/fire/ignite.ogg");
		//END fire
		
		//liquid
		downloadResource("https://www.dropbox.com/s/aifsb91hqtlm5bw/lava.ogg?dl=1", "/newsound/liquid/lava.ogg"); //LOCAL
		downloadResource("https://resources.download.minecraft.net/19/19a5aae31c3e0018a960b709a9f0240d8d47dda7", "/newsound/liquid/lavapop.ogg");
		downloadResource("https://www.dropbox.com/s/okputzv91gh93qb/splash.ogg?dl=1", "/newsound/liquid/splash.ogg"); //LOCAL
		downloadResource("https://resources.download.minecraft.net/34/3483650440deb3934255e044ddabff5b01a65356", "/newsound/liquid/water.ogg");
		//END liquid
		
		//mob
		
		//blaze
		downloadResource("https://resources.download.minecraft.net/4e/4e398c518ae706ad4d90afd6914f748faf18a7b5", "/newsound/mob/blaze/breathe1.ogg");
		downloadResource("https://resources.download.minecraft.net/c7/c74368d2b978f570b4e7ce9645fd84b07f8f145c", "/newsound/mob/blaze/breathe2.ogg");
		downloadResource("https://resources.download.minecraft.net/24/24d643885f9b83d8f034f49e2c5e00e70d4f175a", "/newsound/mob/blaze/breathe3.ogg");
		downloadResource("https://resources.download.minecraft.net/78/78d544a240d627005aaef6033fd646eafc66fe7a", "/newsound/mob/blaze/breathe4.ogg");
		downloadResource("https://resources.download.minecraft.net/17/17491c8dd9511e9d848c92b4b7ae047aed164072", "/newsound/mob/blaze/death.ogg");
		downloadResource("https://resources.download.minecraft.net/cb/cb1cf4b405d930ad27f09ea39d6a64f35fc13308", "/newsound/mob/blaze/hit1.ogg");
		downloadResource("https://resources.download.minecraft.net/00/00b38fae5d28d99514a3e73a913af16359b12b7a", "/newsound/mob/blaze/hit2.ogg");
		downloadResource("https://resources.download.minecraft.net/97/97e09d51c82b78ab82fb3a4dbbb8cd701b2d0aeb", "/newsound/mob/blaze/hit3.ogg");
		downloadResource("https://resources.download.minecraft.net/3f/3f447f3e331b59ad014d9bd4a6536f98cf3a08c3", "/newsound/mob/blaze/hit4.ogg");
		//END blaze
		
		//cat
		downloadResource("https://resources.download.minecraft.net/9d/9d2202fce7908dcc5b5c8758c5cd517d863d4dd3", "/newsound/mob/cat/hiss1.ogg");
		downloadResource("https://resources.download.minecraft.net/06/063bf0fce35c547eb59f086dbb56c5fe329cbcf4", "/newsound/mob/cat/hiss2.ogg");
		downloadResource("https://resources.download.minecraft.net/c7/c7e424eb00712614a183adf5d17b949175ff00df", "/newsound/mob/cat/hiss3.ogg");
		downloadResource("https://resources.download.minecraft.net/28/28409652d939d2489d8b5317d51abb873821f0f4", "/newsound/mob/cat/hitt1.ogg");
		downloadResource("https://resources.download.minecraft.net/ce/ce499da6ec5dd226d50843890ca09f16018aff9a", "/newsound/mob/cat/hitt2.ogg");
		downloadResource("https://resources.download.minecraft.net/3d/3d98b4b7c37a09101da00d8a3078e0acba6558f4", "/newsound/mob/cat/hitt3.ogg");
		downloadResource("https://resources.download.minecraft.net/5f/5fdf1bd80b204245af760042d2e546d87666e288", "/newsound/mob/cat/meow1.ogg");
		downloadResource("https://resources.download.minecraft.net/98/9853be18df1a5b2642e33ba05e71bfd5099f9f04", "/newsound/mob/cat/meow2.ogg");
		downloadResource("https://resources.download.minecraft.net/38/381f9e97a8a986ecab3e86431d6be6df5ff79c31", "/newsound/mob/cat/meow3.ogg");
		downloadResource("https://resources.download.minecraft.net/4b/4bf7c7a08c1217de7b1f0faf82429665fbf18458", "/newsound/mob/cat/meow4.ogg");
		downloadResource("https://resources.download.minecraft.net/31/315512d6027033c2a279841badb40a26d74efc81", "/newsound/mob/cat/purr1.ogg");
		downloadResource("https://resources.download.minecraft.net/84/847ec719ee91e28d7bf58ab39a5d8d6bd5728314", "/newsound/mob/cat/purr2.ogg");
		downloadResource("https://resources.download.minecraft.net/ee/eed7a9305f5879448bb94355f25279b4aac403b6", "/newsound/mob/cat/purr3.ogg");
		downloadResource("https://resources.download.minecraft.net/d0/d00791807e913e57d58fd891cb4dd10186cfdf38", "/newsound/mob/cat/purreow1.ogg");
		downloadResource("https://resources.download.minecraft.net/08/08573a1f11058b09c5855122dff47ceb209f771e", "/newsound/mob/cat/purreow2.ogg");
		//END cat
		
		//endermen
		downloadResource("https://resources.download.minecraft.net/d0/d04dd6d1f050353ef9e3ba9c45f407f831903c69", "/newsound/mob/endermen/death.ogg");
		downloadResource("https://resources.download.minecraft.net/75/753a88c1d9b3b46210c18ff07974955463edd18b", "/newsound/mob/endermen/hit1.ogg");
		downloadResource("https://resources.download.minecraft.net/cf/cf60aefd0b742c3fa15e808c1a0c33aebd534cc5", "/newsound/mob/endermen/hit2.ogg");
		downloadResource("https://resources.download.minecraft.net/aa/aaa8f1705c873ebc05da460657c8b83fa01ffd57", "/newsound/mob/endermen/hit3.ogg");
		downloadResource("https://resources.download.minecraft.net/6e/6e0f9074e049a6c30402d70cc75a5da99042e00c", "/newsound/mob/endermen/hit4.ogg");
		downloadResource("https://resources.download.minecraft.net/28/281b87984ddf8e94324bc86911a36c971cb3d831", "/newsound/mob/endermen/idle1.ogg");
		downloadResource("https://resources.download.minecraft.net/9c/9c7aaf49b3096a69a2d6ca62c1067400a2b70814", "/newsound/mob/endermen/idle2.ogg");
		downloadResource("https://resources.download.minecraft.net/bc/bc4c2e76d3b5a0e6f9d5837fe82ed26e808aa918", "/newsound/mob/endermen/idle3.ogg");
		downloadResource("https://resources.download.minecraft.net/40/405e2f82caef7f79eb9e26886520711e446366ce", "/newsound/mob/endermen/idle4.ogg");
		downloadResource("https://resources.download.minecraft.net/e7/e746ec4574aaa047be3076729753c2c75fd34630", "/newsound/mob/endermen/idle5.ogg");
		downloadResource("https://resources.download.minecraft.net/7b/7b4b5323ef066caa1ae43cbe66fffd9dfce4ed32", "/newsound/mob/endermen/portal.ogg");
		downloadResource("https://resources.download.minecraft.net/35/35461b6a4253db40973549e82d91f267c686be85", "/newsound/mob/endermen/portal2.ogg");
		downloadResource("https://resources.download.minecraft.net/c4/c4b5265bbafbe058347058a257abe33a0afb5ab7", "/newsound/mob/endermen/scream1.ogg");
		downloadResource("https://resources.download.minecraft.net/c8/c8cd465468a0fd41a1d5cc24cb499862b5ade2cb", "/newsound/mob/endermen/scream2.ogg");
		downloadResource("https://resources.download.minecraft.net/db/dbab0094299eacbce86ad427edcb34b8342861af", "/newsound/mob/endermen/scream3.ogg");
		downloadResource("https://resources.download.minecraft.net/bc/bcc73584d83225383aaa6affce905392c96afe86", "/newsound/mob/endermen/scream4.ogg");
		downloadResource("https://resources.download.minecraft.net/57/5738d7f49ef30adcfc4f2ab13e0b1d74f09a1289", "/newsound/mob/endermen/stare.ogg");
		//END endermen
		
		//ghast
		downloadResource("https://resources.download.minecraft.net/99/99cd73dda425ee03836c2274a0fcf331139773dc", "/newsound/mob/ghast/affectionate scream.ogg");
		downloadResource("https://resources.download.minecraft.net/6f/6f1d403f47725af0f4c42a74cfec00ff59153160", "/newsound/mob/ghast/charge.ogg");
		downloadResource("https://resources.download.minecraft.net/72/725e5179c72444c6d885e39c27e6b31ed83d58bc", "/newsound/mob/ghast/death.ogg");
		downloadResource("https://resources.download.minecraft.net/ea/eafa60d7ec34f86e8f07a001ddcdf5c4600bb174", "/newsound/mob/ghast/fireball4.ogg");
		downloadResource("https://resources.download.minecraft.net/88/882d092b05faef1cfa6af43d642b9e8843f22756", "/newsound/mob/ghast/moan1.ogg");
		downloadResource("https://resources.download.minecraft.net/02/02073c284f025653e55f9cde25a4a62723d395fa", "/newsound/mob/ghast/moan2.ogg");
		downloadResource("https://resources.download.minecraft.net/dc/dcec2d45fbc25f74a399ec9f8001e0ecd2d5d85e", "/newsound/mob/ghast/moan3.ogg");
		downloadResource("https://resources.download.minecraft.net/93/935f1a575322bd0ec53a919fd061321216889104", "/newsound/mob/ghast/moan4.ogg");
		downloadResource("https://resources.download.minecraft.net/48/48fc6c25d0f1c1f0edd4eaca2b6f934d4117f440", "/newsound/mob/ghast/moan5.ogg");
		downloadResource("https://resources.download.minecraft.net/b3/b3f91f243eceaa25cff7488ec2dac732e22cfec3", "/newsound/mob/ghast/moan6.ogg");
		downloadResource("https://resources.download.minecraft.net/cf/cfb956ba9d26cbdacd16ef77d58764df783b2c7f", "/newsound/mob/ghast/moan7.ogg");
		downloadResource("https://resources.download.minecraft.net/a0/a0e62d86e5899405df4e796fe648e091d828691d", "/newsound/mob/ghast/scream1.ogg");
		downloadResource("https://resources.download.minecraft.net/57/57008a7f564443d563968fd040fc13ab226fc8d1", "/newsound/mob/ghast/scream2.ogg");
		downloadResource("https://resources.download.minecraft.net/8f/8f23820fa28830dd031188c20acb35af044aedb5", "/newsound/mob/ghast/scream3.ogg");
		downloadResource("https://resources.download.minecraft.net/ed/edbc9e9cb9dfeabef93207fc0bdee6ceee5df7bc", "/newsound/mob/ghast/scream4.ogg");
		downloadResource("https://resources.download.minecraft.net/77/77a7b79d4f2ada27640866ece1020b631f5bdc54", "/newsound/mob/ghast/scream5.ogg");
		//END ghast
		
		//iron golem
		downloadResource("https://resources.download.minecraft.net/77/770b3f1feb05b9b941d858eb72b9d04ffc5d52c9", "/newsound/mob/irongolem/death.ogg");
		downloadResource("https://resources.download.minecraft.net/94/942937fcad0fefd61e019678e3710f3f077757d4", "/newsound/mob/irongolem/hit1.ogg");
		downloadResource("https://resources.download.minecraft.net/bb/bb92fd6971430a515f508a6734392511385826e1", "/newsound/mob/irongolem/hit2.ogg");
		downloadResource("https://resources.download.minecraft.net/27/27c78cd09f7fd1770a41d78247ccf57c77dbc773", "/newsound/mob/irongolem/hit3.ogg");
		downloadResource("https://resources.download.minecraft.net/a2/a2dbb90f23b0babe7c569ceca28db49d0c112714", "/newsound/mob/irongolem/hit4.ogg");
		downloadResource("https://resources.download.minecraft.net/60/607d51883e137d5d423dde865232ab1ee78f2694", "/newsound/mob/irongolem/throw.ogg");
		downloadResource("https://resources.download.minecraft.net/4e/4e3e9f37c1e0c12c2993d25c28b89e2f0797ba5a", "/newsound/mob/irongolem/walk1.ogg");
		downloadResource("https://resources.download.minecraft.net/35/356fdb6192cf96aa5d5d9c76413f412f6a4d66a4", "/newsound/mob/irongolem/walk2.ogg");
		downloadResource("https://resources.download.minecraft.net/e0/e0672d288b09996f7c7e1a0ca696de82b7a02d18", "/newsound/mob/irongolem/walk3.ogg");
		downloadResource("https://resources.download.minecraft.net/88/88ae6c906f8f94add2fe904b59c94e844bbcef9a", "/newsound/mob/irongolem/walk4.ogg");
		//END iron golem
		
		//magma cube
		downloadResource("https://resources.download.minecraft.net/43/430c65ac81151d873a27d611a9dff6c562e38c4f", "/newsound/mob/magmacube/big1.ogg");
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
