package com.example.demo;

public class SomeThing {

    private final long id;
    private final String content;

    public SomeThing(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}