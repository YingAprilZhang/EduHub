/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Company.Company;
import model.Country.Country;
import model.School.School;

/**
 *
 * @author aprilyz
 */
public class EnterPriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createEnterprise(String name, Country country, Enterprise.EtprType type) {
        Enterprise o;
          switch (type) {
            case School:
                o = new School(country);
                country.getSchoolList().add((School) o);
                break;
            case Charity:
                o = new Charity();
                break;  
            case Company:
                o = new Company();
                break;   
            case UnitedEduOrg:
                o = new UnitedEduOrg();
                break;
            default:
                o = new Enterprise();
                break;
          }
        o.setName(name);
        o.setCountry(country);
        o.setEtprType(type);
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
