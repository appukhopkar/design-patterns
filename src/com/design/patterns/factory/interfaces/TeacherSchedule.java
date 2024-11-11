package com.design.patterns.factory.interfaces;

public class TeacherSchedule implements Schedule {
    @Override
    public void displaySchedule() {
        System.out.println("This is time table for teachers");
    }
}
