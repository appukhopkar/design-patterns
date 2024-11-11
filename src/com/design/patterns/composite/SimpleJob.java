package com.design.patterns.composite;

public class SimpleJob implements Job {
    private String title;

    public SimpleJob(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Simple Job : " + title);
    }
}
