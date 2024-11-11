package com.design.patterns.abstractFactory;

public class ScienceCollegeFactory implements CollegeFactory {
    @Override
    public Teacher createTeacher() {
        return new ScienceTeacher();
    }

    @Override
    public Student createStudent() {
        return new ScienceStudent();
    }
}
