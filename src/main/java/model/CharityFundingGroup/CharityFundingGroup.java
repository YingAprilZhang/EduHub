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
public class CharityFundingGroup extends UserAccount{
    
    private int fund;


    public int getFund() {
        return fund;
    }

    public void setFund(int fund) {
        this.fund = fund;
    }
    
    
    @Override 
    public String toString(){
        return this.getUsername();
    }
    
}
