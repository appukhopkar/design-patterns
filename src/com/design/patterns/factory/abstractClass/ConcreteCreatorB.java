package com.design.patterns.factory.abstractClass;

public class ConcreteCreatorB extends Creator {
    @Override
    public Schedule factoryMethod() {
        return new StudentSchedule();
    }
}
