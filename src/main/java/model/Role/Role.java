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
    
    public RoleType roleType;

    public Role(RoleType roleType) {
        this.roleType = roleType;
    }
    
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
        Principal("Principal"),
        
        SchoolAdmin("School Admin"),
        CharityAdmin("Charity Admin"),
        CompanyAdmin("Company Admin"),
        UnitedEduOrgAdmin("UnitedEduOrg Admin"),
        ;
        
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

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    
    /*
    public static final Map<RoleType, Organization.OrgType> RoleToOrgMapping = new HashMap<RoleType, Organization.OrgType>() {{
        put(RoleType.Student, Organization.OrgType.School);
        put(RoleType.Teacher, Organization.OrgType.School);
        put(RoleType.Principal, Organization.OrgType.School);
    }};
    */
    
    public static final Map<RoleType, Role> RoleTypeToRoleMapping = new HashMap<RoleType, Role>() {{
        put(RoleType.SysAdmin, SysAdminRole.getInstance());
        put(RoleType.Student, StudentRole.getInstance());
        put(RoleType.Teacher,TeacherRole.getInstance());
        put(RoleType.Principal, PrincipalRole.getInstance());
        put(RoleType.Accountant, AccountantRole.getInstance());
        put(RoleType.CharityEdu, CharityEducationRole.getInstance());
        put(RoleType.CharityFunding, CharityFundingRole.getInstance());
        put(RoleType.CompanyRole, CompanyRole.getInstance());
        put(RoleType.CountryManager, CountryManagerRole.getInstance());
        put(RoleType.DataMaintainer, DataMaintainerRole.getInstance());
        put(RoleType.WorldManager, WorldManagerRole.getInstance());
        
        put(RoleType.CharityAdmin, CharityAdminRole.getInstance());
        put(RoleType.CompanyAdmin, CompanyAdminRole.getInstance());
        put(RoleType.SchoolAdmin, SchoolAdminRole.getInstance());
        put(RoleType.UnitedEduOrgAdmin, WorldManagerRole.getInstance());
        
        
    }};
    
    
    public static RoleType getRoleTypeByName(String name) {
        return Enum.valueOf(RoleType.class, name);
    }

    public static RoleType getRoleTypeByValue(String value) {
        RoleType result = null;
        for(RoleType r: RoleType.values()) {
            result = value.equals(r.getValue()) ? r : null;
            if (value.equals(r.getValue())) {
                result = r;
                break;
            }
        }
        return result;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }    
}
