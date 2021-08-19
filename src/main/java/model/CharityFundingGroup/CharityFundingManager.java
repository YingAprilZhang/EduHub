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
public class CharityFundingManager extends UserAccount{
    
    private int fund = 10000000;


    public int getFund() {
        return fund;
    }

   
    
    
    public int addNewFund(int newFund){
        this.fund = fund + newFund;
        return fund;
        
    }
    
    @Override 
    public String toString(){
        return this.getUsername();
    }
    
}
