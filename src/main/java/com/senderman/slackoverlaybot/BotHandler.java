package com.senderman.slackoverlaybot;

import com.senderman.slackoverlaybot.config.BotConfig;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@SpringBootApplication
public class BotHandler extends com.annimon.tgbotsmodule.BotHandler {

    private final BotConfig botConfig;

    public BotHandler(BotConfig botConfig) {
        this.botConfig = botConfig;
    }

    @Override
    protected BotApiMethod<?> onUpdate(@NotNull Update update) {
        return null;
    }

    @Override
    public String getBotUsername() {
        return botConfig.username();
    }

    @Override
    public String getBotToken() {
        return botConfig.token();
    }
}
