package com.cryslo.cryslo_tools;

import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.plugin.PluginContainer;

/**
 * Created by Ross Edlin on 03/01/2016.
 */
final public class Registry
{
    private static Logger logger;
    private static Game game;
    private static PluginContainer plugin;

    public static Logger getLogger()
    {
        return logger;
    }

    public static void setLogger(Logger logger)
    {
        Registry.logger = logger;
    }

    public static Game getGame()
    {
        return game;
    }

    public static void setGame(Game game)
    {
        Registry.game = game;
    }

    public static PluginContainer getPlugin()
    {
        return plugin;
    }

    public static void setPlugin(PluginContainer plugin)
    {
        Registry.plugin = plugin;
    }
}
