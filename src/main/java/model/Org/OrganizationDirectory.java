/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Org;

import java.util.ArrayList;
import model.CharityEducationGroup.CharityEduGroup;
import model.Country.Country;
import model.CountryEdu.CountryEdu;
import model.School.School;
import model.SysAdmin.SysAdmin;
import model.UserAccount.UserAccount;

/**
 *
 * @author aprilyz
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {  
         this.organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createOrganization(String name, Country country, Organization.OrgType type) {
        Organization o;
          switch (type) {
            case School:
                o = new School();
                break;
            /*
            case CharityEdu:
                // o = ;
                break;
            case CharityFunding:
                 // o = ;
                break;   
            */
            case CountryEdu:
                o = new CountryEdu();
                break;
            default:
                o = new Organization();
                break;
          }
        o.setName(name);
        o.setCountry(country);
        o.setOrgType(type);
        organizationList.add(o);
        return o;
    }
    
    public Organization getOrgByName(String name) {
        for (Organization o : organizationList) {
            if(o.getName().equals(name)) {
                return o;
            }
        }
        return null;
    }
     
}
