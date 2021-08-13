/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Business;
import model.UserAccount.UserAccount;
import ui.Teacher.TeacherAreaJPanel;

/**
 *
 * @author aprilyz
 */
public class TeacherRole extends Role {

    public static TeacherRole teacherRole;
    
     public static TeacherRole getInstance(){
        if(teacherRole == null){
            teacherRole = new TeacherRole();
        }
        return teacherRole;
    }
    
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account) {
        return new TeacherAreaJPanel(userProcessContainer, account);
    }
}
