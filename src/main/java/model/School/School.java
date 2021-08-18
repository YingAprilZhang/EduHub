/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.School;

import java.util.List;
import java.util.Map;
import model.Country.Country;
import model.Org.Organization;

/**
 *
 * @author aprilyz
 */
public class School extends Organization {
    public Principal principal;
    public Map<String, Student> name2student;
    public Map<Integer, EduData> eduDataMap;

    public Student getStudentByName(String name) {
        Student c = name2student.get(name);
        if (c == null) {
            c = new Student();
            c.setName(name);
            
            name2student.put(name, c);
        }
        return c;
    }
}
