package com.design.patterns.chain.of.responsibility;

public interface Handler {
    void process(Request request);
    boolean canProcess(Request request);
}
