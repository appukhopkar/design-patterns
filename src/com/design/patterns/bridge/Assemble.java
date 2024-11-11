package com.design.patterns.bridge;
//Concrete implementation2
public class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.println(" Assembled");
    }
}
