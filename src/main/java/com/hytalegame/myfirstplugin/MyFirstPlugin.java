package com.hytalegame.myfirstplugin;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;

import java.util.logging.Level;
import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

import javax.annotation.Nonnull;

public class MyFirstPlugin extends JavaPlugin {
    private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();

    public MyFirstPlugin(@Nonnull JavaPluginInit init) {
        super(init);
        LOGGER.atInfo().log("Hello from " + this.getName() + " version " + this.getManifest().getVersion().toString());
    }

    @Override
    public void start() {
        // Called when the plugin starts
        getLogger().at(Level.INFO).log("MyFirstPlugin has started successfully!");

        // Registering the command (see Step 4)
        getCommandRegistry().registerCommand(new SimpleCommand());
    }

    @Override
    public void shutdown() {
        getLogger().at(Level.INFO).log("Plugin stopping.");
    }
}