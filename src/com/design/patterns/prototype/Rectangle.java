package com.design.patterns.prototype;

public class Rectangle implements Shape {
    private String color;

    public Rectangle(String color) {
        this.color = color;
    }

    @Override
    public void showColor() {
        System.out.println("Rectangle has color : " + this.color);
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.color);
    }
}
