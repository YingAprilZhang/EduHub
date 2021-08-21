/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templatesee
 * and open the template in the editor.
 */
package model.CharityEducationGroup;

import java.util.ArrayList;
import model.Org.Organization;

/**
 *
 * @author kkkkayla
 */
public class CharityEduOrganization extends Organization{
    private CharityEduManager charityEdu;

    public CharityEduOrganization() {
    }

    public  void setCharityEdu(CharityEduManager input) {
        this.charityEdu = input;
    }
    public CharityEduManager getCharityEdu() {
        return charityEdu;
    }
    
    
    
    
}
