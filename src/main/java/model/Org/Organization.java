/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Org;

import java.util.HashMap;
import java.util.Map;
import model.Country.Country;
import model.Role.Role.RoleType;

/**
 *
 * @author aprilyz
 */
public class Organization {
     private String name;
     private Country country;
     
     public enum OrgType{
        School,
        Charity;
    }

     
    public Organization(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    
     
    @Override
    public String toString() {
        return name;
    }
    
    
}
