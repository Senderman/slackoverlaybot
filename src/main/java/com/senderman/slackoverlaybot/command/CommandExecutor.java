package com.senderman.slackoverlaybot.command;

import com.annimon.tgbotsmodule.commands.TextCommand;
import com.annimon.tgbotsmodule.commands.authority.For;

import java.util.EnumSet;

public interface CommandExecutor extends TextCommand {

    @Override
    default EnumSet<For> authority() {
        return EnumSet.of(For.USER);
    }
}
