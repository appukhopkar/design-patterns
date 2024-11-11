package com.design.patterns.observer.pull.based;

// Observer3
public class SlackDispatcher extends Observer {
    public SlackDispatcher(Subject subject) {
        super(subject);
    }

    @Override
    void update() {
        System.out.println("Saving updated value : " + this.subject.data + " to Slack");
    }
}
