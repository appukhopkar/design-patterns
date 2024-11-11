package com.design.patterns.facade;

public class ItalianRestaurant implements Restaurant {
    @Override
    public Menu getMenus() {
        ItalianMenu menu = new ItalianMenu();
        return menu;
    }
}
