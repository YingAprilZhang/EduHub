/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.github.javafaker.Faker;
import model.Country.CountryDirectory;
import model.Enterprise.EnterPriseDirectory;
import model.Org.OrganizationDirectory;
import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author aprilyz
 */
public class Business {

     private static Business business;
     private UserAccountDirectory userAccountDirectory;
     private CountryDirectory countryDirectory;
     private OrganizationDirectory organizationDirectory;
     private EnterPriseDirectory enterpriseDirectory;
      
     public static Business getInstance(){
        if(business == null){
            business = new Business();
        }
        return business;
    }

    public Business() {
        this.userAccountDirectory =  new UserAccountDirectory();
        this.countryDirectory =  new CountryDirectory();
        this.organizationDirectory =  new OrganizationDirectory();
        this.enterpriseDirectory =  new EnterPriseDirectory();
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

    public CountryDirectory getCountryDirectory() {
        return countryDirectory;
    }

    public void setCountryDirectory(CountryDirectory countryDirectory) {
        this.countryDirectory = countryDirectory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public EnterPriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterPriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
     
     
}
