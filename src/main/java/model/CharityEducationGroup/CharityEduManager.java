/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CharityEducationGroup;

import model.UserAccount.UserAccount;

/**
 *
 * @author kkkkayla
 */
public class CharityEduManager extends UserAccount{
    
    private EduClass eduClass;

    public EduClass getEduClass() {
        return eduClass;
    }

    public void setEduClass(EduClass eduClass) {
        this.eduClass = eduClass;
    }
    
    
    @Override 
    public String toString(){
        return this.getName();
    }
    
}
