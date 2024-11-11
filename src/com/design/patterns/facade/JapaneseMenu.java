package com.design.patterns.facade;

import java.util.ArrayList;
import java.util.List;

public class JapaneseMenu implements Menu {
    public List<String> dishes;

    JapaneseMenu() {
        dishes = new ArrayList<>();
        dishes.add("Sushi");
    }

    @Override
    public void printMenu() {
        System.out.println("Japanese dishes :");
        for(String dish : dishes) {
            System.out.print(dish);
        }
    }
}
