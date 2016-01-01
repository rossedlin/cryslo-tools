package com.cryslo.cryslo_tools;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandManager;
import org.spongepowered.api.event.EventListener;
import org.spongepowered.api.event.EventManager;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.block.ChangeBlockEvent;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;

/**
 * Created by Ross Edlin on 01/01/2016.
 */
@Plugin(id = "cryslo_tools", name = "Cryslo Tools", version = "1.0")
public class CrysloTools
{
    @Inject
    private static Logger logger;
    private static Game game;
    private static PluginContainer plugin;

    /**
     * @param logger
     */
    @Inject
    private void setLogger(Logger logger)
    {
        CrysloTools.logger = logger;
    }

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
     * @param event
     */
    @Listener
    public void onPreInitialization(GamePreInitializationEvent event)
    {
        getLogger().info("Cryslo Tools - onPreInitialization");
        game = Sponge.getGame();
        plugin = getGame().getPluginManager().getPlugin("cryslo_tools").get();
        logger = getGame().getPluginManager().getLogger(plugin);
    }

    /**
     *
     * @param event
     */
    @Listener
    public void onInitialization(GameInitializationEvent event)
    {
        getLogger().info("Cryslo Tools - onInitialization");

        EventListener<ChangeBlockEvent.Break> listener = new onBlockChange();
        game.getEventManager().registerListener(this, ChangeBlockEvent.Break.class, listener);
    }

    /**
     *
     * @param event
     */
    @Listener
    public void onServerStart(GameStartedServerEvent event)
    {
        getLogger().info("Cryslo Tools - onServerStart1");
    }

    public static Game getGame() {
        return game;
    }
}