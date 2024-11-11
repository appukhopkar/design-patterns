package com.design.patterns.observer.pull.based;

// Actual Subject with data
public class DatabaseSample extends Subject {
    private String data;

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
        notifyObserversPullBased(data);
    }
}
