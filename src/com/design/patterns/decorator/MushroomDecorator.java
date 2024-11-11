package com.design.patterns.decorator;

public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ",Mushrooms";
    }

    @Override
    public int cost() {
        return decoratedPizza.cost() + 200; // Cost of cheese topping
    }
}
