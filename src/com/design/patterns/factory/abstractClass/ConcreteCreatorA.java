package com.design.patterns.factory.abstractClass;

public class ConcreteCreatorA extends Creator {
    @Override
    public Schedule factoryMethod() {
        return new TeacherSchedule();
    }
}
