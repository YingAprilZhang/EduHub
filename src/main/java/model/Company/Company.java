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
public class Company {
    private String name;
    private UserAccount companyAccount;
    private Job Job;

    public Company(UserAccount companyAccount) {
        this.companyAccount = companyAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccount getCompanyAccount() {
        return companyAccount;
    }

    public void setCompanyAccount(UserAccount companyAccount) {
        this.companyAccount = companyAccount;
    }

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
