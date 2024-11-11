package com.design.patterns.observer.push.based;
// Actual Subject with data
public class DatabaseSample extends Subject {
    private String data;

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
        // Update all observers once value of data field is set.
        notifyObserversPushBased(data);
    }
}
