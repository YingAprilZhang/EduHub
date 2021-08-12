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
     private OrgType orgType;

    Organization(String name, Country country, OrgType orgType) {
        this.name = name;
        this.country = country;
        this.orgType = orgType;
    }
     
     public enum OrgType{
        School,
        CharityEdu,
        CharityFunding;
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

    public OrgType getOrgType() {
        return orgType;
    }

    public void setOrgType(OrgType orgType) {
        this.orgType = orgType;
    }
    
    public static OrgType getOrgTypeByName(String name) {
        return Enum.valueOf(Organization.OrgType.class, name);
    }
    
     
    @Override
    public String toString() {
        return name;
    }
    
    
}
