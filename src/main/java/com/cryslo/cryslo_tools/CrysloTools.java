package com.cryslo.cryslo_tools;

import com.cryslo.cryslo_tools.events.BlockChangeEvent;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;

/**
 * Created by Ross Edlin on 01/01/2016.
 */
@Plugin(id = CrysloTools.ID, name = CrysloTools.NAME, version = CrysloTools.VERSION)
public class CrysloTools
{
    public static final String ID = "cryslo_tools";
    public static final String NAME = "Cryslo Tools";
    public static final String VERSION = "1.0";

    private static Logger logger;
    private static Game game;
    private static PluginContainer plugin;

    /**
     *
     * @return Logger
     */
    public static Logger getLogger()
    {
        return logger;
    }

    /**
     *
     * @return
     */
    public static Game getGame() {
        return game;
    }

    /**
     *
     * @param event
     */
    @Listener
    public void onPreInitialization(GamePreInitializationEvent event)
    {
        game = Sponge.getGame();
        plugin = getGame().getPluginManager().getPlugin(CrysloTools.ID).get();
        logger = getGame().getPluginManager().getLogger(plugin);
    }

    /**
     *
     * @param event
     */
    @Listener
    public void onServerStart(GameStartedServerEvent event)
    {
        getLogger().info("Cryslo Tools - onServerStart");

        game.getEventManager().registerListeners(this, new BlockChangeEvent());
    }
}