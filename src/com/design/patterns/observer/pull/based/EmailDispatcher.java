package com.design.patterns.observer.pull.based;

// Observer2
public class EmailDispatcher extends Observer {
    public EmailDispatcher(Subject subject) {
        super(subject);
    }

    @Override
    void update() {
        System.out.println("Saving updated value : " + this.subject.data + " in email");
    }
}
