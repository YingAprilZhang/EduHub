/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.School;

import java.util.List;
import model.Country.Country;
import model.Principal.Principal;
import model.Student.Student;

/**
 *
 * @author aprilyz
 */
public class School {
    public String name;
    public Country country;
    public Principal principal;
    
    public List<Student> studentList;
    
}
