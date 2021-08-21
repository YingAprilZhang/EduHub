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
    private int num;
    private int jobID;

    public SingleJob(String name, int num, int JobID) {
        this.name = name;
        this.num = num;
        this.jobID = JobID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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
