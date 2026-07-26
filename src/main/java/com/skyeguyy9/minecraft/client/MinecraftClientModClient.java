package com.skyeguyy9.minecraft.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftClientModClient implements ClientModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger("MinecraftClientModClient");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Initializing client-side features for Minecraft Client Mod");
        
        // Register client events
        ClientEventHandler.registerEvents();
        
        // Register client commands
        ClientCommands.registerCommands();
        
        // Register key bindings
        KeyBindings.register();
        
        LOGGER.info("Client-side features loaded");
    }
}