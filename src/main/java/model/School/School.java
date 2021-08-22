/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.School;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import model.Business;
import model.Country.Country;
import model.Enterprise.Enterprise;
import model.Org.Organization;
import model.Role.Role;

/**
 *
 * @author aprilyz
 */
public class School extends Enterprise {
    public Principal principal;
    public List<EduData> eduDataList;
    public List<Organization> orgList;
    
    public School(Country country) {
        this.setCountry(country);
        this.eduDataList = new ArrayList();
    }

    
    public EduData getEduDataOfStudent(String userName) {
        for (EduData e : eduDataList) {
            if (e.student.getName().equals(userName)){
                return e;
            }
        }
        return null;
    }
    
}
