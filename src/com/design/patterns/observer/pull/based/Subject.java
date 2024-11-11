package com.design.patterns.observer.pull.based;

import java.util.ArrayList;
import java.util.List;
// Subject parent class
public class Subject {
    protected String data;
    private List<Observer> observers;

    public Subject(){
        this.observers = new ArrayList<>();
    }

    public void attach(Observer o) {
        this.observers.add(o);
    }

    public void detach(Observer o) {
        this.observers.remove(o);
    }
    protected void notifyObserversPullBased(String data) {
        observers.forEach(Observer::update);
    }
}
