/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;
import ui.CountryDataMaintainer.CountryDataMaintainJPanel;

/**
 *
 * @author changxu
 */
public class DataMaintainerRole extends Role {
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new CountryDataMaintainJPanel(userProcessContainer, account, business);
    }

}
