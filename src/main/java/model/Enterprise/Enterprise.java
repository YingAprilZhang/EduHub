/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import model.Country.Country;

/**
 *
 * @author aprilyz
 */
public class Enterprise {
     private String name;
     private Country country;
     private Enterprise.EtprType etprType;
     
     public enum EtprType{
        School,
        Charity,
        Company,
        UnitedEduOrg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public EtprType getEtprType() {
        return etprType;
    }

    public void setEtprType(EtprType etprType) {
        this.etprType = etprType;
    }
    
    public static Enterprise.EtprType getEtprTypeByName(String name) {
        return Enum.valueOf(Enterprise.EtprType.class, name);
    }
     
    @Override
    public String toString() {
        return name;
    }
    
}
