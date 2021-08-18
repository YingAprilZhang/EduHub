/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.UserAccount;

import java.util.ArrayList;
import model.Accountant.Accountant;
import model.CharityEducationGroup.CharityEduGroup;
import model.CharityFundingGroup.CharityFundingGroup;
import model.Company.Company;
import model.Country.Country;
import model.CountryManager.CountryManager;
import model.DataMaintainer.DataMaintainer;
import model.Org.Organization;
import model.Role.Role;
import model.School.Principal;
import model.School.Student;
import model.School.Teacher;
import model.SysAdmin.SysAdmin;
import model.WorldManager.WorldManager;


/**
 *
 * @author aprilyz
 */
public class UserAccountDirectory {
     private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        this.userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return this.userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : this.userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Role.RoleType roleType) {
        return createUserAccount(username, password, "", roleType, null);
    }

    public UserAccount createUserAccount(String username, String password, String name, 
                Role.RoleType roleType, Organization organization){
        UserAccount userAccount;
        switch (roleType) {
            case SysAdmin:
                userAccount = new SysAdmin();
                 break;
            case Accountant:
                userAccount = new Accountant();
                break;
            case CountryManager:
                userAccount = new CountryManager();
                break;
            case WorldManager:
                userAccount = new WorldManager();
                break; 
            case DataMaintainer:
                userAccount = new DataMaintainer();
                break;
            case CharityEdu:
                userAccount = new CharityEduGroup();
                break;
            case CharityFunding:
                userAccount = new CharityFundingGroup();
                break;    
            case CompanyRole:
                userAccount = new Company();
                break;
            case Student:
                userAccount = new Student();
                break;
            case Teacher:
                userAccount = new Teacher();
                break;
            case  Principal:
                userAccount = new Principal();
                break;
            default:
                userAccount = new UserAccount();
                break;
        }
        Role role = Role.RoleTypeToRoleMapping.get(roleType);
       
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setName(name);
        userAccount.setRole(role);
        userAccount.setOrganization(organization);
        this.userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : this.userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public UserAccount getUserAccountByUserName(String username) {
        for (UserAccount ua : userAccountList) {
             if (ua.getUsername().equals(username))
                 return ua;
        }
        return null;
    }
    
    public Principal getPrincipalByUserName(String username) {
        for (UserAccount ua : userAccountList) {
             if (ua.getUsername().equals(username) 
                     && ua.getRole().roleType.equals(Role.RoleType.Principal))
                 return (Principal)ua;
        }
        return null;
    }

}
