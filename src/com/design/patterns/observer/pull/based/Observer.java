package com.design.patterns.observer.pull.based;

public abstract class Observer {
    protected final Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    abstract void update();
}
