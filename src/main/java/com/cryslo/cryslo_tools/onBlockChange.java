package com.cryslo.cryslo_tools;

//import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.EventListener;
import org.spongepowered.api.event.block.ChangeBlockEvent;

/**
 * Created by rosse on 01/01/2016.
 */
public class onBlockChange implements EventListener<ChangeBlockEvent.Break>
{
    @Override
    public void handle(ChangeBlockEvent.Break event) throws Exception
    {
//        CrysloTools.getLogger().info("Cryslo Tools - ChangeBlockEvent");
        event.setCancelled(true);
//        CrysloTools.getLogger().info(event.toString());
    }
}