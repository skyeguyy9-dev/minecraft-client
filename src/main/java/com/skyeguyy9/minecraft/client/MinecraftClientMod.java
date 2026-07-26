package com.skyeguyy9.minecraft.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftClientMod {
    public static final String MOD_ID = "minecraft_client_mod";
    public static final String MOD_NAME = "Minecraft Client Mod";
    public static final String MOD_VERSION = "1.0.0";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        LOGGER.info("========================================");
        LOGGER.info("Initializing {} v{}", MOD_NAME, MOD_VERSION);
        LOGGER.info("Minecraft 1.20.1 Fabric Mod");
        LOGGER.info("========================================");
        
        ModFeatures.registerFeatures();
        ModCommands.registerCommands();
        
        LOGGER.info("Mod initialized successfully!");
    }
}