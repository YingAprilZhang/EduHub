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
public class CharityEduGroup {
    
    private String name;
    private UserAccount charityEduAccount;
    private EduClass eduClass;

    public CharityEduGroup(UserAccount charityEduAccount) {
        this.charityEduAccount = charityEduAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccount getCharityEduAccount() {
        return charityEduAccount;
    }

    public void setCharityEduAccount(UserAccount charityEduAccount) {
        this.charityEduAccount = charityEduAccount;
    }

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
