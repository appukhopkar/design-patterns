package com.design.patterns.observer.push.based;
// Observer1
public class DiskDispatcher implements Observer {
    @Override
    public void update(String data) {
        System.out.println("Saving updated value : " + data + " to local disk");
    }
}
