package com.design.patterns.factory.interfaces;

public class ConcreteCreatorB implements Creator {
    @Override
    public Schedule factoryMethod() {
        return new StudentSchedule();
    }
}
