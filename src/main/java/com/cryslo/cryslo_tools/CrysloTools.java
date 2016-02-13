package com.cryslo.cryslo_tools;

import com.cryslo.cryslo_tools.events.BlockChangeEvent;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

/**
 * Created by Ross Edlin on 01/01/2016.
 */
@Plugin(id = CrysloTools.ID, name = CrysloTools.NAME, version = CrysloTools.VERSION)
public class CrysloTools
{
    public static final String ID = "cryslo_tools";
    public static final String NAME = "Cryslo Tools";
    public static final String VERSION = "1.0";

    /**
     *
     * @param event
     */
    @Listener
    public void onPreInitialization(GamePreInitializationEvent event)
    {
        Registry.setGame(Sponge.getGame());
        Registry.setPlugin(Registry.getGame().getPluginManager().getPlugin(CrysloTools.ID).get());
        Registry.setLogger(Registry.getGame().getPluginManager().getLogger(Registry.getPlugin()));
    }

    /**
     *
     * @param event
     */
    @Listener
    public void onServerStart(GameStartedServerEvent event)
    {
        Registry.getGame().getEventManager().registerListeners(this, new BlockChangeEvent());
    }
}