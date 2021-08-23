/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.UserAccount.UserAccount;

/**
 *
 * @author aprilyz
 */
public class SchoolAdminRole  extends Role {
    
    public static SchoolAdminRole schoolAdminRole;
    
     public static SchoolAdminRole getInstance(){
        if(schoolAdminRole == null){
            schoolAdminRole = new SchoolAdminRole();
        }
        return schoolAdminRole;
    }

    public SchoolAdminRole() {
        super(Role.RoleType.SchoolAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new SchoolAdminJPanel(userProcessContainer, account);
    }
    
}
