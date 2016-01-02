package com.cryslo.cryslo_tools.events;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Event;

import java.util.Optional;

/**
 * Created by Ross Edlin on 01/01/2016.
 */
public class _Event
{
    /**
     * Gets the player object
     *
     * @param event
     * @return
     */
    protected Player getPlayer(Event event)
    {
        Optional<Player> optional = event.getCause().first(Player.class);
        if(!optional.isPresent()) return null;

        return optional.get();
    }
}
