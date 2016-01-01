package com.cryslo.cryslo_tools.events;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Event;

import java.util.Optional;

/**
 * Created by Ross Edlin on 01/01/2016.
 */
public class _Event
{
    private Player player;

    /**
     * Retrieves the player object from the event
     *
     * @param event
     * @return
     */
    protected boolean retrievePlayer(Event event)
    {
        Optional<Player> optional = event.getCause().first(Player.class);
        if(!optional.isPresent()) return false;

        player = optional.get();
        return true;
    }

    /**
     * Gets the player object
     *
     * @return
     */
    protected Player getPlayer()
    {
        return player;
    }
}
