package dev.rootnet.freeedition;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FreeEditionEvent {

    @SubscribeEvent
    public static void overlay(RenderGameOverlayEvent.Post event) {
        if (event.getType() != RenderGameOverlayEvent.ElementType.EXPERIENCE) return;
        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("rootNET Free Edition", 2, 2, 0x00FF00);
    }

}
