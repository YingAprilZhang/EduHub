/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;
import ui.CharityFundingGroup.CharityFundingWorkAreaJPanel;

/**
 *
 * @author changxu
 */

public class CharityFundingRole extends Role {
    
    public static CharityFundingRole charityEduRole;
    
     public static CharityFundingRole getInstance(){
        if(charityEduRole == null){
            charityEduRole = new CharityFundingRole();
        }
        return charityEduRole;
     }

    public CharityFundingRole() {
        super(RoleType.CharityFunding);
    }
     
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new CharityFundingWorkAreaJPanel(userProcessContainer, account);
    }
}