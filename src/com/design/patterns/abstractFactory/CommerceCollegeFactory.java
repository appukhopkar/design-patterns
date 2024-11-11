package com.design.patterns.abstractFactory;

public class CommerceCollegeFactory implements CollegeFactory {

    @Override
    public Teacher createTeacher() {
        return new CommerceTeacher();
    }

    @Override
    public Student createStudent() {
        return new CommerceStudent();
    }
}
