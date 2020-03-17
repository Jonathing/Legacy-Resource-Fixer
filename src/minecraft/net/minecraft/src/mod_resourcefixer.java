package net.minecraft.src;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.swing.JDialog;

public class mod_resourcefixer extends BaseMod
{
    public static final String NAME = "Legacy Resource Fixer";
    public static final String majorVersion = "1";
    public static final String minorVersion = "3";
    public static final String patchVersion = "0";
    public static final String VERSION_ID = "1.3.0";
    public static final String MODID = "resourcefixer";
    public static final String resourcesDir;
    public static final Logger LOG;
    JDialog popupWindow;
    static ILRFDownloadDisplay downloadMonitor;
    static int progressPerc;
    static int missingCount;
    static int downloadCount;
    private static String dlSource;
    
	public String Version()
	{
		// TODO Auto-generated method stub
		return "1.3.0";
	}

    public mod_resourcefixer()
    {
        LOG.info("[resourcefixer] Legacy Resource Fixer successfully loaded. Written by Jonathing.");
//        LOG.warning("[resourcefixer] If you do not have any resources installed, this will take a while.");
        progressPerc = 0;
        this.showWindow(true);
        downloadMonitor.updateProgress(progressPerc / 746);
        long startTime = System.currentTimeMillis();
        
        LOG.info("[resourcefixer] Checking music files...");
        music();
        newmusic();
        
        LOG.info("[resourcefixer] Checking sound files...");
        newsound();
        sound();
        soundThree();
        
        LOG.info("[resourcefixer] Checking music disk files...");
        streaming();
        
        LOG.info("[resourcefixer] Checking miscellaneous resources...");
        misc();
        
        downloadMonitor.updateProgress(100);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        this.popupWindow.setVisible(false);
        LOG.info("[resourcefixer] Legacy Resource Fixer finished checking resources. Took " + elapsedTime + "ms.");
        
        if (missingCount > 0)
        {
        	if (missingCount != downloadCount)
        	{
        		LOG.info("[resourcefixer] " + missingCount + " resources were missing, and " + downloadCount + " of them were successfully reacquired.");
        	}
        	else
        	{
        		LOG.info("[resourcefixer] All " + missingCount + " missing resources were successfully reacquired.");
        	}
        }
        else
        {
        	LOG.info("[resourcefixer] No missing resources were found.");
        }
        
//        LOG.severe("[resourcefixer] Although all resources have been downloaded or found, the game has trouble loading sounds for the slime mob.");
//        LOG.severe("[resourcefixer] I don't know how to fix this. If you think you do, please go to the CurseForge page and DM me.");
    }

