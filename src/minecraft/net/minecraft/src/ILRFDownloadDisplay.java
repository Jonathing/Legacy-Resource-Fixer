package net.minecraft.src;

public interface ILRFDownloadDisplay
{
    void resetProgress(int sizeGuess);

    void setPokeThread(Thread currentThread);

    void updateProgress(int fullLength);

    boolean shouldStopIt();

    void updateProgressString(String string, Object... data);

    Object makeDialog();

    void makeHeadless();
}