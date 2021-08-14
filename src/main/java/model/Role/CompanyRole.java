/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.UserAccount.UserAccount;
import ui.Company.CompanyWorkAreaJPanel;
import model.Business;

/**
 *
 * @author changxu
 */
public class CompanyRole extends Role {
    
    public static CompanyRole companyRole;
    
     public static CompanyRole getInstance(){
        if(companyRole == null){
            companyRole = new CompanyRole();
        }
        return companyRole;
     }

    public CompanyRole() {
        super(RoleType.CompanyRole);
    }
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new CompanyWorkAreaJPanel(userProcessContainer, account); //kaila
    }

}
