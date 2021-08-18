/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Company;

import model.UserAccount.UserAccount;

/**
 *
 * @author kkkkayla
 */
public class Company extends UserAccount{
    private Job Job;

    public Job getJob() {
        return Job;
    }

    public void setJob(Job Job) {
        this.Job = Job;
    }
    
    
    @Override
    public String toString() {
        return this.getName();
    }
    
    
    
}
