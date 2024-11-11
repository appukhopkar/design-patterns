package com.design.patterns.strategy;

public class QuickSort implements SortingStrategy {
    @Override
    public int[] sort(int[] array) {
        //Quick sort algorithm
        System.out.println("Sorted using Quick sort algorithm");
        return array;
    }
}
