/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;
import ui.StudentAreaJPanel.StudentAreaJPanel;

/**
 *
 * @author aprilyz
 */
public class StudentRole extends Role {
    
    public static StudentRole studentRole;
    
     public static StudentRole getInstance(){
        if(studentRole == null){
            studentRole = new StudentRole();
        }
        return studentRole;
    }
     
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new StudentAreaJPanel(userProcessContainer, account);
    }
}
