/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.School;

import model.UserAccount.UserAccount;

/**
 *
 * @author aprilyz
 */
public class Student extends UserAccount{
    public String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString(){
        return super.getName();
    }
    
    
}
