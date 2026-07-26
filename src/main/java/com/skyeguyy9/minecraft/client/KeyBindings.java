package com.skyeguyy9.minecraft.client;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KeyBindings {
    private static final Logger LOGGER = LoggerFactory.getLogger("KeyBindings");

    private static KeyBinding toggleHUDKey;
    private static KeyBinding openSettingsKey;

    public static void register() {
        LOGGER.info("Registering key bindings...");
        
        // Register toggle HUD key (V)
        toggleHUDKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.mcclient.toggle_hud",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_V,
            "category.mcclient.main"
        ));
        
        // Register open settings key (U)
        openSettingsKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.mcclient.open_settings",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_U,
            "category.mcclient.main"
        ));
        
        LOGGER.info("Key bindings registered");
    }

    public static KeyBinding getToggleHUDKey() {
        return toggleHUDKey;
    }

    public static KeyBinding getOpenSettingsKey() {
        return openSettingsKey;
    }
}