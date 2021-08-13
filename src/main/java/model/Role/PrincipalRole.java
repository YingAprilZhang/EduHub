/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;
import ui.Principal.PrincipalAreaJPanel;

/**
 *
 * @author aprilyz
 */
public class PrincipalRole extends Role {
    
    public static PrincipalRole principalRole;
    
     public static PrincipalRole getInstance(){
        if(principalRole == null){
            principalRole = new PrincipalRole();
        }
        return principalRole;
    }
     
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new PrincipalAreaJPanel(userProcessContainer, account);
    }
}
