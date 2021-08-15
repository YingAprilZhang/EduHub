/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.UserAccount.UserAccount;
import ui.WorldManager.WorldManagerAreaJPanel;

/**
 *
 * @author changxu
 */
public class WorldManagerRole extends Role {
    
    public static WorldManagerRole worldManagerRole;
    
     public static WorldManagerRole getInstance(){
        if(worldManagerRole == null){
            worldManagerRole = new WorldManagerRole();
        }
        return worldManagerRole;
    }
     
     public WorldManagerRole() {
        super(Role.RoleType.WorldManager);
    }
     
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new WorldManagerAreaJPanel(userProcessContainer, account);
    }

}
