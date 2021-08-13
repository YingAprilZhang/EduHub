/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CharityFundingGroup;

import model.UserAccount.UserAccount;

/**
 *
 * @author kkkkayla
 */
public class CharityFundingGroup {
    
    private String name;
    private UserAccount charityFundAccount;
    private int fund;

    public CharityFundingGroup(UserAccount charityFundAccount) {
        this.charityFundAccount = charityFundAccount;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccount getCharityFundAccount() {
        return charityFundAccount;
    }

    public void setCharityFundAccount(UserAccount charityFundAccount) {
        this.charityFundAccount = charityFundAccount;
    }

    public int getFund() {
        return fund;
    }

    public void setFund(int fund) {
        this.fund = fund;
    }
    
    
    @Override 
    public String toString(){
        return this.getName();
    }
    
}
