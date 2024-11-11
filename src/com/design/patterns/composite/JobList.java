package com.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class JobList implements Job {
    private String title;
    private List<Job> jobs;

    public JobList(String title) {
        this.title = title;
        this.jobs = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public void addJob(Job job) {
        jobs.add(job);
    }

    public void removeJob(Job job) {
        jobs.remove(job);
    }

    @Override
    public void display() {
        System.out.println("List of jobs : " + title);
        for (Job job: jobs) {
            job.display();
        }
    }
}
