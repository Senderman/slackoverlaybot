package com.senderman.slackoverlaybot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBotConfig implements BotConfig {

    private final String token;
    private final String username;

    public SpringBotConfig(
            @Value("${token}") String token,
            @Value("${username}") String username) {
        this.token = token;
        this.username = username;
    }

    @Override
    public String token() {
        return token;
    }

    @Override
    public String username() {
        return username;
    }
}
