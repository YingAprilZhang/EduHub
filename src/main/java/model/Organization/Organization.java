/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

/**
 *
 * @author aprilyz
 */
public class Organization {
     private String name;
     
     public enum Type{
        School,
        Charity;
    }
     
    @Override
    public String toString() {
        return name;
    }
}
