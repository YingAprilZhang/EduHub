/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Company;

/**
 *
 * @author kkkkayla
 */
public class SingleJob {

    private String name;
    private int salary;
    private int jobID;

    public SingleJob(String name, int salary, int JobID) {
        this.name = name;
        this.salary = salary;
        this.jobID = JobID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int JobID) {
        this.jobID = JobID;
    }

    public boolean isMatch(int ID) {
        if (this.jobID == ID) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(jobID);
    }
}
