package com.design.patterns.observer.push.based;
// Observer2
public class EmailDispatcher implements Observer {
    @Override
    public void update(String data) {
        System.out.println("Sending updated value : " + data + " in Email");
    }
}
