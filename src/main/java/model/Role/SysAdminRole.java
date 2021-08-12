/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;
import ui.SysAdmin.SysAdminJPanel;

/**
 *
 * @author aprilyz
 */
public class SysAdminRole extends Role {
    
    public static SysAdminRole sysAdminRole;
    
     public static SysAdminRole getInstance(){
        if(sysAdminRole == null){
            sysAdminRole = new SysAdminRole();
        }
        return sysAdminRole;
    }
   

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new SysAdminJPanel(userProcessContainer, account);
    }
    
}
