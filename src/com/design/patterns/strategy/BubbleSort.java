package com.design.patterns.strategy;

public class BubbleSort implements SortingStrategy {
    @Override
    public int[] sort(int[] array) {
        // Bubble sort algorithm
        System.out.println("Sorted using Bubble sort algorithm");
        return array;
    }
}
