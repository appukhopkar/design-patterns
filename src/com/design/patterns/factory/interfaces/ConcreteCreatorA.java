package com.design.patterns.factory.interfaces;

public class ConcreteCreatorA implements Creator {
    @Override
    public Schedule factoryMethod() {
        return new TeacherSchedule();
    }
}
