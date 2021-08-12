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
public class CompanyRole {
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new CustomerAreaJPanel(userProcessContainer, account, business); //kaila
    }

}
