/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CharityFundingGroup;

import model.Org.Organization;

/**
 *
 * @author kkkkayla
 */
public class CharityFundingOrganization extends Organization{
    private CharityFundingManager charityFund;

    public  void setCharityFund(CharityFundingManager input) {
        this.charityFund = input;
    }
}
