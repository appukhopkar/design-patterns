package com.design.patterns.chain.of.responsibility;

public class ConcreteRequest implements Request {
    private String content;
    public ConcreteRequest(String content) {
        this.content = content;
    }
    @Override
    public String getContent() {
        return content;
    }
}
