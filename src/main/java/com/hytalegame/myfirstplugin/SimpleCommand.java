package com.hytalegame.myfirstplugin;

import com.hypixel.hytale.protocol.GameMode;
import com.hypixel.hytale.server.core.command.system.AbstractCommand;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.Message;
import java.util.concurrent.CompletableFuture;

public class SimpleCommand extends AbstractCommand {

    public SimpleCommand() {
        super("myplugin", "Displays a welcome message.");
        this.setPermissionGroup(GameMode.Adventure);
    }

    @Override
    protected CompletableFuture<Void> execute(CommandContext context) {
        context.sender().sendMessage(Message.raw("Congrats! Your plugin works!"));
        return null;
    }
}