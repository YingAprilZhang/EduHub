/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.UserAccount.UserAccount;
import ui.EnterpriseAdmin.CompanyAdminJPanel;

/**
 *
 * @author aprilyz
 */
public class CompanyAdminRole extends Role {

    public static CompanyAdminRole companyAdminRole;
    
     public static CompanyAdminRole getInstance(){
        if(companyAdminRole == null){
            companyAdminRole = new CompanyAdminRole();
        }
        return companyAdminRole;
    }

    public CompanyAdminRole() {
        super(Role.RoleType.CompanyAdmin);
    }
     
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new CompanyAdminJPanel(userProcessContainer, account);
    }
    
}
