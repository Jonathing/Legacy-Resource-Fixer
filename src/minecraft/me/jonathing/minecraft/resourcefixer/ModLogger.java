package me.jonathing.minecraft.resourcefixer;

import java.util.logging.Logger;

public class ModLogger
{
    private String loggerName;
    private Logger logInstance;

    ModLogger(final String loggerName)
    {
        this.loggerName = loggerName;
        this.logInstance = Logger.getLogger(loggerName);
    }

    public void error(final String logMessage, Object... logArguments)
    {
        logInstance.severe(String.format(logMessage, logArguments));
    }

    public void warn(final String logMessage, Object... logArguments)
    {
        logInstance.warning(String.format(logMessage, logArguments));
    }

    public void info(final String logMessage, Object... logArguments)
    {
        logInstance.info(String.format(logMessage, logArguments));
    }
}