package com.design.patterns.chain.of.responsibility;

import java.util.Arrays;
import java.util.List;

public class Chain {
    private List<Handler> handlers;
    public Chain(Handler... handlers) {
        this.handlers = Arrays.asList(handlers);
    }
    public void process(Request request) {
        for(Handler h: handlers){
            if (h.canProcess(request)) {
                h.process(request);
                break;  // so that request is not forwarded unnecessarily once processed
            }
        }
    }
}
