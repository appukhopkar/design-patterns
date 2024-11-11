package com.design.patterns.singleton;

public final class Singleton {
    private static int count = 0;
    private static Singleton s = null;
    public static Singleton getInstance() {
        if (s == null) {
           s = new Singleton();
        }
        return s;
    }
    private Singleton() {
        count++;
        System.out.println(count);
    }
    public void printMe(String msg) {
        System.out.println(msg);
    }
}
