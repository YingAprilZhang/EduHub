/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author aprilyz
 */
public class Business {
     private static Business business;
     private UserAccountDirectory userAccountDirectory;
     
     public static Business getInstance(){
        if(business == null){
            business = new Business();
        }
        return business;
    }

    public Business() {
        this.userAccountDirectory =  new UserAccountDirectory();
    }
     
    public static void setBusiness(Business business) {
        Business.business = business;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
     
     
}