    private void showWindow(boolean showIt)
    {
        if (downloadMonitor == null)
        {
            try
            {
                if (showIt)
                {
                    downloadMonitor = new LRFProgress();
                    this.popupWindow = (JDialog)downloadMonitor.makeDialog();
                } else
                {
                    downloadMonitor = new LRFDummyProgress();
                }
            } catch (Throwable e)
            {
                if (downloadMonitor == null)
                {
                    downloadMonitor = new LRFDummyProgress();
                    LOG.severe("[resourcefixer] Unable to show progress window.");
                    e.printStackTrace();
                } else
                {
                    downloadMonitor.makeHeadless();
                }

                this.popupWindow = null;
            }

        }
    }

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
        downloadResource("https://resources.download.minecraft.net/d6/d68bae1949299ccd8297aaa423dd12e041e83773", "/newsound/ambient/weather/rain1.ogg");
        downloadResource("https://resources.download.minecraft.net/ba/ba58e1b6c8cc814a210db268d3e59a06b7ac62be", "/newsound/ambient/weather/rain2.ogg");
        downloadResource("https://resources.download.minecraft.net/4c/4cdd8fc380e85409fd94b93abdcad077d75ec58f", "/newsound/ambient/weather/rain3.ogg");
        downloadResource("https://resources.download.minecraft.net/08/08e555782cb2785b24e08a417a5e58aa08bd0695", "/newsound/ambient/weather/rain4.ogg");
        downloadResource("https://resources.download.minecraft.net/67/671ef0ae7b59014a2f637d7af6d781324ab6309f", "/newsound/ambient/weather/thunder1.ogg");
        downloadResource("https://resources.download.minecraft.net/a2/a20cbf2ddce541eaed520d7ec55665fe97428be6", "/newsound/ambient/weather/thunder2.ogg");
        downloadResource("https://resources.download.minecraft.net/9e/9ead5c928f9122e3c2f5fc4f6ce7fb4054a2b578", "/newsound/ambient/weather/thunder3.ogg");
        downloadResource("https://resources.download.minecraft.net/f7/f76d4efd860b599200e96401b2485cc83c1ec21e", "/newsound/damage/fallbig1.ogg");
        downloadResource("https://resources.download.minecraft.net/c7/c7c9e86e3ccc55ea2312a498aef861def771d8cf", "/newsound/damage/fallbig2.ogg");
        downloadResource("https://resources.download.minecraft.net/60/6094b6620f2d1f2d19869a2e6498a52b1a265738", "/newsound/damage/fallsmall.ogg");
        downloadResource("https://resources.download.minecraft.net/e4/e40695b47209c3b4bbdc3496b38959d097c6afbc", "/newsound/damage/hurtflesh1.ogg");
        downloadResource("https://resources.download.minecraft.net/4e/4e1651a728b394e054aaa24e3070e7dae849f14d", "/newsound/damage/hurtflesh2.ogg");
        downloadResource("https://resources.download.minecraft.net/4b/4b49dd9329b254e38f17166b7daa51a758a25f94", "/newsound/damage/hurtflesh3.ogg");
        downloadResource("https://resources.download.minecraft.net/8b/8b260108a73470c16cd244325242d4780cfb7d78", "/newsound/fire/fire.ogg");
        downloadResource("https://resources.download.minecraft.net/19/19c729c3ceb753a824246b494bce5fa5c802f0f0", "/newsound/fire/ignite.ogg");
        downloadResource("https://resources.download.minecraft.net/17/17e66efe64256142c55ef6f35060f277f127bb44", "/newsound/liquid/lava.ogg");
        downloadResource("https://resources.download.minecraft.net/19/19a5aae31c3e0018a960b709a9f0240d8d47dda7", "/newsound/liquid/lavapop.ogg");
        downloadResource("https://resources.download.minecraft.net/22/22a491f266f5c3cdd6e669a9493daaf40c9c8575", "/newsound/liquid/splash.ogg");
        downloadResource("https://resources.download.minecraft.net/34/3483650440deb3934255e044ddabff5b01a65356", "/newsound/liquid/water.ogg");
        downloadResource("https://resources.download.minecraft.net/4e/4e398c518ae706ad4d90afd6914f748faf18a7b5", "/newsound/mob/blaze/breathe1.ogg");
        downloadResource("https://resources.download.minecraft.net/c7/c74368d2b978f570b4e7ce9645fd84b07f8f145c", "/newsound/mob/blaze/breathe2.ogg");
        downloadResource("https://resources.download.minecraft.net/24/24d643885f9b83d8f034f49e2c5e00e70d4f175a", "/newsound/mob/blaze/breathe3.ogg");
        downloadResource("https://resources.download.minecraft.net/78/78d544a240d627005aaef6033fd646eafc66fe7a", "/newsound/mob/blaze/breathe4.ogg");
        downloadResource("https://resources.download.minecraft.net/17/17491c8dd9511e9d848c92b4b7ae047aed164072", "/newsound/mob/blaze/death.ogg");
        downloadResource("https://resources.download.minecraft.net/cb/cb1cf4b405d930ad27f09ea39d6a64f35fc13308", "/newsound/mob/blaze/hit1.ogg");
        downloadResource("https://resources.download.minecraft.net/00/00b38fae5d28d99514a3e73a913af16359b12b7a", "/newsound/mob/blaze/hit2.ogg");
        downloadResource("https://resources.download.minecraft.net/97/97e09d51c82b78ab82fb3a4dbbb8cd701b2d0aeb", "/newsound/mob/blaze/hit3.ogg");
        downloadResource("https://resources.download.minecraft.net/3f/3f447f3e331b59ad014d9bd4a6536f98cf3a08c3", "/newsound/mob/blaze/hit4.ogg");
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
        downloadResource("https://resources.download.minecraft.net/43/430c65ac81151d873a27d611a9dff6c562e38c4f", "/newsound/mob/magmacube/big1.ogg");
        downloadResource("https://resources.download.minecraft.net/4c/4c4bcc6905430286f32a862ce69665c51bd9938f", "/newsound/mob/magmacube/big2.ogg");
        downloadResource("https://resources.download.minecraft.net/d5/d5c4316d30feef5213077e3ee24a7f52c5bf6735", "/newsound/mob/magmacube/big3.ogg");
        downloadResource("https://resources.download.minecraft.net/a6/a63fd7965328425a0a8111640de19428d841933e", "/newsound/mob/magmacube/big4.ogg");
        downloadResource("https://resources.download.minecraft.net/86/86a2a7206c769aaa9435aabba70be201cb3e3a6b", "/newsound/mob/magmacube/jump1.ogg");
        downloadResource("https://resources.download.minecraft.net/32/3285a993220dcea1fc37e98b9aa9219422c2c095", "/newsound/mob/magmacube/jump2.ogg");
        downloadResource("https://resources.download.minecraft.net/5a/5a2449cc3d4a6ad36598847e501f956e5a3528bd", "/newsound/mob/magmacube/jump3.ogg");
        downloadResource("https://resources.download.minecraft.net/50/500e2543034b4c026fb175d48c47196c5d013fe8", "/newsound/mob/magmacube/jump4.ogg");
        downloadResource("https://resources.download.minecraft.net/5c/5c633c345fe4cb87c36ada2fe2b5da1b80601cf3", "/newsound/mob/magmacube/small1.ogg");
        downloadResource("https://resources.download.minecraft.net/18/18237686efcaa1bf9084173c99d11ce0d37d4fc5", "/newsound/mob/magmacube/small2.ogg");
        downloadResource("https://resources.download.minecraft.net/65/65a1a69845133187d6b8689e6ce9707da10f21a6", "/newsound/mob/magmacube/small3.ogg");
        downloadResource("https://resources.download.minecraft.net/a4/a485082ed0820eeeb9df13f84f26b14744ceeb2a", "/newsound/mob/magmacube/small4.ogg");
        downloadResource("https://resources.download.minecraft.net/56/560dd97e6da8badbc8ac00b28c45312e60a525f2", "/newsound/mob/magmacube/small5.ogg");
        downloadResource("https://resources.download.minecraft.net/84/84c3b008dc1d5e0dd5e8ad85a06eca29f0591e48", "/newsound/mob/silverfish/hit1.ogg");
        downloadResource("https://resources.download.minecraft.net/38/38d4d36bbe40a48c3a8ef97735b59b37f013fd6e", "/newsound/mob/silverfish/hit2.ogg");
        downloadResource("https://resources.download.minecraft.net/5b/5b1675279bbc245fc6bbb705de8ea09fb3f32b53", "/newsound/mob/silverfish/hit3.ogg");
        downloadResource("https://resources.download.minecraft.net/24/24cdac5a80fdad7ab31dc0695b57ece55aecb21a", "/newsound/mob/silverfish/kill.ogg");
        downloadResource("https://resources.download.minecraft.net/51/515dffc5d6dd216550d69e61b2eb9c3593b19a20", "/newsound/mob/silverfish/say1.ogg");
        downloadResource("https://resources.download.minecraft.net/39/396b8b46e593cf55d843853b704dc054ef614e55", "/newsound/mob/silverfish/say2.ogg");
        downloadResource("https://resources.download.minecraft.net/e7/e7f0f24c2c9f4bf83286b17109580d3e845d19e3", "/newsound/mob/silverfish/say3.ogg");
        downloadResource("https://resources.download.minecraft.net/4f/4fce41a2d0890418ae1efb03d1142ca74d00aa61", "/newsound/mob/silverfish/say4.ogg");
        downloadResource("https://resources.download.minecraft.net/76/763cc79934a572b84c371cb49afad5912f29d2f1", "/newsound/mob/silverfish/step1.ogg");
        downloadResource("https://resources.download.minecraft.net/f1/f1665747da14569c4de55e07884deeef18a40f62", "/newsound/mob/silverfish/step2.ogg");
        downloadResource("https://resources.download.minecraft.net/47/47ad81223bcec870206484cd4d1a6202871df331", "/newsound/mob/silverfish/step3.ogg");
        downloadResource("https://resources.download.minecraft.net/a3/a342f566600caf73464323b20b7770b5b9b7893a", "/newsound/mob/silverfish/step4.ogg");
        downloadResource("https://resources.download.minecraft.net/24/2452c64a55eaef86bf1b668bb4d5f3b641cd8f25", "/newsound/mob/wolf/bark1.ogg");
        downloadResource("https://resources.download.minecraft.net/9f/9f1708a6409d04370ec12d0add015b11abbd5371", "/newsound/mob/wolf/bark2.ogg");
        downloadResource("https://resources.download.minecraft.net/1d/1ddae4e8dfa605e27ec8278b3e312597b674437e", "/newsound/mob/wolf/bark3.ogg");
        downloadResource("https://resources.download.minecraft.net/77/77a5d445ed9ee588846947ac3df63f84be6d569d", "/newsound/mob/wolf/death.ogg");
        downloadResource("https://resources.download.minecraft.net/0b/0b29f5ce8c4c10fa4184e5d29244f3bc121468a0", "/newsound/mob/wolf/growl1.ogg");
        downloadResource("https://resources.download.minecraft.net/f5/f57577fe6915175f9e4576e8d73ad4077a381433", "/newsound/mob/wolf/growl2.ogg");
        downloadResource("https://resources.download.minecraft.net/69/69ef2fe8d6a744689953fd692d0106b0b2d2a9ce", "/newsound/mob/wolf/growl3.ogg");
        downloadResource("https://resources.download.minecraft.net/84/84556bac99c01ad006552cf5d96494817e9b1700", "/newsound/mob/wolf/howl1.ogg");
        downloadResource("https://resources.download.minecraft.net/cd/cdb0293c5e2bdbda21798af4e61a4c171c8b1ec0", "/newsound/mob/wolf/howl2.ogg");
        downloadResource("https://resources.download.minecraft.net/71/71b5fc7aa050892f8c9a9ed2713cc1ad8874742a", "/newsound/mob/wolf/hurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/bc/bc2f6a5a1b6646eac1681b7414b098089aedf3c6", "/newsound/mob/wolf/hurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/a5/a5b3f3cdda4d6e13629ccd0e2a38e1f06baa491a", "/newsound/mob/wolf/hurt3.ogg");
        downloadResource("https://resources.download.minecraft.net/c2/c2e4001d9ae8fc1f066a914170faad4c45a84e1e", "/newsound/mob/wolf/panting.ogg");
        downloadResource("https://resources.download.minecraft.net/3d/3d95ea49e91b4295859b193bb41b009b92250a44", "/newsound/mob/wolf/shake.ogg");
        downloadResource("https://resources.download.minecraft.net/fc/fcf4f90c452b7b511d50e3959ae05036d13a7cf8", "/newsound/mob/wolf/whine.ogg");
        downloadResource("https://resources.download.minecraft.net/d5/d5b2d34e0c07a6c09c1adb17a15e50a626a88bc1", "/newsound/mob/zombie/metal1.ogg");
        downloadResource("https://resources.download.minecraft.net/6c/6c5a03460012d7b76c16d0dbaa01c443a6ba094e", "/newsound/mob/zombie/metal2.ogg");
        downloadResource("https://resources.download.minecraft.net/32/322374d89ed809e75005cdc4f6479c959e15aee2", "/newsound/mob/zombie/metal3.ogg");
        downloadResource("https://resources.download.minecraft.net/fa/fa73977dd28020544f7fe2553e5604a6865ec1a6", "/newsound/mob/zombie/wood1.ogg");
        downloadResource("https://resources.download.minecraft.net/dc/dc86fbd59cf0e87cd35b22df2a2df899ab8c1f7f", "/newsound/mob/zombie/wood2.ogg");
        downloadResource("https://resources.download.minecraft.net/81/8184e851170619de93aa56244fb12c472a2ddd7d", "/newsound/mob/zombie/wood3.ogg");
        downloadResource("https://resources.download.minecraft.net/10/1028d0a373790e14c34786a925c4656bdaeb4c4d", "/newsound/mob/zombie/wood4.ogg");
        downloadResource("https://resources.download.minecraft.net/4e/4e94ed53b6059d150c3bb2322b4af9ca9514bae1", "/newsound/mob/zombie/woodbreak.ogg");
        downloadResource("https://resources.download.minecraft.net/ec/ec4b0396dd2fc2da8fab91ddc35218d3426349b3", "/newsound/mob/zombiepig/zpig1.ogg");
        downloadResource("https://resources.download.minecraft.net/2c/2cbbcdfb97939c469cd4ccaaac74504497c56695", "/newsound/mob/zombiepig/zpig2.ogg");
        downloadResource("https://resources.download.minecraft.net/c9/c9f7fa36ae48eca0a1f6ce024fde5d3472d30b4d", "/newsound/mob/zombiepig/zpig3.ogg");
        downloadResource("https://resources.download.minecraft.net/e1/e1187646b6256b92a1384f26ef2a7e56efcbe00d", "/newsound/mob/zombiepig/zpig4.ogg");
        downloadResource("https://resources.download.minecraft.net/ca/cadbc5c34979baab1a93f5cf68a50f9bd44ef5a8", "/newsound/mob/zombiepig/zpigangry1.ogg");
        downloadResource("https://resources.download.minecraft.net/03/0349ce87fe856ddf8fdd94a559bb29061b002b6c", "/newsound/mob/zombiepig/zpigangry2.ogg");
        downloadResource("https://resources.download.minecraft.net/e0/e0c88ca054666aae58b89abdcf377eae525aa13e", "/newsound/mob/zombiepig/zpigangry3.ogg");
        downloadResource("https://resources.download.minecraft.net/c7/c76dea473821e2ae9a1f006a4eddfdd0703eecdf", "/newsound/mob/zombiepig/zpigangry4.ogg");
        downloadResource("https://resources.download.minecraft.net/40/40b8e244d03ae17483edd4571bd851e10a97050f", "/newsound/mob/zombiepig/zpigdeath.ogg");
        downloadResource("https://resources.download.minecraft.net/a2/a2cfbea288280419ec0c8fb75d8ee5395536ac02", "/newsound/mob/zombiepig/zpighurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/d1/d1917b9be91d60a40dd0bf804580c1f494e9ae6d", "/newsound/mob/zombiepig/zpighurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/74/74e5422bd83bb2041a6f0d09644bc095c0e9e21a", "/newsound/mob/chicken1.ogg");
        downloadResource("https://resources.download.minecraft.net/36/3660e743db2bbbcff0866d3f1e606882f1aeb6ac", "/newsound/mob/chicken2.ogg");
        downloadResource("https://resources.download.minecraft.net/49/49874e07369c3bb0bc8a2fba4f2096d2e9a36c9a", "/newsound/mob/chicken3.ogg");
        downloadResource("https://resources.download.minecraft.net/31/31b52151bf2a6fa35d2d2aa72f832285d9e7d70d", "/newsound/mob/chickenhurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/18/18752157f5d8718e2752805a657c74a73d2b88db", "/newsound/mob/chickenhurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/ab/ab5a32b70ef1e7aafc550b20afdb7dc8c0d5d901", "/newsound/mob/chickenplop.ogg");
        downloadResource("https://resources.download.minecraft.net/12/1298f4526580c8f10812253e7d9130ce4afc3a1e", "/newsound/mob/cow1.ogg");
        downloadResource("https://resources.download.minecraft.net/00/00b1a23c84bc7f7377de973040b2dd336670bb8f", "/newsound/mob/cow2.ogg");
        downloadResource("https://resources.download.minecraft.net/f7/f75617763129506ae7220ed16cdff7a8084eebb3", "/newsound/mob/cow3.ogg");
        downloadResource("https://resources.download.minecraft.net/e0/e0bba792682878ee208a54184df9e2e8044f2815", "/newsound/mob/cow4.ogg");
        downloadResource("https://resources.download.minecraft.net/2c/2c849f4b6ec1cf084ac84d57ec90779266b23ae8", "/newsound/mob/cowhurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/be/be0be76687eab152334a35fdb76e6ab4455bfaef", "/newsound/mob/cowhurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/87/87eceaa08df660cd1d4dadf7d1c64a6f7125dacb", "/newsound/mob/cowhurt3.ogg");
        downloadResource("https://resources.download.minecraft.net/74/74771428c2aa2acbd30638c6706867053bad64d3", "/newsound/mob/creeper1.ogg");
        downloadResource("https://resources.download.minecraft.net/c4/c46c7d2a84749bfcbcf576aea0d66fd3deccba31", "/newsound/mob/creeper2.ogg");
        downloadResource("https://resources.download.minecraft.net/09/0979bf115d081d70a985f1cfcab1b9274d6be74e", "/newsound/mob/creeper3.ogg");
        downloadResource("https://resources.download.minecraft.net/85/85c860ea8c55984bf6cabb75354c78f3a603f98d", "/newsound/mob/creeper4.ogg");
        downloadResource("https://resources.download.minecraft.net/fb/fbc1b2c89c5c781e30d702b2885be3f485105869", "/newsound/mob/creeperdeath.ogg");
        downloadResource("https://resources.download.minecraft.net/a9/a99bf88163bcb576e31e6e2275145afba6d1b4c7", "/newsound/mob/pig1.ogg");
        downloadResource("https://resources.download.minecraft.net/ab/ab615a912fb8ea06648836e0ec1cbeeefe117da6", "/newsound/mob/pig2.ogg");
        downloadResource("https://resources.download.minecraft.net/58/58efedf302e0203a6ff9e59a6535d300286c5594", "/newsound/mob/pig3.ogg");
        downloadResource("https://resources.download.minecraft.net/4b/4bc87ab869e17732a20c7518a327136baf5b2c26", "/newsound/mob/pigdeath.ogg");
        downloadResource("https://resources.download.minecraft.net/a3/a3ffeaa0a75b8d2bdc949c181a6f8db78f8976ca", "/newsound/mob/sheep1.ogg");
        downloadResource("https://resources.download.minecraft.net/1c/1cfd864cbda555477ed9523e640de0d234c18858", "/newsound/mob/sheep2.ogg");
        downloadResource("https://resources.download.minecraft.net/c9/c9ac72409cbe6093e84d72a2a5c719d9e4a0e6b2", "/newsound/mob/sheep3.ogg");
        downloadResource("https://resources.download.minecraft.net/19/199c9f150822950385b9bc1d840605a6a795bd27", "/newsound/mob/skeleton1.ogg");
        downloadResource("https://resources.download.minecraft.net/52/529abcb09220f0ebeb595f32bb663d026a7e0ae5", "/newsound/mob/skeleton2.ogg");
        downloadResource("https://resources.download.minecraft.net/a1/a11ac56ec61c17e99f4ee33d8712404edf442720", "/newsound/mob/skeleton3.ogg");
        downloadResource("https://resources.download.minecraft.net/a7/a795e9a7721927282befc085e4e397a6379e3004", "/newsound/mob/skeletondeath.ogg");
        downloadResource("https://resources.download.minecraft.net/f7/f7e8ae3a771d50ed827772b75c50958393b621e1", "/newsound/mob/skeletonhurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/a1/a12f98ac001492ff596b5da9e6297b3be98f9149", "/newsound/mob/skeletonhurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/64/647c46f5704b3be0b7159961e1bc51721a33dfd5", "/newsound/mob/skeletonhurt3.ogg");
        downloadResource("https://resources.download.minecraft.net/0f/0f3a7e5a20119853986d2cfae22ca3a46926ac76", "/newsound/mob/skeletonhurt4.ogg");
        downloadResource("https://resources.download.minecraft.net/d4/d49ab3ceb3f6212d64580f0d906fa9880a674c6d", "/newsound/mob/slime1.ogg");
		downloadResource("https://resources.download.minecraft.net/52/525700bc06b6f0f8afc3fb542977cef617196ccf", "/newsound/mob/slime2.ogg");
		downloadResource("https://resources.download.minecraft.net/08/087e5fa84e7c961778397a0d938bde1e49dd3beb", "/newsound/mob/slime3.ogg");
		downloadResource("https://resources.download.minecraft.net/ca/ca1b7de8bb9ce92f2f044c6a98c99d7bf92b7184", "/newsound/mob/slime4.ogg");
		downloadResource("https://resources.download.minecraft.net/24/24bae598320bf757fd6937a93f135f5cdba206ba", "/newsound/mob/slime5.ogg");
        downloadResource("https://resources.download.minecraft.net/07/075e1ea92d5564d7bdf267ae975044315a41a686", "/newsound/mob/slimeattack1.ogg");
        downloadResource("https://resources.download.minecraft.net/f6/f6e2067571631aae206000a501c9adebe862e32a", "/newsound/mob/slimeattack2.ogg");
        downloadResource("https://resources.download.minecraft.net/65/65b49739d48ebc47879ca5528c8283329980b304", "/newsound/mob/spider1.ogg");
        downloadResource("https://resources.download.minecraft.net/50/501b40b97ee55cb7a97943ee620aa05131089fc2", "/newsound/mob/spider2.ogg");
        downloadResource("https://resources.download.minecraft.net/f9/f9f79162efa6667b753c1fbb46ff9888e8ce5f32", "/newsound/mob/spider3.ogg");
        downloadResource("https://resources.download.minecraft.net/3c/3cf3e8d3aab0a3092f6c6bf681ff156bc9653859", "/newsound/mob/spider4.ogg");
        downloadResource("https://resources.download.minecraft.net/4c/4c69a6edc25d973999aa0db2bb46b583a31da278", "/newsound/mob/spiderdeath.ogg");
        downloadResource("https://resources.download.minecraft.net/b5/b5bc9775243437d87317ab3a66ec8a4d5b96c83d", "/newsound/mob/zombie1.ogg");
        downloadResource("https://resources.download.minecraft.net/bf/bf5086623d5c6735271074b263116fb914ed79b5", "/newsound/mob/zombie2.ogg");
        downloadResource("https://resources.download.minecraft.net/7e/7eb3affa45f47f919e74523a55185e65c2081d12", "/newsound/mob/zombie3.ogg");
        downloadResource("https://resources.download.minecraft.net/6e/6e0488ab07b9539fbaebc093f194bb6a95b2caec", "/newsound/mob/zombiedeath.ogg");
        downloadResource("https://resources.download.minecraft.net/f3/f35e14af35d1d12244dac9e655f4e31d4ef84e1b", "/newsound/mob/zombiehurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/bc/bc85d96a99e84a234cbe23841f87e84e71198be3", "/newsound/mob/zombiehurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/e2/e28d844995368de1d45c724a5d371c9952ae5ed4", "/newsound/note/bass.ogg");
        downloadResource("https://resources.download.minecraft.net/03/037b9fb7f74381f354739d015193dc4a6897f620", "/newsound/note/bassattack.ogg");
        downloadResource("https://resources.download.minecraft.net/1a/1afefaa39a53606d2737bab9cb3409350cb2dc9f", "/newsound/note/bd.ogg");
        downloadResource("https://resources.download.minecraft.net/46/46244605b8663a29cdce7bccc5b2d038241e32ee", "/newsound/note/harp.ogg");
        downloadResource("https://resources.download.minecraft.net/fd/fd2b6f745b05a2cf44a4e010f72631de2e5099f6", "/newsound/note/hat.ogg");
        downloadResource("https://resources.download.minecraft.net/20/20d06589bd5ab81a73989bdac8ca59ecd4d66932", "/newsound/note/pling.ogg");
        downloadResource("https://resources.download.minecraft.net/69/6967f0af60f480e81d32f1f8e5f88ccafec3a40c", "/newsound/note/snare.ogg");
        downloadResource("https://resources.download.minecraft.net/9a/9a20be18fed05330f745a54eb8aeba11aac5403b", "/newsound/portal/portal.ogg");
        downloadResource("https://resources.download.minecraft.net/43/43388701fac432a567fe9fec421521e6348ad780", "/newsound/portal/travel.ogg");
        downloadResource("https://resources.download.minecraft.net/30/301f32642b654addbd06a430768fead464fd24c4", "/newsound/portal/trigger.ogg");
        downloadResource("https://resources.download.minecraft.net/87/87edc11141fb5a045f2ed830b545aaa73f96ee99", "/newsound/random/bow.ogg");
        downloadResource("https://resources.download.minecraft.net/78/78f034d58779fb4d22b00ea249015a0dbf4e7b3f", "/newsound/random/bowhit1.ogg");
        downloadResource("https://resources.download.minecraft.net/c3/c3cd0db760c980287b26ef9c0894f66c4250724e", "/newsound/random/bowhit2.ogg");
        downloadResource("https://resources.download.minecraft.net/03/0369a1236a4b9ca219fd3ad7d19d0b5237510b1e", "/newsound/random/bowhit3.ogg");
        downloadResource("https://resources.download.minecraft.net/9e/9e5e2369fc354a082c861494cfe8767d327813d4", "/newsound/random/bowhit4.ogg");
        downloadResource("https://resources.download.minecraft.net/8b/8bf3ecb0fe9a6a615f5995e3dd21b6c39adc21d5", "/newsound/random/break.ogg");
        downloadResource("https://resources.download.minecraft.net/dd/dd2f7209c2a58b0886beb34d49b0512b49adbb7e", "/newsound/random/breath.ogg");
        downloadResource("https://resources.download.minecraft.net/bd/bdc648e04933df8ddcccc84b375d6556776d4331", "/newsound/random/burp.ogg");
        downloadResource("https://resources.download.minecraft.net/05/056393a33a9633685c3dc3be2887f5cbd7dbc63f", "/newsound/random/chestclosed.ogg");
        downloadResource("https://resources.download.minecraft.net/18/186d5d9481d59cc99bc4be1b5fbb98d0ef877b8e", "/newsound/random/chestopen.ogg");
        downloadResource("https://resources.download.minecraft.net/2f/2fe092579d9637e2d160319820ee08e60a237bb7", "/newsound/random/click.ogg");
        downloadResource("https://resources.download.minecraft.net/9e/9ea8a9e105321891bda18b9007b383b40aa7c076", "/newsound/random/door_close.ogg");
        downloadResource("https://resources.download.minecraft.net/5b/5bb5a04e776d69ca12b1d7bc369975f9bf62e741", "/newsound/random/door_open.ogg");
        downloadResource("https://resources.download.minecraft.net/85/857b75738992d25e338dee640ab191323bcbf798", "/newsound/random/drink.ogg");
        downloadResource("https://resources.download.minecraft.net/40/40a5a4307c1a2a5a1b9f71254275689845374104", "/newsound/random/drr.ogg");
        downloadResource("https://resources.download.minecraft.net/df/dfee39084c771182f6b9e7cfb8c8bc4e255747bc", "/newsound/random/eat1.ogg");
        downloadResource("https://resources.download.minecraft.net/d2/d26bde554d88f0ca156baf471c44ce2c0e68176c", "/newsound/random/eat2.ogg");
        downloadResource("https://resources.download.minecraft.net/9f/9f2c4bab5ed55f1714fffa223985c81babc8f6c0", "/newsound/random/eat3.ogg");
        downloadResource("https://resources.download.minecraft.net/cd/cd46e41023887558b134547e28327de6e7df189a", "/newsound/random/explode1.ogg");
        downloadResource("https://resources.download.minecraft.net/a1/a116e396d95a0ee245000dd4cdcc333d38ea9e3b", "/newsound/random/explode2.ogg");
        downloadResource("https://resources.download.minecraft.net/a9/a94a69e56568f5789cab05382cfd81f601189fd1", "/newsound/random/explode3.ogg");
        downloadResource("https://resources.download.minecraft.net/f2/f259be40364341edcaf88e339bc24ab01e49845a", "/newsound/random/explode4.ogg");
        downloadResource("https://resources.download.minecraft.net/c6/c649e60ea9a99c97501a50d2dc4e579343e91ea8", "/newsound/random/fizz.ogg");
        downloadResource("https://resources.download.minecraft.net/a9/a92ba2b8f6abc41aa8d679ad808a81d0aafa04b2", "/newsound/random/fuse.ogg");
        downloadResource("https://resources.download.minecraft.net/72/7274a2231ed4544a37e599b7b014e589e5377094", "/newsound/random/glass1.ogg");
        downloadResource("https://resources.download.minecraft.net/87/87c47bda3645c68f18a49e83cbf06e5302d087ff", "/newsound/random/glass2.ogg");
        downloadResource("https://resources.download.minecraft.net/ad/ad7d770b7fff3b64121f75bd60cecfc4866d1cd6", "/newsound/random/glass3.ogg");
        downloadResource("https://resources.download.minecraft.net/9d/9d485556b89bf776042080774679c37300bc744b", "/newsound/random/hurt.ogg");
        downloadResource("https://resources.download.minecraft.net/9d/9d52e43288d7f9e4d14199368a0f30ae3570d05a", "/newsound/random/levelup.ogg");
        downloadResource("https://resources.download.minecraft.net/9e/9e22b5aeec31de99410b682cc161a6096a1cd00a", "/newsound/random/old_explode.ogg");
        downloadResource("https://resources.download.minecraft.net/e9/e9833a1512b57bcf88ac4fdcc8df4e5a7e9d701d", "/newsound/random/orb.ogg");
        downloadResource("https://resources.download.minecraft.net/8f/8f45b5faf6dfae2065846d26612f7552b73640dd", "/newsound/random/pop.ogg");
        downloadResource("https://resources.download.minecraft.net/22/22a491f266f5c3cdd6e669a9493daaf40c9c8575", "/newsound/random/splash.ogg");
        downloadResource("https://resources.download.minecraft.net/b2/b210a3c371441b77fe873133b2cb7b63e367b2f3", "/newsound/random/wood click.ogg");
        downloadResource("https://resources.download.minecraft.net/5f/5fd568d724ba7d53911b6cccf5636f859d2662e8", "/newsound/step/cloth1.ogg");
        downloadResource("https://resources.download.minecraft.net/56/56c1d0ac0de2265018b2c41cb571cc6631101484", "/newsound/step/cloth2.ogg");
        downloadResource("https://resources.download.minecraft.net/9c/9c63f2a3681832dc32d206f6830360bfe94b5bfc", "/newsound/step/cloth3.ogg");
        downloadResource("https://resources.download.minecraft.net/55/55da1856e77cfd31a7e8c3d358e1f856c5583198", "/newsound/step/cloth4.ogg");
        downloadResource("https://resources.download.minecraft.net/41/41cbf5dd08e951ad65883854e74d2e034929f572", "/newsound/step/grass1.ogg");
        downloadResource("https://resources.download.minecraft.net/86/86cb1bb0c45625b18e00a64098cd425a38f6d3f2", "/newsound/step/grass2.ogg");
        downloadResource("https://resources.download.minecraft.net/f7/f7d7e5c7089c9b45fa5d1b31542eb455fad995db", "/newsound/step/grass3.ogg");
        downloadResource("https://resources.download.minecraft.net/c7/c7b1005d4926f6a2e2387a41ab1fb48a72f18e98", "/newsound/step/grass4.ogg");
        downloadResource("https://resources.download.minecraft.net/e8/e8b89f316f3e9989a87f6e6ff12db9abe0f8b09f", "/newsound/step/gravel1.ogg");
        downloadResource("https://resources.download.minecraft.net/c3/c3b3797d04cb9640e1d3a72d5e96edb410388fa3", "/newsound/step/gravel2.ogg");
        downloadResource("https://resources.download.minecraft.net/48/48f7e1bb098abd36b9760cca27b9d4391a23de26", "/newsound/step/gravel3.ogg");
        downloadResource("https://resources.download.minecraft.net/7b/7bf3553a4fe41a0078f4988a13d6e1ed8663ef4c", "/newsound/step/gravel4.ogg");
        downloadResource("https://resources.download.minecraft.net/9e/9e59c3650c6c3fc0a475f1b753b2fcfef430bf81", "/newsound/step/sand1.ogg");
        downloadResource("https://resources.download.minecraft.net/0f/0fa4234797f336ada4e3735e013e44d1099afe57", "/newsound/step/sand2.ogg");
        downloadResource("https://resources.download.minecraft.net/c7/c75589cc0087069f387de127dd1499580498738e", "/newsound/step/sand3.ogg");
        downloadResource("https://resources.download.minecraft.net/37/37afa06f97d58767a1cd1382386db878be1532dd", "/newsound/step/sand4.ogg");
        downloadResource("https://resources.download.minecraft.net/e9/e9bab7d3d15541f0aaa93fad31ad37fd07e03a6c", "/newsound/step/snow1.ogg");
        downloadResource("https://resources.download.minecraft.net/58/5887d10234c4f244ec5468080412f3e6ef9522f3", "/newsound/step/snow2.ogg");
        downloadResource("https://resources.download.minecraft.net/a4/a4bc069321a96236fde04a3820664cc23b2ea619", "/newsound/step/snow3.ogg");
        downloadResource("https://resources.download.minecraft.net/e2/e26fa3036cdab4c2264ceb19e1cd197a2a510227", "/newsound/step/snow4.ogg");
        downloadResource("https://resources.download.minecraft.net/4e/4e094ed8dfa98656d8fec52a7d20c5ee6098b6ad", "/newsound/step/stone1.ogg");
        downloadResource("https://resources.download.minecraft.net/9c/9c92f697142ae320584bf64c0d54381d59703528", "/newsound/step/stone2.ogg");
        downloadResource("https://resources.download.minecraft.net/8f/8f23c02475d388b23e5faa680eafe6b991d7a9d4", "/newsound/step/stone3.ogg");
        downloadResource("https://resources.download.minecraft.net/36/363545a76277e5e47538b2dd3a0d6aa4f7a87d34", "/newsound/step/stone4.ogg");
        downloadResource("https://resources.download.minecraft.net/9b/9bc2a84d0aa98113fc52609976fae8fc88ea6333", "/newsound/step/wood1.ogg");
        downloadResource("https://resources.download.minecraft.net/98/98102533e6085617a2962157b4f3658f59aea018", "/newsound/step/wood2.ogg");
        downloadResource("https://resources.download.minecraft.net/45/45b2aef7b5049e81b39b58f8d631563fadcc778b", "/newsound/step/wood3.ogg");
        downloadResource("https://resources.download.minecraft.net/dc/dc66978374a46ab2b87db6472804185824868095", "/newsound/step/wood4.ogg");
        downloadResource("https://resources.download.minecraft.net/59/594be3eaea9a2b92095eeeb3b1e01e755dcb8ce2", "/newsound/tile/piston/in.ogg");
        downloadResource("https://resources.download.minecraft.net/cb/cb017131516de9359cb81fb991f5b3694044f8db", "/newsound/tile/piston/out.ogg");
    }

    public static void misc()
    {
    	downloadResource("https://resources.download.minecraft.net/c2/c253af2f3e7178fa16a3278cc604c6bee1926add", "/pack.mcmeta");
        downloadResource("https://resources.download.minecraft.net/99/99dc14908ec25fd5628fd98ad214acb59fedfb0f", "/pe/humble.png");
    }

    public static void sound()
    {
        downloadResource("https://resources.download.minecraft.net/41/41cbf5dd08e951ad65883854e74d2e034929f572", "/sound/step/grass1.ogg");
        downloadResource("https://resources.download.minecraft.net/86/86cb1bb0c45625b18e00a64098cd425a38f6d3f2", "/sound/step/grass2.ogg");
        downloadResource("https://resources.download.minecraft.net/f7/f7d7e5c7089c9b45fa5d1b31542eb455fad995db", "/sound/step/grass3.ogg");
        downloadResource("https://resources.download.minecraft.net/c7/c7b1005d4926f6a2e2387a41ab1fb48a72f18e98", "/sound/step/grass4.ogg");
        downloadResource("https://resources.download.minecraft.net/e8/e8b89f316f3e9989a87f6e6ff12db9abe0f8b09f", "/sound/step/gravel1.ogg");
        downloadResource("https://resources.download.minecraft.net/c3/c3b3797d04cb9640e1d3a72d5e96edb410388fa3", "/sound/step/gravel2.ogg");
        downloadResource("https://resources.download.minecraft.net/48/48f7e1bb098abd36b9760cca27b9d4391a23de26", "/sound/step/gravel3.ogg");
        downloadResource("https://resources.download.minecraft.net/7b/7bf3553a4fe41a0078f4988a13d6e1ed8663ef4c", "/sound/step/gravel4.ogg");
        downloadResource("https://resources.download.minecraft.net/4e/4e094ed8dfa98656d8fec52a7d20c5ee6098b6ad", "/sound/step/stone1.ogg");
        downloadResource("https://resources.download.minecraft.net/9c/9c92f697142ae320584bf64c0d54381d59703528", "/sound/step/stone2.ogg");
        downloadResource("https://resources.download.minecraft.net/8f/8f23c02475d388b23e5faa680eafe6b991d7a9d4", "/sound/step/stone3.ogg");
        downloadResource("https://resources.download.minecraft.net/36/363545a76277e5e47538b2dd3a0d6aa4f7a87d34", "/sound/step/stone4.ogg");
        downloadResource("https://resources.download.minecraft.net/9b/9bc2a84d0aa98113fc52609976fae8fc88ea6333", "/sound/step/wood1.ogg");
        downloadResource("https://resources.download.minecraft.net/98/98102533e6085617a2962157b4f3658f59aea018", "/sound/step/wood2.ogg");
        downloadResource("https://resources.download.minecraft.net/45/45b2aef7b5049e81b39b58f8d631563fadcc778b", "/sound/step/wood3.ogg");
        downloadResource("https://resources.download.minecraft.net/dc/dc66978374a46ab2b87db6472804185824868095", "/sound/step/wood4.ogg");
    }

    public static void soundThree()
    {
        downloadResource("https://resources.download.minecraft.net/29/29d4dccf3353334c7aa2a49cb6fed3780a51a1ba", "/sound3/ambient/cave/cave1.ogg");
        downloadResource("https://resources.download.minecraft.net/56/5680749048457f5772ec95a73d856ad792fa1717", "/sound3/ambient/cave/cave2.ogg");
        downloadResource("https://resources.download.minecraft.net/d4/d4b06ccb8e331ece734f51d84a0a5fbc7164d8be", "/sound3/ambient/cave/cave3.ogg");
        downloadResource("https://resources.download.minecraft.net/48/48540d7788ce3d9e780cb448ce5676c53dbcfd23", "/sound3/ambient/cave/cave4.ogg");
        downloadResource("https://resources.download.minecraft.net/18/18a992d93128bb2e2861930cff3140c6940c0127", "/sound3/ambient/cave/cave5.ogg");
        downloadResource("https://resources.download.minecraft.net/cf/cf23204a9cca2ac7f9674168cc063cfb4dbe001f", "/sound3/ambient/cave/cave6.ogg");
        downloadResource("https://resources.download.minecraft.net/c8/c8dd60f7e7087da52a431c1dbc0f397317b374fb", "/sound3/ambient/cave/cave7.ogg");
        downloadResource("https://resources.download.minecraft.net/90/9024de3f1dd4bc1e8f445c7c5b812f25c7e31bf6", "/sound3/ambient/cave/cave8.ogg");
        downloadResource("https://resources.download.minecraft.net/b4/b463fa47816fe9a5dfe508093150e647403e4db6", "/sound3/ambient/cave/cave9.ogg");
        downloadResource("https://resources.download.minecraft.net/79/79a5b53bf22cca182ddff2a670942c49867663ec", "/sound3/ambient/cave/cave10.ogg");
        downloadResource("https://resources.download.minecraft.net/e3/e367d1dfa1ce07374e0aeaecbfb1526142a0dcc1", "/sound3/ambient/cave/cave11.ogg");
        downloadResource("https://resources.download.minecraft.net/a7/a720e85e35be0dc3186d01cc599121b87e7ee9f7", "/sound3/ambient/cave/cave12.ogg");
        downloadResource("https://resources.download.minecraft.net/63/63bbe3921abd75b9f6cd1e20330360d164da169b", "/sound3/ambient/cave/cave13.ogg");
        downloadResource("https://resources.download.minecraft.net/d6/d68bae1949299ccd8297aaa423dd12e041e83773", "/sound3/ambient/weather/rain1.ogg");
        downloadResource("https://resources.download.minecraft.net/ba/ba58e1b6c8cc814a210db268d3e59a06b7ac62be", "/sound3/ambient/weather/rain2.ogg");
        downloadResource("https://resources.download.minecraft.net/4c/4cdd8fc380e85409fd94b93abdcad077d75ec58f", "/sound3/ambient/weather/rain3.ogg");
        downloadResource("https://resources.download.minecraft.net/08/08e555782cb2785b24e08a417a5e58aa08bd0695", "/sound3/ambient/weather/rain4.ogg");
        downloadResource("https://resources.download.minecraft.net/67/671ef0ae7b59014a2f637d7af6d781324ab6309f", "/sound3/ambient/weather/thunder1.ogg");
        downloadResource("https://resources.download.minecraft.net/a2/a20cbf2ddce541eaed520d7ec55665fe97428be6", "/sound3/ambient/weather/thunder2.ogg");
        downloadResource("https://resources.download.minecraft.net/9e/9ead5c928f9122e3c2f5fc4f6ce7fb4054a2b578", "/sound3/ambient/weather/thunder3.ogg");
        downloadResource("https://resources.download.minecraft.net/1d/1d183c36f596e85c4fb564ff2667332211e49659", "/sound3/damage/fallbig.ogg");
        downloadResource("https://resources.download.minecraft.net/09/09236e1a725cec0229b8c564f5b3e4fe05cd7a5f", "/sound3/damage/fallsmall.ogg");
        downloadResource("https://resources.download.minecraft.net/87/8760ebb9d4b1fe9457ef272324ecd6b4329a593e", "/sound3/damage/hit1.ogg");
        downloadResource("https://resources.download.minecraft.net/14/144867e8792415e2873293f06ecce85cd32bb4e8", "/sound3/damage/hit2.ogg");
        downloadResource("https://resources.download.minecraft.net/c7/c73dcedde5031fcf242b08b3405f63098cd70641", "/sound3/damage/hit3.ogg");
        downloadResource("https://resources.download.minecraft.net/5f/5fd568d724ba7d53911b6cccf5636f859d2662e8", "/sound3/dig/cloth1.ogg");
        downloadResource("https://resources.download.minecraft.net/56/56c1d0ac0de2265018b2c41cb571cc6631101484", "/sound3/dig/cloth2.ogg");
        downloadResource("https://resources.download.minecraft.net/9c/9c63f2a3681832dc32d206f6830360bfe94b5bfc", "/sound3/dig/cloth3.ogg");
        downloadResource("https://resources.download.minecraft.net/55/55da1856e77cfd31a7e8c3d358e1f856c5583198", "/sound3/dig/cloth4.ogg");
        downloadResource("https://resources.download.minecraft.net/41/41cbf5dd08e951ad65883854e74d2e034929f572", "/sound3/dig/grass1.ogg");
        downloadResource("https://resources.download.minecraft.net/86/86cb1bb0c45625b18e00a64098cd425a38f6d3f2", "/sound3/dig/grass2.ogg");
        downloadResource("https://resources.download.minecraft.net/f7/f7d7e5c7089c9b45fa5d1b31542eb455fad995db", "/sound3/dig/grass3.ogg");
        downloadResource("https://resources.download.minecraft.net/c7/c7b1005d4926f6a2e2387a41ab1fb48a72f18e98", "/sound3/dig/grass4.ogg");
        downloadResource("https://resources.download.minecraft.net/e8/e8b89f316f3e9989a87f6e6ff12db9abe0f8b09f", "/sound3/dig/gravel1.ogg");
        downloadResource("https://resources.download.minecraft.net/c3/c3b3797d04cb9640e1d3a72d5e96edb410388fa3", "/sound3/dig/gravel2.ogg");
        downloadResource("https://resources.download.minecraft.net/48/48f7e1bb098abd36b9760cca27b9d4391a23de26", "/sound3/dig/gravel3.ogg");
        downloadResource("https://resources.download.minecraft.net/7b/7bf3553a4fe41a0078f4988a13d6e1ed8663ef4c", "/sound3/dig/gravel4.ogg");
        downloadResource("https://resources.download.minecraft.net/9e/9e59c3650c6c3fc0a475f1b753b2fcfef430bf81", "/sound3/dig/sand1.ogg");
        downloadResource("https://resources.download.minecraft.net/0f/0fa4234797f336ada4e3735e013e44d1099afe57", "/sound3/dig/sand2.ogg");
        downloadResource("https://resources.download.minecraft.net/c7/c75589cc0087069f387de127dd1499580498738e", "/sound3/dig/sand3.ogg");
        downloadResource("https://resources.download.minecraft.net/37/37afa06f97d58767a1cd1382386db878be1532dd", "/sound3/dig/sand4.ogg");
        downloadResource("https://resources.download.minecraft.net/e9/e9bab7d3d15541f0aaa93fad31ad37fd07e03a6c", "/sound3/dig/snow1.ogg");
        downloadResource("https://resources.download.minecraft.net/58/5887d10234c4f244ec5468080412f3e6ef9522f3", "/sound3/dig/snow2.ogg");
        downloadResource("https://resources.download.minecraft.net/a4/a4bc069321a96236fde04a3820664cc23b2ea619", "/sound3/dig/snow3.ogg");
        downloadResource("https://resources.download.minecraft.net/e2/e26fa3036cdab4c2264ceb19e1cd197a2a510227", "/sound3/dig/snow4.ogg");
        downloadResource("https://resources.download.minecraft.net/4e/4e094ed8dfa98656d8fec52a7d20c5ee6098b6ad", "/sound3/dig/stone1.ogg");
        downloadResource("https://resources.download.minecraft.net/9c/9c92f697142ae320584bf64c0d54381d59703528", "/sound3/dig/stone2.ogg");
        downloadResource("https://resources.download.minecraft.net/8f/8f23c02475d388b23e5faa680eafe6b991d7a9d4", "/sound3/dig/stone3.ogg");
        downloadResource("https://resources.download.minecraft.net/36/363545a76277e5e47538b2dd3a0d6aa4f7a87d34", "/sound3/dig/stone4.ogg");
        downloadResource("https://resources.download.minecraft.net/9b/9bc2a84d0aa98113fc52609976fae8fc88ea6333", "/sound3/dig/wood1.ogg");
        downloadResource("https://resources.download.minecraft.net/98/98102533e6085617a2962157b4f3658f59aea018", "/sound3/dig/wood2.ogg");
        downloadResource("https://resources.download.minecraft.net/45/45b2aef7b5049e81b39b58f8d631563fadcc778b", "/sound3/dig/wood3.ogg");
        downloadResource("https://resources.download.minecraft.net/dc/dc66978374a46ab2b87db6472804185824868095", "/sound3/dig/wood4.ogg");
        downloadResource("https://resources.download.minecraft.net/8b/8b260108a73470c16cd244325242d4780cfb7d78", "/sound3/fire/fire.ogg");
        downloadResource("https://resources.download.minecraft.net/a0/a0d1fbff7e938e92c10c1576339dda668f40e111", "/sound3/fire/ignite.ogg");
        downloadResource("https://resources.download.minecraft.net/cd/cd9062e9e81f7cd35164a99669e5db32891a5cb5", "/sound3/fireworks/blast_far1.ogg");
        downloadResource("https://resources.download.minecraft.net/d9/d9d7511e8944da0c7ab4ed2d3e3d964f98dd6997", "/sound3/fireworks/blast1.ogg");
        downloadResource("https://resources.download.minecraft.net/bf/bfb0e14bf130de4ecda75d8e793260e8bbaca35b", "/sound3/fireworks/largeBlast_far1.ogg");
        downloadResource("https://resources.download.minecraft.net/ef/ef59205829f09ac4855c614a0e7046db820df18b", "/sound3/fireworks/largeBlast1.ogg");
        downloadResource("https://resources.download.minecraft.net/b1/b1715242916d56140486c612056ea4d6dd5a4404", "/sound3/fireworks/launch1.ogg");
        downloadResource("https://resources.download.minecraft.net/c8/c8053e3b083b08840276de9a728202551302f416", "/sound3/fireworks/twinkle_far1.ogg");
        downloadResource("https://resources.download.minecraft.net/41/41b9c631e9c1c40800b3b02a0ac5855d6ad4846d", "/sound3/fireworks/twinkle1.ogg");
        downloadResource("https://resources.download.minecraft.net/92/9272aef9f27dfcc10b6e3879b7a2a67f8faa1a83", "/sound3/liquid/lava.ogg");
        downloadResource("https://resources.download.minecraft.net/19/19a5aae31c3e0018a960b709a9f0240d8d47dda7", "/sound3/liquid/lavapop.ogg");
        downloadResource("https://resources.download.minecraft.net/4c/4c14c40542e249c902d0cac710ab4c6d6debba28", "/sound3/liquid/splash.ogg");
        downloadResource("https://resources.download.minecraft.net/85/857abbbfb58186c2f1b5510a4072630950e518f6", "/sound3/liquid/splash2.ogg");
        downloadResource("https://resources.download.minecraft.net/6e/6ea4e448fbc2a079acb0cf3564273083dadae165", "/sound3/liquid/swim1.ogg");
        downloadResource("https://resources.download.minecraft.net/82/827d71834e69954e0a7fd7748998332e0b619d29", "/sound3/liquid/swim2.ogg");
        downloadResource("https://resources.download.minecraft.net/b5/b5f9075a8bf6977e7dfd3d316a673eaaa5834a99", "/sound3/liquid/swim3.ogg");
        downloadResource("https://resources.download.minecraft.net/6a/6a908e7c7d61e01bc4223b4991820bfc56f84c5e", "/sound3/liquid/swim4.ogg");
        downloadResource("https://resources.download.minecraft.net/34/3483650440deb3934255e044ddabff5b01a65356", "/sound3/liquid/water.ogg");
        downloadResource("https://resources.download.minecraft.net/28/28f9973fcd8366ac9837dbe190b129a8fce15857", "/sound3/minecart/base.ogg");
        downloadResource("https://resources.download.minecraft.net/6a/6a83b514027c328b74f8428448dc6589d4b16388", "/sound3/minecart/inside.ogg");
        downloadResource("https://resources.download.minecraft.net/6d/6df3b2c2b951863fc5200edf3ff3396b105ed897", "/sound3/mob/bat/death.ogg");
        downloadResource("https://resources.download.minecraft.net/fd/fddba78b2426f8056be081c98fe82e8411a0a5cf", "/sound3/mob/bat/hurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/57/573e565b7fda2c34fc972edd21a82fd2e09200f8", "/sound3/mob/bat/hurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/15/1599551814c141acd0c4a3c4a0ff83f4c4e3026d", "/sound3/mob/bat/hurt3.ogg");
        downloadResource("https://resources.download.minecraft.net/0b/0ba4a7830ea8852bf7844872d7e2d2a408fb77e4", "/sound3/mob/bat/hurt4.ogg");
        downloadResource("https://resources.download.minecraft.net/c3/c3c175d70372d8448c070d0716a8d88beec8b8b7", "/sound3/mob/bat/idle1.ogg");
        downloadResource("https://resources.download.minecraft.net/e9/e9d023a54a6b514af496c8f253f5f3fa948fd4b6", "/sound3/mob/bat/idle2.ogg");
        downloadResource("https://resources.download.minecraft.net/e6/e641dd3d6607db86b7574fe82781a34ad74f6c77", "/sound3/mob/bat/idle3.ogg");
        downloadResource("https://resources.download.minecraft.net/a3/a323a968296882e15c743ccdc8cb8057557ae712", "/sound3/mob/bat/idle4.ogg");
        downloadResource("https://resources.download.minecraft.net/e2/e260582909112ec3c255d1ec0375c7913df5f9f8", "/sound3/mob/bat/loop.ogg");
        downloadResource("https://resources.download.minecraft.net/ee/ee6079d3826ac2994f3f58e62370f3c8ff9328e9", "/sound3/mob/bat/takeoff.ogg");
        downloadResource("https://resources.download.minecraft.net/4e/4e398c518ae706ad4d90afd6914f748faf18a7b5", "/sound3/mob/blaze/breathe1.ogg");
        downloadResource("https://resources.download.minecraft.net/c7/c74368d2b978f570b4e7ce9645fd84b07f8f145c", "/sound3/mob/blaze/breathe2.ogg");
        downloadResource("https://resources.download.minecraft.net/24/24d643885f9b83d8f034f49e2c5e00e70d4f175a", "/sound3/mob/blaze/breathe3.ogg");
        downloadResource("https://resources.download.minecraft.net/78/78d544a240d627005aaef6033fd646eafc66fe7a", "/sound3/mob/blaze/breathe4.ogg");
        downloadResource("https://resources.download.minecraft.net/17/17491c8dd9511e9d848c92b4b7ae047aed164072", "/sound3/mob/blaze/death.ogg");
        downloadResource("https://resources.download.minecraft.net/cb/cb1cf4b405d930ad27f09ea39d6a64f35fc13308", "/sound3/mob/blaze/hit1.ogg");
        downloadResource("https://resources.download.minecraft.net/00/00b38fae5d28d99514a3e73a913af16359b12b7a", "/sound3/mob/blaze/hit2.ogg");
        downloadResource("https://resources.download.minecraft.net/97/97e09d51c82b78ab82fb3a4dbbb8cd701b2d0aeb", "/sound3/mob/blaze/hit3.ogg");
        downloadResource("https://resources.download.minecraft.net/3f/3f447f3e331b59ad014d9bd4a6536f98cf3a08c3", "/sound3/mob/blaze/hit4.ogg");
        downloadResource("https://resources.download.minecraft.net/9d/9d2202fce7908dcc5b5c8758c5cd517d863d4dd3", "/sound3/mob/cat/hiss1.ogg");
        downloadResource("https://resources.download.minecraft.net/06/063bf0fce35c547eb59f086dbb56c5fe329cbcf4", "/sound3/mob/cat/hiss2.ogg");
        downloadResource("https://resources.download.minecraft.net/c7/c7e424eb00712614a183adf5d17b949175ff00df", "/sound3/mob/cat/hiss3.ogg");
        downloadResource("https://resources.download.minecraft.net/28/28409652d939d2489d8b5317d51abb873821f0f4", "/sound3/mob/cat/hitt1.ogg");
        downloadResource("https://resources.download.minecraft.net/ce/ce499da6ec5dd226d50843890ca09f16018aff9a", "/sound3/mob/cat/hitt2.ogg");
        downloadResource("https://resources.download.minecraft.net/3d/3d98b4b7c37a09101da00d8a3078e0acba6558f4", "/sound3/mob/cat/hitt3.ogg");
        downloadResource("https://resources.download.minecraft.net/5f/5fdf1bd80b204245af760042d2e546d87666e288", "/sound3/mob/cat/meow1.ogg");
        downloadResource("https://resources.download.minecraft.net/98/9853be18df1a5b2642e33ba05e71bfd5099f9f04", "/sound3/mob/cat/meow2.ogg");
        downloadResource("https://resources.download.minecraft.net/38/381f9e97a8a986ecab3e86431d6be6df5ff79c31", "/sound3/mob/cat/meow3.ogg");
        downloadResource("https://resources.download.minecraft.net/4b/4bf7c7a08c1217de7b1f0faf82429665fbf18458", "/sound3/mob/cat/meow4.ogg");
        downloadResource("https://resources.download.minecraft.net/31/315512d6027033c2a279841badb40a26d74efc81", "/sound3/mob/cat/purr1.ogg");
        downloadResource("https://resources.download.minecraft.net/84/847ec719ee91e28d7bf58ab39a5d8d6bd5728314", "/sound3/mob/cat/purr2.ogg");
        downloadResource("https://resources.download.minecraft.net/ee/eed7a9305f5879448bb94355f25279b4aac403b6", "/sound3/mob/cat/purr3.ogg");
        downloadResource("https://resources.download.minecraft.net/d0/d00791807e913e57d58fd891cb4dd10186cfdf38", "/sound3/mob/cat/purreow1.ogg");
        downloadResource("https://resources.download.minecraft.net/08/08573a1f11058b09c5855122dff47ceb209f771e", "/sound3/mob/cat/purreow2.ogg");
        downloadResource("https://resources.download.minecraft.net/74/74e5422bd83bb2041a6f0d09644bc095c0e9e21a", "/sound3/mob/chicken/say1.ogg");
        downloadResource("https://resources.download.minecraft.net/36/3660e743db2bbbcff0866d3f1e606882f1aeb6ac", "/sound3/mob/chicken/say2.ogg");
        downloadResource("https://resources.download.minecraft.net/49/49874e07369c3bb0bc8a2fba4f2096d2e9a36c9a", "/sound3/mob/chicken/say3.ogg");
        downloadResource("https://resources.download.minecraft.net/31/31b52151bf2a6fa35d2d2aa72f832285d9e7d70d", "/sound3/mob/chicken/hurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/18/18752157f5d8718e2752805a657c74a73d2b88db", "/sound3/mob/chicken/hurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/ab/ab5a32b70ef1e7aafc550b20afdb7dc8c0d5d901", "/sound3/mob/chicken/plop.ogg");
        downloadResource("https://resources.download.minecraft.net/e0/e0f0ba416a5744036e11bb6a5fc5ac4b8c461873", "/sound3/mob/chicken/step1.ogg");
        downloadResource("https://resources.download.minecraft.net/bf/bf7fadaf64945f6b31c803d086ac6a652aabef9b", "/sound3/mob/chicken/step2.ogg");
        downloadResource("https://resources.download.minecraft.net/e0/e07a2da49011ef4cf9d6b1c80a91a06f808c1243", "/sound3/mob/cow/say1.ogg");
        downloadResource("https://resources.download.minecraft.net/22/228bab6d9b09994dc407b9d022bebca791d81c16", "/sound3/mob/cow/say2.ogg");
        downloadResource("https://resources.download.minecraft.net/05/05f429069e65d78f7e6609d070a3f294cc3128ab", "/sound3/mob/cow/say3.ogg");
        downloadResource("https://resources.download.minecraft.net/80/80ce8d4b8d361b69e42d8d147e42a09d3c85a115", "/sound3/mob/cow/say4.ogg");
        downloadResource("https://resources.download.minecraft.net/98/989c3b614f736aa77bb2800821ea56936e98ca68", "/sound3/mob/cow/hurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/75/758d2a1c36abc84d2744d697b76d5414ea96d9f3", "/sound3/mob/cow/hurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/2a/2a031f10c7dc24e75d5dc3a374ebe7f36fc3e143", "/sound3/mob/cow/hurt3.ogg");
        downloadResource("https://resources.download.minecraft.net/fe/fec7c7997f8eb6faaebd37f0eaed417118d3a498", "/sound3/mob/cow/step1.ogg");
        downloadResource("https://resources.download.minecraft.net/55/555d33de143e6dcef2aa80ebf9a8f8b1481d42d0", "/sound3/mob/cow/step2.ogg");
        downloadResource("https://resources.download.minecraft.net/48/482919bc631b317422ab44af3938259bea73fe83", "/sound3/mob/cow/step3.ogg");
        downloadResource("https://resources.download.minecraft.net/03/03063be15a77cc3f6815ec98090e351178190b33", "/sound3/mob/cow/step4.ogg");
        downloadResource("https://resources.download.minecraft.net/74/74771428c2aa2acbd30638c6706867053bad64d3", "/sound3/mob/creeper/say1.ogg");
        downloadResource("https://resources.download.minecraft.net/c4/c46c7d2a84749bfcbcf576aea0d66fd3deccba31", "/sound3/mob/creeper/say2.ogg");
        downloadResource("https://resources.download.minecraft.net/09/0979bf115d081d70a985f1cfcab1b9274d6be74e", "/sound3/mob/creeper/say3.ogg");
        downloadResource("https://resources.download.minecraft.net/85/85c860ea8c55984bf6cabb75354c78f3a603f98d", "/sound3/mob/creeper/say4.ogg");
        downloadResource("https://resources.download.minecraft.net/fb/fbc1b2c89c5c781e30d702b2885be3f485105869", "/sound3/mob/creeper/death.ogg");
        downloadResource("https://resources.download.minecraft.net/53/53cc1890ebea833d3964c7dd1c90676650e34404", "/sound3/mob/enderdragon/end.ogg");
        downloadResource("https://resources.download.minecraft.net/04/049a3049a5ac8631a6c5f367b7d824fc0d8de39b", "/sound3/mob/enderdragon/growl1.ogg");
        downloadResource("https://resources.download.minecraft.net/d8/d859c9c5be04ffc41479b306814a933983eaa235", "/sound3/mob/enderdragon/growl2.ogg");
        downloadResource("https://resources.download.minecraft.net/ba/ba35053358ede7c3bf33a4c344d66680f09008c9", "/sound3/mob/enderdragon/growl3.ogg");
        downloadResource("https://resources.download.minecraft.net/c8/c84b0cf222e7dcbedde8eb9deb98835032f4d402", "/sound3/mob/enderdragon/growl4.ogg");
        downloadResource("https://resources.download.minecraft.net/ae/aedeb53dd3315f964ff4d10d0003e4c5f41d1bb0", "/sound3/mob/enderdragon/hit1.ogg");
        downloadResource("https://resources.download.minecraft.net/46/46e5db05b1e91ce33c9c4c63260227fa629230f4", "/sound3/mob/enderdragon/hit2.ogg");
        downloadResource("https://resources.download.minecraft.net/e9/e96237fdf5e5e1aca09496b9192243651525d0ac", "/sound3/mob/enderdragon/hit3.ogg");
        downloadResource("https://resources.download.minecraft.net/d2/d2c44730f6c93676d4e4316add92e424d0a71a33", "/sound3/mob/enderdragon/hit4.ogg");
        downloadResource("https://resources.download.minecraft.net/5a/5a368ed32b3357e31629451ace57eb30d90e8874", "/sound3/mob/enderdragon/wings1.ogg");
        downloadResource("https://resources.download.minecraft.net/7d/7d5b3b403a11b6dd4c3801c4f4c8bf7ce9a8c771", "/sound3/mob/enderdragon/wings2.ogg");
        downloadResource("https://resources.download.minecraft.net/eb/eb58ef697b2cbaed218edc758e00412302c75962", "/sound3/mob/enderdragon/wings3.ogg");
        downloadResource("https://resources.download.minecraft.net/92/92488929c42221fb3f1dee397a32d2e4de615f3c", "/sound3/mob/enderdragon/wings4.ogg");
        downloadResource("https://resources.download.minecraft.net/fa/fa6d89b586c5ca29efe85c8d373ff9ee19488d40", "/sound3/mob/enderdragon/wings5.ogg");
        downloadResource("https://resources.download.minecraft.net/e7/e7e8d393fc03a476227890e9ec9319dcc4b400ea", "/sound3/mob/enderdragon/wings6.ogg");
        downloadResource("https://resources.download.minecraft.net/d0/d04dd6d1f050353ef9e3ba9c45f407f831903c69", "/sound3/mob/endermen/death.ogg");
        downloadResource("https://resources.download.minecraft.net/75/753a88c1d9b3b46210c18ff07974955463edd18b", "/sound3/mob/endermen/hit1.ogg");
        downloadResource("https://resources.download.minecraft.net/cf/cf60aefd0b742c3fa15e808c1a0c33aebd534cc5", "/sound3/mob/endermen/hit2.ogg");
        downloadResource("https://resources.download.minecraft.net/aa/aaa8f1705c873ebc05da460657c8b83fa01ffd57", "/sound3/mob/endermen/hit3.ogg");
        downloadResource("https://resources.download.minecraft.net/6e/6e0f9074e049a6c30402d70cc75a5da99042e00c", "/sound3/mob/endermen/hit4.ogg");
        downloadResource("https://resources.download.minecraft.net/28/281b87984ddf8e94324bc86911a36c971cb3d831", "/sound3/mob/endermen/idle1.ogg");
        downloadResource("https://resources.download.minecraft.net/9c/9c7aaf49b3096a69a2d6ca62c1067400a2b70814", "/sound3/mob/endermen/idle2.ogg");
        downloadResource("https://resources.download.minecraft.net/bc/bc4c2e76d3b5a0e6f9d5837fe82ed26e808aa918", "/sound3/mob/endermen/idle3.ogg");
        downloadResource("https://resources.download.minecraft.net/40/405e2f82caef7f79eb9e26886520711e446366ce", "/sound3/mob/endermen/idle4.ogg");
        downloadResource("https://resources.download.minecraft.net/e7/e746ec4574aaa047be3076729753c2c75fd34630", "/sound3/mob/endermen/idle5.ogg");
        downloadResource("https://resources.download.minecraft.net/7b/7b4b5323ef066caa1ae43cbe66fffd9dfce4ed32", "/sound3/mob/endermen/portal.ogg");
        downloadResource("https://resources.download.minecraft.net/35/35461b6a4253db40973549e82d91f267c686be85", "/sound3/mob/endermen/portal2.ogg");
        downloadResource("https://resources.download.minecraft.net/c4/c4b5265bbafbe058347058a257abe33a0afb5ab7", "/sound3/mob/endermen/scream1.ogg");
        downloadResource("https://resources.download.minecraft.net/c8/c8cd465468a0fd41a1d5cc24cb499862b5ade2cb", "/sound3/mob/endermen/scream2.ogg");
        downloadResource("https://resources.download.minecraft.net/db/dbab0094299eacbce86ad427edcb34b8342861af", "/sound3/mob/endermen/scream3.ogg");
        downloadResource("https://resources.download.minecraft.net/bc/bcc73584d83225383aaa6affce905392c96afe86", "/sound3/mob/endermen/scream4.ogg");
        downloadResource("https://resources.download.minecraft.net/57/5738d7f49ef30adcfc4f2ab13e0b1d74f09a1289", "/sound3/mob/endermen/stare.ogg");
        downloadResource("https://resources.download.minecraft.net/99/99cd73dda425ee03836c2274a0fcf331139773dc", "/sound3/mob/ghast/affectionate scream.ogg");
        downloadResource("https://resources.download.minecraft.net/6f/6f1d403f47725af0f4c42a74cfec00ff59153160", "/sound3/mob/ghast/charge.ogg");
        downloadResource("https://resources.download.minecraft.net/72/725e5179c72444c6d885e39c27e6b31ed83d58bc", "/sound3/mob/ghast/death.ogg");
        downloadResource("https://resources.download.minecraft.net/ea/eafa60d7ec34f86e8f07a001ddcdf5c4600bb174", "/sound3/mob/ghast/fireball4.ogg");
        downloadResource("https://resources.download.minecraft.net/88/882d092b05faef1cfa6af43d642b9e8843f22756", "/sound3/mob/ghast/moan1.ogg");
        downloadResource("https://resources.download.minecraft.net/02/02073c284f025653e55f9cde25a4a62723d395fa", "/sound3/mob/ghast/moan2.ogg");
        downloadResource("https://resources.download.minecraft.net/dc/dcec2d45fbc25f74a399ec9f8001e0ecd2d5d85e", "/sound3/mob/ghast/moan3.ogg");
        downloadResource("https://resources.download.minecraft.net/93/935f1a575322bd0ec53a919fd061321216889104", "/sound3/mob/ghast/moan4.ogg");
        downloadResource("https://resources.download.minecraft.net/48/48fc6c25d0f1c1f0edd4eaca2b6f934d4117f440", "/sound3/mob/ghast/moan5.ogg");
        downloadResource("https://resources.download.minecraft.net/b3/b3f91f243eceaa25cff7488ec2dac732e22cfec3", "/sound3/mob/ghast/moan6.ogg");
        downloadResource("https://resources.download.minecraft.net/cf/cfb956ba9d26cbdacd16ef77d58764df783b2c7f", "/sound3/mob/ghast/moan7.ogg");
        downloadResource("https://resources.download.minecraft.net/a0/a0e62d86e5899405df4e796fe648e091d828691d", "/sound3/mob/ghast/scream1.ogg");
        downloadResource("https://resources.download.minecraft.net/57/57008a7f564443d563968fd040fc13ab226fc8d1", "/sound3/mob/ghast/scream2.ogg");
        downloadResource("https://resources.download.minecraft.net/8f/8f23820fa28830dd031188c20acb35af044aedb5", "/sound3/mob/ghast/scream3.ogg");
        downloadResource("https://resources.download.minecraft.net/ed/edbc9e9cb9dfeabef93207fc0bdee6ceee5df7bc", "/sound3/mob/ghast/scream4.ogg");
        downloadResource("https://resources.download.minecraft.net/77/77a7b79d4f2ada27640866ece1020b631f5bdc54", "/sound3/mob/ghast/scream5.ogg");
        downloadResource("https://resources.download.minecraft.net/77/770b3f1feb05b9b941d858eb72b9d04ffc5d52c9", "/sound3/mob/irongolem/death.ogg");
        downloadResource("https://resources.download.minecraft.net/94/942937fcad0fefd61e019678e3710f3f077757d4", "/sound3/mob/irongolem/hit1.ogg");
        downloadResource("https://resources.download.minecraft.net/bb/bb92fd6971430a515f508a6734392511385826e1", "/sound3/mob/irongolem/hit2.ogg");
        downloadResource("https://resources.download.minecraft.net/27/27c78cd09f7fd1770a41d78247ccf57c77dbc773", "/sound3/mob/irongolem/hit3.ogg");
        downloadResource("https://resources.download.minecraft.net/a2/a2dbb90f23b0babe7c569ceca28db49d0c112714", "/sound3/mob/irongolem/hit4.ogg");
        downloadResource("https://resources.download.minecraft.net/60/607d51883e137d5d423dde865232ab1ee78f2694", "/sound3/mob/irongolem/throw.ogg");
        downloadResource("https://resources.download.minecraft.net/4e/4e3e9f37c1e0c12c2993d25c28b89e2f0797ba5a", "/sound3/mob/irongolem/walk1.ogg");
        downloadResource("https://resources.download.minecraft.net/35/356fdb6192cf96aa5d5d9c76413f412f6a4d66a4", "/sound3/mob/irongolem/walk2.ogg");
        downloadResource("https://resources.download.minecraft.net/e0/e0672d288b09996f7c7e1a0ca696de82b7a02d18", "/sound3/mob/irongolem/walk3.ogg");
        downloadResource("https://resources.download.minecraft.net/88/88ae6c906f8f94add2fe904b59c94e844bbcef9a", "/sound3/mob/irongolem/walk4.ogg");
        downloadResource("https://resources.download.minecraft.net/43/430c65ac81151d873a27d611a9dff6c562e38c4f", "/sound3/mob/magmacube/big1.ogg");
        downloadResource("https://resources.download.minecraft.net/4c/4c4bcc6905430286f32a862ce69665c51bd9938f", "/sound3/mob/magmacube/big2.ogg");
        downloadResource("https://resources.download.minecraft.net/d5/d5c4316d30feef5213077e3ee24a7f52c5bf6735", "/sound3/mob/magmacube/big3.ogg");
        downloadResource("https://resources.download.minecraft.net/a6/a63fd7965328425a0a8111640de19428d841933e", "/sound3/mob/magmacube/big4.ogg");
        downloadResource("https://resources.download.minecraft.net/86/86a2a7206c769aaa9435aabba70be201cb3e3a6b", "/sound3/mob/magmacube/jump1.ogg");
        downloadResource("https://resources.download.minecraft.net/32/3285a993220dcea1fc37e98b9aa9219422c2c095", "/sound3/mob/magmacube/jump2.ogg");
        downloadResource("https://resources.download.minecraft.net/5a/5a2449cc3d4a6ad36598847e501f956e5a3528bd", "/sound3/mob/magmacube/jump3.ogg");
        downloadResource("https://resources.download.minecraft.net/50/500e2543034b4c026fb175d48c47196c5d013fe8", "/sound3/mob/magmacube/jump4.ogg");
        downloadResource("https://resources.download.minecraft.net/5c/5c633c345fe4cb87c36ada2fe2b5da1b80601cf3", "/sound3/mob/magmacube/small1.ogg");
        downloadResource("https://resources.download.minecraft.net/18/18237686efcaa1bf9084173c99d11ce0d37d4fc5", "/sound3/mob/magmacube/small2.ogg");
        downloadResource("https://resources.download.minecraft.net/65/65a1a69845133187d6b8689e6ce9707da10f21a6", "/sound3/mob/magmacube/small3.ogg");
        downloadResource("https://resources.download.minecraft.net/a4/a485082ed0820eeeb9df13f84f26b14744ceeb2a", "/sound3/mob/magmacube/small4.ogg");
        downloadResource("https://resources.download.minecraft.net/56/560dd97e6da8badbc8ac00b28c45312e60a525f2", "/sound3/mob/magmacube/small5.ogg");
        downloadResource("https://resources.download.minecraft.net/a9/a99bf88163bcb576e31e6e2275145afba6d1b4c7", "/sound3/mob/pig/say1.ogg");
        downloadResource("https://resources.download.minecraft.net/ab/ab615a912fb8ea06648836e0ec1cbeeefe117da6", "/sound3/mob/pig/say2.ogg");
        downloadResource("https://resources.download.minecraft.net/58/58efedf302e0203a6ff9e59a6535d300286c5594", "/sound3/mob/pig/say3.ogg");
        downloadResource("https://resources.download.minecraft.net/4b/4bc87ab869e17732a20c7518a327136baf5b2c26", "/sound3/mob/pig/death.ogg");
        downloadResource("https://resources.download.minecraft.net/05/05baaf5ed0cbdab08292b3962e1b1385e13b9dba", "/sound3/mob/pig/step1.ogg");
        downloadResource("https://resources.download.minecraft.net/a6/a69a66bfda52a42ea8cf712eb1caa8830046c14f", "/sound3/mob/pig/step2.ogg");
        downloadResource("https://resources.download.minecraft.net/62/6226903c5dfd8ac388f9d64a5fa9968680ed3507", "/sound3/mob/pig/step3.ogg");
        downloadResource("https://resources.download.minecraft.net/f5/f5e1ba4ac271b4c2feee86a4d04e32279ea99c10", "/sound3/mob/pig/step4.ogg");
        downloadResource("https://resources.download.minecraft.net/56/56d6fd65958fb25bf9b4033a87655b591e222005", "/sound3/mob/pig/step5.ogg");
        downloadResource("https://resources.download.minecraft.net/a3/a3ffeaa0a75b8d2bdc949c181a6f8db78f8976ca", "/sound3/mob/sheep/say1.ogg");
        downloadResource("https://resources.download.minecraft.net/1c/1cfd864cbda555477ed9523e640de0d234c18858", "/sound3/mob/sheep/say2.ogg");
        downloadResource("https://resources.download.minecraft.net/c9/c9ac72409cbe6093e84d72a2a5c719d9e4a0e6b2", "/sound3/mob/sheep/say3.ogg");
        downloadResource("https://resources.download.minecraft.net/5d/5d9055cf25f126c47e18637aeef917fa1ef61a42", "/sound3/mob/sheep/shear.ogg");
        downloadResource("https://resources.download.minecraft.net/52/5288cab96e26207edd31307c9c01b6902306e4f6", "/sound3/mob/sheep/step1.ogg");
        downloadResource("https://resources.download.minecraft.net/59/59034eb696e186d973dcea0b162f01e38f1b4f31", "/sound3/mob/sheep/step2.ogg");
        downloadResource("https://resources.download.minecraft.net/10/101164ea1b442a8e1e8ca181d9cef833c57d7be3", "/sound3/mob/sheep/step3.ogg");
        downloadResource("https://resources.download.minecraft.net/6f/6ff26a1439fb6f9f353c2bd623edeb936e760855", "/sound3/mob/sheep/step4.ogg");
        downloadResource("https://resources.download.minecraft.net/c2/c289aa46fcbcfaf21c8080d57953fd45a4939294", "/sound3/mob/sheep/step5.ogg");
        downloadResource("https://resources.download.minecraft.net/84/84c3b008dc1d5e0dd5e8ad85a06eca29f0591e48", "/sound3/mob/silverfish/hit1.ogg");
        downloadResource("https://resources.download.minecraft.net/38/38d4d36bbe40a48c3a8ef97735b59b37f013fd6e", "/sound3/mob/silverfish/hit2.ogg");
        downloadResource("https://resources.download.minecraft.net/5b/5b1675279bbc245fc6bbb705de8ea09fb3f32b53", "/sound3/mob/silverfish/hit3.ogg");
        downloadResource("https://resources.download.minecraft.net/24/24cdac5a80fdad7ab31dc0695b57ece55aecb21a", "/sound3/mob/silverfish/kill.ogg");
        downloadResource("https://resources.download.minecraft.net/51/515dffc5d6dd216550d69e61b2eb9c3593b19a20", "/sound3/mob/silverfish/say1.ogg");
        downloadResource("https://resources.download.minecraft.net/39/396b8b46e593cf55d843853b704dc054ef614e55", "/sound3/mob/silverfish/say2.ogg");
        downloadResource("https://resources.download.minecraft.net/e7/e7f0f24c2c9f4bf83286b17109580d3e845d19e3", "/sound3/mob/silverfish/say3.ogg");
        downloadResource("https://resources.download.minecraft.net/4f/4fce41a2d0890418ae1efb03d1142ca74d00aa61", "/sound3/mob/silverfish/say4.ogg");
        downloadResource("https://resources.download.minecraft.net/76/763cc79934a572b84c371cb49afad5912f29d2f1", "/sound3/mob/silverfish/step1.ogg");
        downloadResource("https://resources.download.minecraft.net/f1/f1665747da14569c4de55e07884deeef18a40f62", "/sound3/mob/silverfish/step2.ogg");
        downloadResource("https://resources.download.minecraft.net/47/47ad81223bcec870206484cd4d1a6202871df331", "/sound3/mob/silverfish/step3.ogg");
        downloadResource("https://resources.download.minecraft.net/a3/a342f566600caf73464323b20b7770b5b9b7893a", "/sound3/mob/silverfish/step4.ogg");
        downloadResource("https://resources.download.minecraft.net/19/199c9f150822950385b9bc1d840605a6a795bd27", "/sound3/mob/skeleton/say1.ogg");
        downloadResource("https://resources.download.minecraft.net/52/529abcb09220f0ebeb595f32bb663d026a7e0ae5", "/sound3/mob/skeleton/say2.ogg");
        downloadResource("https://resources.download.minecraft.net/a1/a11ac56ec61c17e99f4ee33d8712404edf442720", "/sound3/mob/skeleton/say3.ogg");
        downloadResource("https://resources.download.minecraft.net/64/641e601132b4adb67951e0d49c1004cf1b86eff2", "/sound3/mob/skeleton/death.ogg");
        downloadResource("https://resources.download.minecraft.net/4d/4d03069c0e14794b463f563044da46433776da60", "/sound3/mob/skeleton/hurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/d1/d1ad2cbe6584d9cd9483483f8655966d25a251a0", "/sound3/mob/skeleton/hurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/ac/acffab0bafe2c82ffc8723880aab5ec1682d4329", "/sound3/mob/skeleton/hurt3.ogg");
        downloadResource("https://resources.download.minecraft.net/a8/a88e0436e38512171a3ef819249c3d1a2650540f", "/sound3/mob/skeleton/hurt4.ogg");
        downloadResource("https://resources.download.minecraft.net/68/68e0a58848bbdad12ad2b216d7244754459c9516", "/sound3/mob/skeleton/step1.ogg");
        downloadResource("https://resources.download.minecraft.net/46/4609ec723b4e724f44c653b82de40ec159d2eea1", "/sound3/mob/skeleton/step2.ogg");
        downloadResource("https://resources.download.minecraft.net/00/000c82756fd54e40cb236199f2b479629d0aca2f", "/sound3/mob/skeleton/step3.ogg");
        downloadResource("https://resources.download.minecraft.net/a8/a89bdd809baa83cacd329f0219bca1f612ccda5a", "/sound3/mob/skeleton/step4.ogg");
        downloadResource("https://resources.download.minecraft.net/5c/5cde2500773323f7997d75062f8a26afcdf62b2e", "/sound3/mob/slime/small1.ogg");
        downloadResource("https://resources.download.minecraft.net/5e/5e2ef521293719bbe22bbb515bbcacf4c233a075", "/sound3/mob/slime/small2.ogg");
        downloadResource("https://resources.download.minecraft.net/3b/3bc8225914b1be20db68fcdae202d5acee3234c2", "/sound3/mob/slime/small3.ogg");
        downloadResource("https://resources.download.minecraft.net/4d/4dfe0b607c5de2e47f3b7950c56bbebbf3115957", "/sound3/mob/slime/small4.ogg");
        downloadResource("https://resources.download.minecraft.net/35/35f0b3c9c462a6c21ec213fbda2437a0e6427883", "/sound3/mob/slime/small5.ogg");
        downloadResource("https://resources.download.minecraft.net/07/075e1ea92d5564d7bdf267ae975044315a41a686", "/sound3/mob/slime/attack1.ogg");
        downloadResource("https://resources.download.minecraft.net/f6/f6e2067571631aae206000a501c9adebe862e32a", "/sound3/mob/slime/attack2.ogg");
        downloadResource("https://resources.download.minecraft.net/b5/b5eca1979e69271b2065ac67ba2c37b5afac0f98", "/sound3/mob/slime/big1.ogg");
        downloadResource("https://resources.download.minecraft.net/00/00e06362a31ad7094e452c5bcea837b061825cb0", "/sound3/mob/slime/big2.ogg");
        downloadResource("https://resources.download.minecraft.net/2c/2c20816632caecf75f00bb968f51847e3a982e75", "/sound3/mob/slime/big3.ogg");
        downloadResource("https://resources.download.minecraft.net/c9/c906c18d26550ae15c75e23f2c5066e4fc678c89", "/sound3/mob/slime/big4.ogg");
        downloadResource("https://resources.download.minecraft.net/65/65b49739d48ebc47879ca5528c8283329980b304", "/sound3/mob/spider/say1.ogg");
        downloadResource("https://resources.download.minecraft.net/50/501b40b97ee55cb7a97943ee620aa05131089fc2", "/sound3/mob/spider/say2.ogg");
        downloadResource("https://resources.download.minecraft.net/f9/f9f79162efa6667b753c1fbb46ff9888e8ce5f32", "/sound3/mob/spider/say3.ogg");
        downloadResource("https://resources.download.minecraft.net/3c/3cf3e8d3aab0a3092f6c6bf681ff156bc9653859", "/sound3/mob/spider/say4.ogg");
        downloadResource("https://resources.download.minecraft.net/4c/4c69a6edc25d973999aa0db2bb46b583a31da278", "/sound3/mob/spider/death.ogg");
        downloadResource("https://resources.download.minecraft.net/8f/8f7ff84e460ca507f654168f1d24e82637517940", "/sound3/mob/spider/step1.ogg");
        downloadResource("https://resources.download.minecraft.net/a8/a8eb0b1ce4abb53334ab75be82dc465135c4a27a", "/sound3/mob/spider/step2.ogg");
        downloadResource("https://resources.download.minecraft.net/ef/efa5acfa08b210ba3087b535c40549c0ed8916f0", "/sound3/mob/spider/step3.ogg");
        downloadResource("https://resources.download.minecraft.net/7d/7d801582e08be973d1a41469d1b92916278d1e88", "/sound3/mob/spider/step4.ogg");
        downloadResource("https://resources.download.minecraft.net/ae/ae27c6817985a9acb0a0fdefab89ff5d82dbe009", "/sound3/mob/wither/death.ogg");
        downloadResource("https://resources.download.minecraft.net/55/550da80d936e05a7bfda43ca5d8af5b3779320f1", "/sound3/mob/wither/hurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/80/8072827813f0bffb9847e636245edebb5ddab198", "/sound3/mob/wither/hurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/a4/a4cf4ebe4c475cd6a4852d6b4228a4b64cf5cb00", "/sound3/mob/wither/hurt3.ogg");
        downloadResource("https://resources.download.minecraft.net/72/72a006be3bd693aa23cc2f8e9c9d13ea6f829aa1", "/sound3/mob/wither/hurt4.ogg");
        downloadResource("https://resources.download.minecraft.net/22/22ed26394cb6f6b5eeb2ceb54fb50608798d19e8", "/sound3/mob/wither/idle1.ogg");
        downloadResource("https://resources.download.minecraft.net/6b/6b2f86a35a3cd88320b55c029d77659915f83239", "/sound3/mob/wither/idle2.ogg");
        downloadResource("https://resources.download.minecraft.net/79/79afbeabcdbb063cfa00d544dc00beac8543a581", "/sound3/mob/wither/idle3.ogg");
        downloadResource("https://resources.download.minecraft.net/e3/e3f90fb5afaf84475dd31dca6f65378a455d17f7", "/sound3/mob/wither/idle4.ogg");
        downloadResource("https://resources.download.minecraft.net/78/78ee5b46b6615191b7a16d259fcbda273762297e", "/sound3/mob/wither/shoot.ogg");
        downloadResource("https://resources.download.minecraft.net/d8/d8caaead680c20a4f51361587aeddd57a3357a72", "/sound3/mob/wither/spawn.ogg");
        downloadResource("https://resources.download.minecraft.net/24/2452c64a55eaef86bf1b668bb4d5f3b641cd8f25", "/sound3/mob/wolf/bark1.ogg");
        downloadResource("https://resources.download.minecraft.net/9f/9f1708a6409d04370ec12d0add015b11abbd5371", "/sound3/mob/wolf/bark2.ogg");
        downloadResource("https://resources.download.minecraft.net/1d/1ddae4e8dfa605e27ec8278b3e312597b674437e", "/sound3/mob/wolf/bark3.ogg");
        downloadResource("https://resources.download.minecraft.net/77/77a5d445ed9ee588846947ac3df63f84be6d569d", "/sound3/mob/wolf/death.ogg");
        downloadResource("https://resources.download.minecraft.net/0b/0b29f5ce8c4c10fa4184e5d29244f3bc121468a0", "/sound3/mob/wolf/growl1.ogg");
        downloadResource("https://resources.download.minecraft.net/f5/f57577fe6915175f9e4576e8d73ad4077a381433", "/sound3/mob/wolf/growl2.ogg");
        downloadResource("https://resources.download.minecraft.net/69/69ef2fe8d6a744689953fd692d0106b0b2d2a9ce", "/sound3/mob/wolf/growl3.ogg");
        downloadResource("https://resources.download.minecraft.net/84/84556bac99c01ad006552cf5d96494817e9b1700", "/sound3/mob/wolf/howl1.ogg");
        downloadResource("https://resources.download.minecraft.net/cd/cdb0293c5e2bdbda21798af4e61a4c171c8b1ec0", "/sound3/mob/wolf/howl2.ogg");
        downloadResource("https://resources.download.minecraft.net/71/71b5fc7aa050892f8c9a9ed2713cc1ad8874742a", "/sound3/mob/wolf/hurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/bc/bc2f6a5a1b6646eac1681b7414b098089aedf3c6", "/sound3/mob/wolf/hurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/a5/a5b3f3cdda4d6e13629ccd0e2a38e1f06baa491a", "/sound3/mob/wolf/hurt3.ogg");
        downloadResource("https://resources.download.minecraft.net/c2/c2e4001d9ae8fc1f066a914170faad4c45a84e1e", "/sound3/mob/wolf/panting.ogg");
        downloadResource("https://resources.download.minecraft.net/3d/3d95ea49e91b4295859b193bb41b009b92250a44", "/sound3/mob/wolf/shake.ogg");
        downloadResource("https://resources.download.minecraft.net/fc/fcf4f90c452b7b511d50e3959ae05036d13a7cf8", "/sound3/mob/wolf/whine.ogg");
        downloadResource("https://resources.download.minecraft.net/b6/b6a62224be809aa0c0747bee94499f0ee51ca2b6", "/sound3/mob/wolf/step1.ogg");
        downloadResource("https://resources.download.minecraft.net/4b/4ba55627b6b9ce64b4a48a00c990d5855b6064cf", "/sound3/mob/wolf/step2.ogg");
        downloadResource("https://resources.download.minecraft.net/30/30e920526eb5855065b873e30d17b4d85bfbe570", "/sound3/mob/wolf/step3.ogg");
        downloadResource("https://resources.download.minecraft.net/d7/d7d5be6092d00c2f7f68bdcbf10ea3ac3cfea30c", "/sound3/mob/wolf/step4.ogg");
        downloadResource("https://resources.download.minecraft.net/36/3610feb2a1a575026cfa3ab44965d114e74ea583", "/sound3/mob/wolf/step5.ogg");
        downloadResource("https://resources.download.minecraft.net/d5/d5b2d34e0c07a6c09c1adb17a15e50a626a88bc1", "/sound3/mob/zombie/metal1.ogg");
        downloadResource("https://resources.download.minecraft.net/6c/6c5a03460012d7b76c16d0dbaa01c443a6ba094e", "/sound3/mob/zombie/metal2.ogg");
        downloadResource("https://resources.download.minecraft.net/32/322374d89ed809e75005cdc4f6479c959e15aee2", "/sound3/mob/zombie/metal3.ogg");
        downloadResource("https://resources.download.minecraft.net/fa/fa73977dd28020544f7fe2553e5604a6865ec1a6", "/sound3/mob/zombie/wood1.ogg");
        downloadResource("https://resources.download.minecraft.net/dc/dc86fbd59cf0e87cd35b22df2a2df899ab8c1f7f", "/sound3/mob/zombie/wood2.ogg");
        downloadResource("https://resources.download.minecraft.net/81/8184e851170619de93aa56244fb12c472a2ddd7d", "/sound3/mob/zombie/wood3.ogg");
        downloadResource("https://resources.download.minecraft.net/10/1028d0a373790e14c34786a925c4656bdaeb4c4d", "/sound3/mob/zombie/wood4.ogg");
        downloadResource("https://resources.download.minecraft.net/4e/4e94ed53b6059d150c3bb2322b4af9ca9514bae1", "/sound3/mob/zombie/woodbreak.ogg");
        downloadResource("https://resources.download.minecraft.net/b5/b5bc9775243437d87317ab3a66ec8a4d5b96c83d", "/sound3/mob/zombie/say1.ogg");
        downloadResource("https://resources.download.minecraft.net/bf/bf5086623d5c6735271074b263116fb914ed79b5", "/sound3/mob/zombie/say2.ogg");
        downloadResource("https://resources.download.minecraft.net/7e/7eb3affa45f47f919e74523a55185e65c2081d12", "/sound3/mob/zombie/say3.ogg");
        downloadResource("https://resources.download.minecraft.net/6e/6e0488ab07b9539fbaebc093f194bb6a95b2caec", "/sound3/mob/zombie/death.ogg");
        downloadResource("https://resources.download.minecraft.net/f3/f35e14af35d1d12244dac9e655f4e31d4ef84e1b", "/sound3/mob/zombie/hurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/bc/bc85d96a99e84a234cbe23841f87e84e71198be3", "/sound3/mob/zombie/hurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/c1/c18fb5eacf0fdb33c05eb806bc41332cccee43d8", "/sound3/mob/zombie/infect.ogg");
        downloadResource("https://resources.download.minecraft.net/8e/8ed3945df8b9264c6451c153357475482d9f2066", "/sound3/mob/zombie/remedy.ogg");
        downloadResource("https://resources.download.minecraft.net/40/403c56cd190fb7587a26bcd1b7d2abac598c3ec0", "/sound3/mob/zombie/unfect.ogg");
        downloadResource("https://resources.download.minecraft.net/96/9680c9dcd637ddea8e10a0d73705aa155d04a132", "/sound3/mob/zombie/step1.ogg");
        downloadResource("https://resources.download.minecraft.net/e8/e8dcca0e494a3f479f58f581c9a8e297cc92f4e7", "/sound3/mob/zombie/step2.ogg");
        downloadResource("https://resources.download.minecraft.net/33/33acf13c25f65a432348e9476eda67d6a34831e3", "/sound3/mob/zombie/step3.ogg");
        downloadResource("https://resources.download.minecraft.net/69/69b6e589ec3d2c9063972545e83ed1f07e665094", "/sound3/mob/zombie/step4.ogg");
        downloadResource("https://resources.download.minecraft.net/b8/b88bd8618c05232a7287799ea9246ae12f5da9d5", "/sound3/mob/zombie/step5.ogg");
        downloadResource("https://resources.download.minecraft.net/ec/ec4b0396dd2fc2da8fab91ddc35218d3426349b3", "/sound3/mob/zombiepig/zpig1.ogg");
        downloadResource("https://resources.download.minecraft.net/2c/2cbbcdfb97939c469cd4ccaaac74504497c56695", "/sound3/mob/zombiepig/zpig2.ogg");
        downloadResource("https://resources.download.minecraft.net/c9/c9f7fa36ae48eca0a1f6ce024fde5d3472d30b4d", "/sound3/mob/zombiepig/zpig3.ogg");
        downloadResource("https://resources.download.minecraft.net/e1/e1187646b6256b92a1384f26ef2a7e56efcbe00d", "/sound3/mob/zombiepig/zpig4.ogg");
        downloadResource("https://resources.download.minecraft.net/ca/cadbc5c34979baab1a93f5cf68a50f9bd44ef5a8", "/sound3/mob/zombiepig/zpigangry1.ogg");
        downloadResource("https://resources.download.minecraft.net/03/0349ce87fe856ddf8fdd94a559bb29061b002b6c", "/sound3/mob/zombiepig/zpigangry2.ogg");
        downloadResource("https://resources.download.minecraft.net/e0/e0c88ca054666aae58b89abdcf377eae525aa13e", "/sound3/mob/zombiepig/zpigangry3.ogg");
        downloadResource("https://resources.download.minecraft.net/c7/c76dea473821e2ae9a1f006a4eddfdd0703eecdf", "/sound3/mob/zombiepig/zpigangry4.ogg");
        downloadResource("https://resources.download.minecraft.net/40/40b8e244d03ae17483edd4571bd851e10a97050f", "/sound3/mob/zombiepig/zpigdeath.ogg");
        downloadResource("https://resources.download.minecraft.net/a2/a2cfbea288280419ec0c8fb75d8ee5395536ac02", "/sound3/mob/zombiepig/zpighurt1.ogg");
        downloadResource("https://resources.download.minecraft.net/d1/d1917b9be91d60a40dd0bf804580c1f494e9ae6d", "/sound3/mob/zombiepig/zpighurt2.ogg");
        downloadResource("https://resources.download.minecraft.net/e2/e28d844995368de1d45c724a5d371c9952ae5ed4", "/sound3/note/bass.ogg");
        downloadResource("https://resources.download.minecraft.net/03/037b9fb7f74381f354739d015193dc4a6897f620", "/sound3/note/bassattack.ogg");
        downloadResource("https://resources.download.minecraft.net/1a/1afefaa39a53606d2737bab9cb3409350cb2dc9f", "/sound3/note/bd.ogg");
        downloadResource("https://resources.download.minecraft.net/46/46244605b8663a29cdce7bccc5b2d038241e32ee", "/sound3/note/harp.ogg");
        downloadResource("https://resources.download.minecraft.net/fd/fd2b6f745b05a2cf44a4e010f72631de2e5099f6", "/sound3/note/hat.ogg");
        downloadResource("https://resources.download.minecraft.net/20/20d06589bd5ab81a73989bdac8ca59ecd4d66932", "/sound3/note/pling.ogg");
        downloadResource("https://resources.download.minecraft.net/69/6967f0af60f480e81d32f1f8e5f88ccafec3a40c", "/sound3/note/snare.ogg");
        downloadResource("https://resources.download.minecraft.net/9a/9a20be18fed05330f745a54eb8aeba11aac5403b", "/sound3/portal/portal.ogg");
        downloadResource("https://resources.download.minecraft.net/43/43388701fac432a567fe9fec421521e6348ad780", "/sound3/portal/travel.ogg");
        downloadResource("https://resources.download.minecraft.net/30/301f32642b654addbd06a430768fead464fd24c4", "/sound3/portal/trigger.ogg");
        downloadResource("https://resources.download.minecraft.net/70/705a155201cc388a0c0c6f7435ddbc0fcc56b5f2", "/sound3/random/anvil_break.ogg");
        downloadResource("https://resources.download.minecraft.net/93/934b16e82b94d5790175615303594f0ec28da4a0", "/sound3/random/anvil_land.ogg");
        downloadResource("https://resources.download.minecraft.net/88/88a792430dfff97582ab49b8dc9477cd9d4e5ebb", "/sound3/random/anvil_use.ogg");
        downloadResource("https://resources.download.minecraft.net/87/87edc11141fb5a045f2ed830b545aaa73f96ee99", "/sound3/random/bow.ogg");
        downloadResource("https://resources.download.minecraft.net/78/78f034d58779fb4d22b00ea249015a0dbf4e7b3f", "/sound3/random/bowhit1.ogg");
        downloadResource("https://resources.download.minecraft.net/c3/c3cd0db760c980287b26ef9c0894f66c4250724e", "/sound3/random/bowhit2.ogg");
        downloadResource("https://resources.download.minecraft.net/03/0369a1236a4b9ca219fd3ad7d19d0b5237510b1e", "/sound3/random/bowhit3.ogg");
        downloadResource("https://resources.download.minecraft.net/9e/9e5e2369fc354a082c861494cfe8767d327813d4", "/sound3/random/bowhit4.ogg");
        downloadResource("https://resources.download.minecraft.net/8b/8bf3ecb0fe9a6a615f5995e3dd21b6c39adc21d5", "/sound3/random/break.ogg");
        downloadResource("https://resources.download.minecraft.net/dd/dd2f7209c2a58b0886beb34d49b0512b49adbb7e", "/sound3/random/breath.ogg");
        downloadResource("https://resources.download.minecraft.net/bd/bdc648e04933df8ddcccc84b375d6556776d4331", "/sound3/random/burp.ogg");
        downloadResource("https://resources.download.minecraft.net/05/056393a33a9633685c3dc3be2887f5cbd7dbc63f", "/sound3/random/chestclosed.ogg");
        downloadResource("https://resources.download.minecraft.net/18/186d5d9481d59cc99bc4be1b5fbb98d0ef877b8e", "/sound3/random/chestopen.ogg");
        downloadResource("https://resources.download.minecraft.net/9d/9d485556b89bf776042080774679c37300bc744b", "/sound3/random/classic_hurt.ogg");
        downloadResource("https://resources.download.minecraft.net/2f/2fe092579d9637e2d160319820ee08e60a237bb7", "/sound3/random/click.ogg");
        downloadResource("https://resources.download.minecraft.net/9e/9ea8a9e105321891bda18b9007b383b40aa7c076", "/sound3/random/door_close.ogg");
        downloadResource("https://resources.download.minecraft.net/5b/5bb5a04e776d69ca12b1d7bc369975f9bf62e741", "/sound3/random/door_open.ogg");
        downloadResource("https://resources.download.minecraft.net/85/857b75738992d25e338dee640ab191323bcbf798", "/sound3/random/drink.ogg");
        downloadResource("https://resources.download.minecraft.net/df/dfee39084c771182f6b9e7cfb8c8bc4e255747bc", "/sound3/random/eat1.ogg");
        downloadResource("https://resources.download.minecraft.net/d2/d26bde554d88f0ca156baf471c44ce2c0e68176c", "/sound3/random/eat2.ogg");
        downloadResource("https://resources.download.minecraft.net/9f/9f2c4bab5ed55f1714fffa223985c81babc8f6c0", "/sound3/random/eat3.ogg");
        downloadResource("https://resources.download.minecraft.net/cd/cd46e41023887558b134547e28327de6e7df189a", "/sound3/random/explode1.ogg");
        downloadResource("https://resources.download.minecraft.net/a1/a116e396d95a0ee245000dd4cdcc333d38ea9e3b", "/sound3/random/explode2.ogg");
        downloadResource("https://resources.download.minecraft.net/a9/a94a69e56568f5789cab05382cfd81f601189fd1", "/sound3/random/explode3.ogg");
        downloadResource("https://resources.download.minecraft.net/f2/f259be40364341edcaf88e339bc24ab01e49845a", "/sound3/random/explode4.ogg");
        downloadResource("https://resources.download.minecraft.net/c6/c649e60ea9a99c97501a50d2dc4e579343e91ea8", "/sound3/random/fizz.ogg");
        downloadResource("https://resources.download.minecraft.net/a9/a92ba2b8f6abc41aa8d679ad808a81d0aafa04b2", "/sound3/random/fuse.ogg");
        downloadResource("https://resources.download.minecraft.net/72/7274a2231ed4544a37e599b7b014e589e5377094", "/sound3/random/glass1.ogg");
        downloadResource("https://resources.download.minecraft.net/87/87c47bda3645c68f18a49e83cbf06e5302d087ff", "/sound3/random/glass2.ogg");
        downloadResource("https://resources.download.minecraft.net/ad/ad7d770b7fff3b64121f75bd60cecfc4866d1cd6", "/sound3/random/glass3.ogg");
        downloadResource("https://resources.download.minecraft.net/9d/9d52e43288d7f9e4d14199368a0f30ae3570d05a", "/sound3/random/levelup.ogg");
        downloadResource("https://resources.download.minecraft.net/e9/e9833a1512b57bcf88ac4fdcc8df4e5a7e9d701d", "/sound3/random/orb.ogg");
        downloadResource("https://resources.download.minecraft.net/8f/8f45b5faf6dfae2065846d26612f7552b73640dd", "/sound3/random/pop.ogg");
        downloadResource("https://resources.download.minecraft.net/22/22a491f266f5c3cdd6e669a9493daaf40c9c8575", "/sound3/random/splash.ogg");
        downloadResource("https://resources.download.minecraft.net/e9/e9833a1512b57bcf88ac4fdcc8df4e5a7e9d701d", "/sound3/random/successful_hit.ogg");
        downloadResource("https://resources.download.minecraft.net/b2/b210a3c371441b77fe873133b2cb7b63e367b2f3", "/sound3/random/wood_click.ogg");
        downloadResource("https://resources.download.minecraft.net/b2/b210a3c371441b77fe873133b2cb7b63e367b2f3", "/sound3/random/wood click.ogg");
        downloadResource("https://resources.download.minecraft.net/5f/5fd568d724ba7d53911b6cccf5636f859d2662e8", "/sound3/step/cloth1.ogg");
        downloadResource("https://resources.download.minecraft.net/56/56c1d0ac0de2265018b2c41cb571cc6631101484", "/sound3/step/cloth2.ogg");
        downloadResource("https://resources.download.minecraft.net/9c/9c63f2a3681832dc32d206f6830360bfe94b5bfc", "/sound3/step/cloth3.ogg");
        downloadResource("https://resources.download.minecraft.net/55/55da1856e77cfd31a7e8c3d358e1f856c5583198", "/sound3/step/cloth4.ogg");
        downloadResource("https://resources.download.minecraft.net/22/227ab99bf7c6cf0b2002e0f7957d0ff7e5cb0c96", "/sound3/step/grass1.ogg");
        downloadResource("https://resources.download.minecraft.net/5c/5c971029d9284676dce1dda2c9d202f8c47163b2", "/sound3/step/grass2.ogg");
        downloadResource("https://resources.download.minecraft.net/76/76de0a736928eac5003691d73bdc2eda92116198", "/sound3/step/grass3.ogg");
        downloadResource("https://resources.download.minecraft.net/bc/bc28801224a0aa77fdc93bb7c6c94beacdf77331", "/sound3/step/grass4.ogg");
        downloadResource("https://resources.download.minecraft.net/81/813ebd91b9c3fe1ac8f89f13c85d0755678f2165", "/sound3/step/grass5.ogg");
        downloadResource("https://resources.download.minecraft.net/b8/b88cafe403394cdcd4de0e3aeb7b76f24170c6fe", "/sound3/step/grass6.ogg");
        downloadResource("https://resources.download.minecraft.net/1d/1d761cb3bcb45498719e4fba0751e1630e134f1a", "/sound3/step/gravel1.ogg");
        downloadResource("https://resources.download.minecraft.net/ac/ac7a7c8d106e26abc775b1b46150c083825d8ddc", "/sound3/step/gravel2.ogg");
        downloadResource("https://resources.download.minecraft.net/c1/c109b985a7e6d5d3828c92e00aefa49deca0eb8c", "/sound3/step/gravel3.ogg");
        downloadResource("https://resources.download.minecraft.net/a4/a47adece748059294c5f563c0fcac02fa0e4bab4", "/sound3/step/gravel4.ogg");
        downloadResource("https://resources.download.minecraft.net/d6/d6212a1d5feb88d76b9a83ce5a27ab4e6d4c20bb", "/sound3/step/ladder1.ogg");
        downloadResource("https://resources.download.minecraft.net/fd/fd446ad40d24edfe4fb789a6065276e164ea4b61", "/sound3/step/ladder2.ogg");
        downloadResource("https://resources.download.minecraft.net/3f/3fee58d7b2c99ddbce962618176637574ae8d67b", "/sound3/step/ladder3.ogg");
        downloadResource("https://resources.download.minecraft.net/f7/f78ede81160002fc0561218c7ecd97e91cccab7c", "/sound3/step/ladder4.ogg");
        downloadResource("https://resources.download.minecraft.net/e9/e9a1caaddcde79cdac7aa8eabde50d4cfd1bc578", "/sound3/step/ladder5.ogg");
        downloadResource("https://resources.download.minecraft.net/98/9813c8185197f4a4296649f27a9d738c4a6dfc78", "/sound3/step/sand1.ogg");
        downloadResource("https://resources.download.minecraft.net/bd/bd1750c016f6bab40934eff0b0fb64c41c86e44b", "/sound3/step/sand2.ogg");
        downloadResource("https://resources.download.minecraft.net/ab/ab07279288fa49215bada5c17627e6a54ad0437c", "/sound3/step/sand3.ogg");
        downloadResource("https://resources.download.minecraft.net/a4/a474236fb0c75bd65a6010e87dbc000d345fc185", "/sound3/step/sand4.ogg");
        downloadResource("https://resources.download.minecraft.net/9f/9fd6d2c633d276b952f2ff2aaa1fa7e5fb5efd2a", "/sound3/step/sand5.ogg");
        downloadResource("https://resources.download.minecraft.net/e9/e9bab7d3d15541f0aaa93fad31ad37fd07e03a6c", "/sound3/step/snow1.ogg");
        downloadResource("https://resources.download.minecraft.net/58/5887d10234c4f244ec5468080412f3e6ef9522f3", "/sound3/step/snow2.ogg");
        downloadResource("https://resources.download.minecraft.net/a4/a4bc069321a96236fde04a3820664cc23b2ea619", "/sound3/step/snow3.ogg");
        downloadResource("https://resources.download.minecraft.net/e2/e26fa3036cdab4c2264ceb19e1cd197a2a510227", "/sound3/step/snow4.ogg");
        downloadResource("https://resources.download.minecraft.net/4a/4a2e3795ffd4d3aab0834b7e41903af3a8f7d197", "/sound3/step/stone1.ogg");
        downloadResource("https://resources.download.minecraft.net/22/22a383d9c22342305a4f16fec0bb479a885f8da2", "/sound3/step/stone2.ogg");
        downloadResource("https://resources.download.minecraft.net/a5/a533e7ae975e62592de868e0d0572778614bd587", "/sound3/step/stone3.ogg");
        downloadResource("https://resources.download.minecraft.net/d5/d5218034051a13322d7b5efc0b5a9af739615f04", "/sound3/step/stone4.ogg");
        downloadResource("https://resources.download.minecraft.net/48/48dd05ab2e4626d74206c2b09a628a3d59ce15e9", "/sound3/step/stone5.ogg");
        downloadResource("https://resources.download.minecraft.net/c4/c4810a3de80cb57f9cdf8deaacfd36cb619cdf0b", "/sound3/step/stone6.ogg");
        downloadResource("https://resources.download.minecraft.net/af/afb01196e2179e3b15b48f3373cea4c155d56b84", "/sound3/step/wood1.ogg");
        downloadResource("https://resources.download.minecraft.net/1e/1e82a43c30cf8fcbe05d0bc2760ecba5d2320314", "/sound3/step/wood2.ogg");
        downloadResource("https://resources.download.minecraft.net/27/27722125968ac60c0f191a961b17e406f1351c6e", "/sound3/step/wood3.ogg");
        downloadResource("https://resources.download.minecraft.net/29/29586f60bfe6f521dbc748919d4f0dc5b28beefd", "/sound3/step/wood4.ogg");
        downloadResource("https://resources.download.minecraft.net/85/85ff970401cb1ef2e812f943077ab96549315d0a", "/sound3/step/wood5.ogg");
        downloadResource("https://resources.download.minecraft.net/94/944bc8b8e1e135340dc4afc6d3416a01222674a1", "/sound3/step/wood6.ogg");
        downloadResource("https://resources.download.minecraft.net/59/594be3eaea9a2b92095eeeb3b1e01e755dcb8ce2", "/sound3/tile/piston/in.ogg");
        downloadResource("https://resources.download.minecraft.net/cb/cb017131516de9359cb81fb991f5b3694044f8db", "/sound3/tile/piston/out.ogg");
    }

    public static void streaming()
    {
        downloadResource("https://resources.download.minecraft.net/d5/d5ce66b3787648036b29c504786bcc237cd316d3", "/streaming/11.mus");
        downloadResource("https://resources.download.minecraft.net/c3/c343dc04df647fb25bec35ee23dc973e7374dcf9", "/streaming/13.mus");
        downloadResource("https://resources.download.minecraft.net/9c/9cbed0e40296f68c61090c9b81816061e068a0ec", "/streaming/13.ogg");
        downloadResource("https://resources.download.minecraft.net/ea/eaf1d4879f3bf6f5f60ba01f475dc581c641b4ae", "/streaming/blocks.mus");
        downloadResource("https://resources.download.minecraft.net/be/bea1c181fce1150f3aaea8f14a773394ccc253d2", "/streaming/cat.mus");
        downloadResource("https://resources.download.minecraft.net/d1/d1eb3d2e39bf1f6289cfcbca44e1c9bb508b20f0", "/streaming/cat.ogg");
        downloadResource("https://resources.download.minecraft.net/d6/d639bf7f0516e5e363fe5db2aa150cedd38de19a", "/streaming/chirp.mus");
        downloadResource("https://resources.download.minecraft.net/21/21c9b7c6b486247322051f90aa964f161edc78d8", "/streaming/far.mus");
        downloadResource("https://resources.download.minecraft.net/87/872d3d24452ff2155bb6be4a14c103e4451e6416", "/streaming/mall.mus");
        downloadResource("https://resources.download.minecraft.net/7c/7c5b628070ce191762b972fc3a58d57bc10a628a", "/streaming/mellohi.mus");
        downloadResource("https://resources.download.minecraft.net/a0/a01e4caf7aaac61502a4a5e4f277b0de4795b802", "/streaming/stal.mus");
        downloadResource("https://resources.download.minecraft.net/bc/bcadae10578ff321236f5670934f0b287eb80fbc", "/streaming/strad.mus");
        downloadResource("https://resources.download.minecraft.net/a9/a96c409e8d54d95520cf6d2caa583b5667e2dc63", "/streaming/wait.mus");
        downloadResource("https://resources.download.minecraft.net/b2/b245effde68d07ffe32a033b61e96f1ed7e28783", "/streaming/ward.mus");
        downloadResource("https://resources.download.minecraft.net/85/854ff331487394ba83ca273ff73de525fbefcb25", "/streaming/where are we now.mus");
    }

    public static void downloadResource(String url, String file)
    {
        String filePath = resourcesDir + file;
        if (url.contains("minecraft.net"))
        {
            dlSource = "Mojang";
        } else
        {
            dlSource = "an unknown source";
        }

        BufferedInputStream bufferedIS = null;
        FileOutputStream fileOS = null;

        try
        {
            File newFile = new File(filePath);
            if (newFile.exists())
            {
                downloadMonitor.updateProgressString("/resources" + file + " found.", new Object[0]);
                ++progressPerc;
                downloadMonitor.updateProgress((int)((double)progressPerc / 747.0D * 100.0D));
                return;
            }

            if (!newFile.getParentFile().exists())
            {
                newFile.getParentFile().mkdirs();
            }

            newFile.createNewFile();
            downloadMonitor.updateProgressString("Downloading /resources" + file + "...", new Object[0]);
            LOG.info("[resourcefixer] Downloading /resources" + file + " from " + dlSource + "...");
            ++missingCount;
            ++progressPerc; //moved in case download fails, the progress bar doesn't look lower than it should.
            URL urlObj = new URL(url);
            bufferedIS = new BufferedInputStream(urlObj.openStream());
            fileOS = new FileOutputStream(filePath);

            for(int data = bufferedIS.read(); data != -1; data = bufferedIS.read())
            {
                fileOS.write(data);
            }

            ++downloadCount;
            downloadMonitor.updateProgress((int)((double)progressPerc / 747.0D * 100.0D));
        } catch (MalformedURLException e)
        {
            LOG.severe("Unable to download resource " + file);
            e.printStackTrace();
        } catch (IOException e)
        {
            LOG.severe("Unable to download resource " + file);
            e.printStackTrace();
        } finally {
            try {
                if (fileOS != null)
                {
                    fileOS.close();
                }
            } catch (IOException e)
            {
                LOG.severe("Unable to download resource " + file);
                e.printStackTrace();
            }

            try {
                if (bufferedIS != null)
                {
                    bufferedIS.close();
                }
            } catch (IOException e)
            {
                LOG.severe("Unable to download resource " + file);
                e.printStackTrace();
            }

        }

    }

    static {
        resourcesDir = System.getProperty("user.dir") + File.separator + "resources";
        LOG = ModLoader.getLogger();
    }

	
}
