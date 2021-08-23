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
public class CharityAdminRole extends Role  {
     public static CharityAdminRole charityAdminRole;
    
     public static CharityAdminRole getInstance(){
        if(charityAdminRole == null){
            charityAdminRole = new CharityAdminRole();
        }
        return charityAdminRole;
    }

    public CharityAdminRole() {
        super(Role.RoleType.CharityAdmin);
    }
     
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new CharityEnterpriseAdminJPanel(userProcessContainer, account);
    }
}
