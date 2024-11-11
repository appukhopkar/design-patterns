package com.design.patterns.decorator;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public int cost() {
        return 400;
    }
}
