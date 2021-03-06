/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.CountryManager.CountryManager;
import model.UserAccount.UserAccount;
import ui.CountryManager.CountryManagerAreaJPanel;

/**
 *
 * @author changxu
 */
public class CountryManagerRole extends Role{
    
    public static CountryManagerRole countryManagerRole;
    
     public static CountryManagerRole getInstance(){
        if(countryManagerRole == null){
            countryManagerRole = new CountryManagerRole();
        }
        return countryManagerRole;
    }

    public CountryManagerRole() {
        super(RoleType.CountryManager);
    }
        
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new CountryManagerAreaJPanel(userProcessContainer, account);
    }

    
}
