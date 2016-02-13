package com.cryslo.cryslo_tools;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Event;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

import java.util.Optional;

/**
 * Created by Ross Edlin on 03/01/2016.
 */
public class Utils
{
    /**
     * Gets the player object
     *
     * @param event
     * @return
     */
    public static Player getPlayer(Event event)
    {
        Optional<Player> optional = event.getCause().first(Player.class);
        if(!optional.isPresent()) return null;

        return optional.get();
    }

    /**
     *
     * @param worldName
     * @param posX
     * @param posY
     * @param posZ
     * @return
     */
    public Location<World> getBlockAt(String worldName, int posX, int posY, int posZ)
    {
        World world = Registry.getGame().getServer().getWorld(worldName).get();
        Location<World> blockLoc = new Location<World>(world, posX, posY, posZ);

        return blockLoc;
    }
}
