package com.design.patterns.factory.interfaces;

public class StudentSchedule implements Schedule {
    @Override
    public void displaySchedule() {
        System.out.println("This is time table for students");
    }
}
