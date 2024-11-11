package com.design.patterns.chain.of.responsibility;

public class ConcreteHandler3 implements Handler {
    @Override
    public void process(Request request) {
        System.out.println("Processed request "
                + request.getContent() + "in Handler3");
    }

    @Override
    public boolean canProcess(Request request) {
        return !request.getContent().isEmpty();
    }
}
