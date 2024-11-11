package com.design.patterns.observer.pull.based;

// Observer1
public class DiskDispatcher extends Observer {
   public DiskDispatcher(Subject subject) {
       super(subject);
   }

    @Override
    void update() {
        System.out.println("Saving updated value : " + this.subject.data + " to local disk");
    }
}
