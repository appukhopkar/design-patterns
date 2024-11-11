package com.design.patterns.adapter;
// Adaptee class
public class DatabaseUpgraderV1 implements DatabaseUpgrader {
    @Override
    public void upgrade() {
        System.out.println("Running upgrade script of database version 1");
    }
}
