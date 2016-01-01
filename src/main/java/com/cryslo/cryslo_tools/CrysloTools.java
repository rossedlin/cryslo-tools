package com.cryslo.cryslo_tools;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

/**
 * Created by rosse on 01/01/2016.
 */
@Plugin(id = "cryslo_tools", name = "Cryslo Tools", version = "1.0")
public class CrysloTools
{
    @Inject
    private Logger logger;

    /**
     * @param Logger logger
     */
    @Inject
    private void setLogger(Logger logger)
    {
        this.logger = logger;
    }

    /**
     *
     * @return Logger
     */
    public Logger getLogger()
    {
        return logger;
    }

    /**
     *
     * @param GameStartedServerEvent event
     */
    @Listener
    public void onServerStart(GameStartedServerEvent event)
    {
        getLogger().info("Cryslo Tools - Started");
    }
}
