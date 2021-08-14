/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;
import ui.CharityEducationGroup.CharityEduGroupWorkAreaJPanel;
import ui.Principal.PrincipalAreaJPanel;

/**
 *
 * @author kkkkayla
 */


public class CharityEducationRole extends Role {
    
    public static CharityEducationRole charityEduRole;
    
     public static CharityEducationRole getInstance(){
        if(charityEduRole == null){
            charityEduRole = new CharityEducationRole();
        }
        return charityEduRole;
    }
     
     public CharityEducationRole() {
        super(RoleType.CharityEdu);
    }
     
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new CharityEduGroupWorkAreaJPanel(userProcessContainer, account);
    }
}
