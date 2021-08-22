/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.School;

import java.util.Map;
import java.util.TreeMap;
import model.Org.Organization;

/**
 *
 * @author aprilyz
 */
public class StudentGroup extends Organization{
    public Map<String, Student> username2student;

    public StudentGroup() {
        this.username2student = new TreeMap<>();
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
    
}
