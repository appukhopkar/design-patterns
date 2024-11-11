package com.design.patterns.bridge;
// Concrete implementation1
public class Produce implements Workshop{

    @Override
    public void work() {
        System.out.println("Produced");
    }
}
