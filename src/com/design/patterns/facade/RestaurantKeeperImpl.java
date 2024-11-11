package com.design.patterns.facade;

public class RestaurantKeeperImpl implements RestaurantKeeper {
    @Override
    public ItalianMenu getItalianMenu() {
        ItalianRestaurant italianRestaurant = new ItalianRestaurant();
        ItalianMenu italianMenu = (ItalianMenu) italianRestaurant.getMenus();
        return italianMenu;
    }

    @Override
    public JapaneseMenu getJapaneseMenu() {
        JapaneseRestaurant japaneseRestaurant = new JapaneseRestaurant();
        JapaneseMenu japaneseMenu = (JapaneseMenu) japaneseRestaurant.getMenus();
        return japaneseMenu;
    }
}
