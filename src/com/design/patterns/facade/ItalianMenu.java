package com.design.patterns.facade;

import java.util.ArrayList;
import java.util.List;

public class ItalianMenu implements Menu {
    public List<String> dishes;

    ItalianMenu() {
        dishes = new ArrayList<>();
        dishes.add("Pasta");
    }

    @Override
    public void printMenu() {
        System.out.println("Italian dishes :");
        for(String dish : dishes) {
            System.out.print(dish);
        }
    }
}
