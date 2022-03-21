package com.senderman.slackoverlaybot;

import com.annimon.tgbotsmodule.commands.CommandRegistry;
import com.annimon.tgbotsmodule.commands.authority.Authority;
import com.annimon.tgbotsmodule.commands.authority.For;
import com.senderman.slackoverlaybot.command.CommandExecutor;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class CommandUpdateHandler extends CommandRegistry<For> {

    public CommandUpdateHandler(
            @NotNull BotHandler handler,
            @NotNull Authority<For> authority,
            Set<CommandExecutor> commands
    ) {
        super(handler, authority);

        splitCallbackCommandByWhitespace();
        commands.forEach(this::register);
    }
}
