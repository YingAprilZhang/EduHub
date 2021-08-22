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
import model.Role.Role;

/**
 *
 * @author aprilyz
 */
public class School extends Enterprise {
    public Principal principal;
    public Map<String, Student> username2student;
    public List<EduData> eduDataList;

    public School(Country country) {
        this.setCountry(country);
        this.username2student = new TreeMap<>();
        this.eduDataList = new ArrayList();
    }

    public Student getStudentByName(String name) {
        Student c = username2student.get(name);
        if (c == null) {
            c = new Student();
            c.setName(name);
            c.setUsername(name);
            c.setPassword(name);
            username2student.put(name, c);
        }
        return c;
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
