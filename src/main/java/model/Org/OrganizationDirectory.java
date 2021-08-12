/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Org;

import java.util.ArrayList;
import model.Country.Country;

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
        Organization o = new Organization(name, country, type);
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
