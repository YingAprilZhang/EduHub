/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Business;
import model.Company.Company;
import model.Country.Country;
import model.Org.Organization;
import model.Role.Role;
import model.School.School;
import model.UserAccount.UserAccount;

/**
 *
 * @author aprilyz
 */
public class EnterPriseDirectory {
    
    Business business = Business.getInstance();
    
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createEnterprise(String name, Country country, Enterprise.EtprType type) {
        Enterprise o;
        UserAccount ua = null; 
          switch (type) {
            case School:
                o = new School(country);
                country.getSchoolList().add((School) o);
                ua = business.getUserAccountDirectory().createUserAccount("schooladmin", "schooladmin", "", Role.RoleType.SchoolAdmin, new Organization(o));
                break;
            case Charity:
                o = new Charity();
                ua = business.getUserAccountDirectory().createUserAccount("charityadmin", "charityadmin", "", Role.RoleType.CharityAdmin, new Organization(o));
                break;  
            case Company:
                o = new Company();
                ua = business.getUserAccountDirectory().createUserAccount("companyadmin", "companyadmin", "", Role.RoleType.CompanyAdmin, new Organization(o));
                break;   
            case UnitedEduOrg:
                o = new UnitedEduOrg();
                ua = business.getUserAccountDirectory().createUserAccount("unitedadmin", "unitedadmin", "", Role.RoleType.UnitedEduOrgAdmin, new Organization(o));
                break;
            default:
                o = new Enterprise();
                break;
          }
        o.setName(name);
        o.setCountry(country);
        o.setEtprType(type);     
        o.setEnterpriseAdmin(ua);
        enterpriseList.add(o);
        return o;
    }
    
    public Enterprise getOrgByName(String name) {
        for (Enterprise o : enterpriseList) {
            if(o.getName().equals(name)) {
                return o;
            }
        }
        return null;
    }
}
