/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;
import ui.CountryManager.CountryManagerAreaJPanel;

/**
 *
 * @author changxu
 */
public class CountryManagerRole extends Role{
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Business business) {
        return new CountryManagerAreaJPanel(userProcessContainer, account, business);
    }

}
