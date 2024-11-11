package com.design.patterns.decorator;

public class CheeseBurstDecorator extends PizzaDecorator {
    public CheeseBurstDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ",CheeseBurst";
    }

    @Override
    public int cost() {
        return decoratedPizza.cost() + 100; // Cost of cheese topping
    }
}
