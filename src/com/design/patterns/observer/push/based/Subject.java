package com.design.patterns.observer.push.based;

import java.util.ArrayList;
import java.util.List;
// Subject parent class
public class Subject {
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

    protected void notifyObserversPushBased(String data) {
        for(Observer o: this.observers) {
            o.update(data);
        }
    }
}
