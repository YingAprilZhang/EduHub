/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Org;

import java.util.HashMap;
import java.util.Map;
import model.Country.Country;
import model.Enterprise.Enterprise;
import model.Enterprise.Enterprise.EtprType;
import model.Role.Role.RoleType;

/**
 *
 * @author aprilyz
 */
public class Organization {
     private String name;
     private Country country;
     private OrgType orgType;
     private Enterprise enterprise;

     
     public enum OrgType{
        TeachingGroup,
        StudentGroup,
        SchoolManagementGroup,
        CharityFunding,
        CharityEdu,
        HRGroup,
        CountryEdu,
        WorldEdu
        ;
    }
     
     public static final Map<OrgType, EtprType> OrgType2EtprType = new HashMap<OrgType, EtprType>() {{
        put(OrgType.TeachingGroup, EtprType.School);
        put(OrgType.StudentGroup, EtprType.School);
        put(OrgType.SchoolManagementGroup, EtprType.School);
        
        put(OrgType.CharityFunding, EtprType.Charity);
        put(OrgType.CharityEdu, EtprType.Charity);
        
        put(OrgType.HRGroup, EtprType.Company);
        
        put(OrgType.CountryEdu, EtprType.UnitedEduOrg);
        put(OrgType.WorldEdu, EtprType.UnitedEduOrg);
    }};

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

    public OrgType getOrgType() {
        return orgType;
    }

    public void setOrgType(OrgType orgType) {
        this.orgType = orgType;
    }
    
    public static OrgType getOrgTypeByName(String name) {
        return Enum.valueOf(Organization.OrgType.class, name);
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
     
    @Override
    public String toString() {
        return name;
    }
    
    
}
