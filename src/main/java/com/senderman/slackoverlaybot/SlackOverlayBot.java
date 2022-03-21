package com.senderman.slackoverlaybot;

import com.annimon.tgbotsmodule.BotModule;
import com.annimon.tgbotsmodule.Runner;
import com.annimon.tgbotsmodule.beans.Config;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.SpringApplication;

import java.util.List;

public class SlackOverlayBot implements BotModule {

    public static void main(String[] args) {
        Runner.run("", List.of(new SlackOverlayBot()));
    }

    @Override
    public @NotNull BotHandler botHandler(@NotNull Config config) {
        var handlerClass = com.senderman.slackoverlaybot.BotHandler.class;
        var content = SpringApplication.run(handlerClass);
        return content.getBean(handlerClass);
    }
}
