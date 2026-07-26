package com.skyeguyy9.minecraft.client;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientEventHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger("ClientEventHandler");

    public static void registerEvents() {
        LOGGER.info("Registering client events...");
        
        // Register client tick event
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player != null) {
                // Tick logic here
            }
        });
        
        // Register HUD render event
        HudRenderCallback.EVENT.register((guiGraphics, partialTick) -> {
            // HUD rendering logic here
        });
        
        LOGGER.info("Client events registered");
    }
}