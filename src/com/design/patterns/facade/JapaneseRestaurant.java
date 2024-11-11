package com.design.patterns.facade;

public class JapaneseRestaurant implements Restaurant {
    @Override
    public Menu getMenus() {
        JapaneseMenu menu = new JapaneseMenu();
        return menu;
    }
}
