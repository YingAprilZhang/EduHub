/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;

/**
 *
 * @author changxu
 */
public abstract class Role {
    public enum RoleType{
        Accountant("Accountant"),
        CountryManager("CountryManager"),
        WorldManager("WorldManager"),
        DataMaintainer("DataMaintainer"),
        CharityEdu("CharityEdu"),
        CharityFunding("CharityFunding"),
        CompanyRole("CompanyRole"),
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            Business business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }    
}
