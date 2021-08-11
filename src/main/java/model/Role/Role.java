/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import model.Business;
import model.Org.Organization;
import model.UserAccount.UserAccount;

/**
 *
 * @author changxu
 */
public abstract class Role {
    public enum RoleType{
        SysAdmin("SysAdmin"),
        Accountant("Accountant"),
        CountryManager("Country Manager"),
        WorldManager("World Manager"),
        DataMaintainer("Data Maintainer"),
        CharityEdu("Charity Edu"),
        CharityFunding("Charity Funding"),
        CompanyRole("Company Role"),
        Student("Student"),
        Teacher("Teacher"),
        Principal("Principal");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
 
        @Override
        public String toString() {
            return value;
        }
    }
    
    public static final Map<RoleType, Organization.OrgType> RoleToOrgMapping = new HashMap<RoleType, Organization.OrgType>() {{
        put(RoleType.Student, Organization.OrgType.School);
        put(RoleType.Teacher, Organization.OrgType.School);
        put(RoleType.Principal, Organization.OrgType.School);
    }};
    
    
    public static RoleType getRoleTypeByValue(String value) {
        RoleType result = null;
        for(RoleType r: RoleType.values()) {
            result = r.value.equals(value) ? r : null;
        }
        return result;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            Business business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }    
}
