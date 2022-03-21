package com.senderman.slackoverlaybot;

import com.annimon.tgbotsmodule.commands.authority.Authority;
import com.annimon.tgbotsmodule.commands.authority.For;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

import java.util.EnumSet;

@Component
public class BotAuthority implements Authority<For> {

    @Override
    public boolean hasRights(Update update, User user, EnumSet<For> fors) {
        return true;
    }
}
