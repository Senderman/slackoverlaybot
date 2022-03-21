package com.senderman.slackoverlaybot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;

import java.util.Objects;

@TypeAlias("threadMember")
public class ThreadMember {

    @Id
    private String id;
    private long userId;
    private String threadId;

    public ThreadMember() {
    }

    public ThreadMember(long userId, String threadId) {
        this.userId = userId;
        this.threadId = threadId;
        this.id = generateId(userId, threadId);
    }

    public static String generateId(long userId, String threadId) {
        return userId + " " + threadId;
    }

    public long getUserId() {
        return userId;
    }

    public String getThreadId() {
        return threadId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThreadMember that = (ThreadMember) o;
        return userId == that.userId && threadId.equals(that.threadId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, threadId);
    }
}
