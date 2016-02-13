package com.cryslo.cryslo_tools.events;

import com.cryslo.cryslo_tools.Utils;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.block.ChangeBlockEvent;
import org.spongepowered.api.text.Text;

/**
 * Created by Ross Edlin on 01/01/2016.
 */
public class BlockChangeEvent
{
    @Listener
    public void onBlockPlace(ChangeBlockEvent.Place event)
    {
        Player player = Utils.getPlayer(event);

        if (player != null)
        {
            if (player.isOnline())
            {
//                event.getTransactions().get(0).getFinal().getState().getType().getName();
                if (event.getTransactions().get(0).getFinal().getState().getType().equals(BlockTypes.MELON_STEM))
                {
                    player.sendMessage(Text.of("Melons are disabled on this server"));
                    event.setCancelled(true);
                    return;
                }
            }
        }
    }

//    @Listener
//    public void onBlockInteract(InteractBlockEvent event)
//    {
//        Player player = Utils.getPlayer(event);
//
//        if (player != null)
//        {
//            if (player.isOnline())
//            {
//                if (event.getTargetBlock().getState().getType().equals(BlockTypes.DIRT))
//                {
//                    player.sendMessage(Text.of("onBlockInteract " + player.getName()));
//                }
//            }
//        }
//    }
}
