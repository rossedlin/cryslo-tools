package com.cryslo.cryslo_tools.events;

import com.cryslo.cryslo_tools.CrysloTools;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.block.ChangeBlockEvent;

/**
 * Created by Ross Edlin on 01/01/2016.
 */
public class BlockChangeEvent extends _Event
{
    @Listener
    public void onBlockPlace(ChangeBlockEvent.Place event)
    {
        Player player = getPlayer(event);

        if (player instanceof Player)
        {
            CrysloTools.getLogger().info(player.getName());
            event.setCancelled(true);
            return;
        }
    }
}
