/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Org;

import java.util.ArrayList;
import model.CharityEducationGroup.CharityEduManager;
import model.CharityEducationGroup.CharityEduOrganization;
import model.CharityFundingGroup.CharityFundingOrganization;
import model.Company.Company;
import model.Company.HRGroup;
import model.Country.Country;
import model.CountryEdu.CountryEdu;
import model.Enterprise.Enterprise;
import model.School.School;
import model.School.SchoolManagementGroup;
import model.School.StudentGroup;
import model.School.TeachingGroup;
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
    
    public Organization createOrganization(String name, Country country, Organization.OrgType type, Enterprise e) {
        Organization o;
          switch (type) {
            case SchoolManagementGroup:
                o = new SchoolManagementGroup(); 
                break;
            case StudentGroup:
                o = new StudentGroup();
                break;
            case TeachingGroup:
                o = new TeachingGroup();    
                break;
            case CharityEdu:
                o = new CharityEduOrganization();
                break;
            case CharityFunding:
                o = new CharityFundingOrganization();;
                break;   
            case HRGroup:
                o = new HRGroup();
                break;   
            case CountryEdu:
                o = new CountryEdu();
                break;
            default:
                o = new Organization(null);
                break;
          }
        o.setName(name);
        o.setCountry(country);
        o.setOrgType(type);
        o.setEnterprise(e);
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
