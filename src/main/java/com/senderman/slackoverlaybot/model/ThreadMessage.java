package com.senderman.slackoverlaybot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;

import java.util.Objects;

@TypeAlias("threadMessage")
public class ThreadMessage {

    @Id
    private String id;
    private int messageId;
    private String threadId;

    public ThreadMessage() {
    }

    public ThreadMessage(int messageId, String threadId) {
        this.messageId = messageId;
        this.threadId = threadId;
        this.id = generateId(messageId, threadId);
    }

    public static String generateId(int messageId, String threadId) {
        return messageId + " " + threadId;
    }

    public int getMessageId() {
        return messageId;
    }

    public String getThreadId() {
        return threadId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThreadMessage that = (ThreadMessage) o;
        return messageId == that.messageId && threadId.equals(that.threadId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, threadId);
    }
}
