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
public class UnitedEduOrgAdminRole extends Role {
    
    public static UnitedEduOrgAdminRole unitedEduOrgAdminRole;
    
     public static UnitedEduOrgAdminRole getInstance(){
        if(unitedEduOrgAdminRole == null){
            unitedEduOrgAdminRole = new UnitedEduOrgAdminRole();
        }
        return unitedEduOrgAdminRole;
    }

    public UnitedEduOrgAdminRole() {
        super(Role.RoleType.UnitedEduOrgAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new UnitedEducationOrganizationAdminJPanel(userProcessContainer, account);
    }
    
}
