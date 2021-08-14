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
 * @author changxu
 */
public class AccountantRole extends Role{
    
    public static AccountantRole accountantRole;
    
     public static AccountantRole getInstance(){
        if(accountantRole == null){
            accountantRole = new AccountantRole();
        }
        return accountantRole;
    }
     
     public AccountantRole() {
        super(RoleType.Accountant);
    }

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new AccountantAreaJPanel(userProcessContainer, account);
    }
    
}
