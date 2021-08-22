/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Company;

import java.util.ArrayList;

/**
 *
 * @author kkkkayla
 */
public class Job {

    private ArrayList<SingleJob> jobList;
    private int jobCount;

    public Job(ArrayList<SingleJob> jobList) {
        this.jobList = jobList;
        this.jobCount = jobList.size() + 1;

    }

    public Job() {
        this.jobList = new ArrayList<SingleJob>();
        this.jobCount = 1;
    }

    public ArrayList<SingleJob> getJobList() {
        return jobList;
    }

    public void setJobList(ArrayList<SingleJob> jobList) {
        this.jobList = jobList;
    }

    public int getJobCount() {
        return jobCount;
    }

    public void setJobCount(int jobCount) {
        this.jobCount = jobCount;
    }

    public SingleJob addNewJob(String name, int num) {
        SingleJob newJob = new SingleJob(name, num, jobCount);
        jobList.add(newJob);
        jobCount++;
        System.out.println(">>> xxx nc: " + newJob);
        return newJob;
    }

    public boolean removeJobByID(int ID) {
        for (SingleJob singlejob : jobList) {
            if (singlejob.isMatch(ID)) {
                jobList.remove(singlejob);
                return true;
            }
        }
        return false;
    }

    public SingleJob findJobByID(int id) {
        for (SingleJob singlejob : this.getJobList()) {
            if (singlejob.getJobID() == id) {
                return singlejob;
            }
        }
        return null;
    }

}
