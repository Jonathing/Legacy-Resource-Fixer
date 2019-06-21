package me.jonathing.minecraft.resourcefixer;

import java.util.logging.Logger;

import net.minecraft.src.ModLoader;

public class ModLogger {
    private String loggerName;
    private Logger logInstance;

    ModLogger(final String loggerName) {
        this.loggerName = loggerName;
        this.logInstance = ModLoader.getLogger();
    }

    public void error(final String logMessage, Object... logArguments) {
        logInstance.severe("[resourcefixer] " + String.format(logMessage, logArguments));
    }

    public void warn(final String logMessage, Object... logArguments) {
        logInstance.warning("[resourcefixer] " + String.format(logMessage, logArguments));
    }

    public void info(final String logMessage, Object... logArguments) {
        logInstance.info("[resourcefixer] " + String.format(logMessage, logArguments));
    }
}