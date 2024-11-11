package com.design.patterns.observer.push.based;
// Observer3
public class SlackDispatcher implements Observer {
    @Override
    public void update(String data) {
        System.out.println("Sending updated value : " + data + " to Slack");
    }
}
