package com.design.patterns.strategy;

public class SortingStrategyContext {
    private SortingStrategy strategy;

    public SortingStrategyContext(SortingStrategy s) {
        this.strategy = s;
    }

    public void setStrategy(SortingStrategy s) {
        this.strategy = s;
    }
    public int[] sort(int[] array) {
        return strategy.sort(array);
    }
}
