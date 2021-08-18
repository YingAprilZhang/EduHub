/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Request;

/**
 *
 * @author changxu
 */
public class FundRequest extends Request{
    Double fundingAmount;

    public Double getFundingAmount() {
        return fundingAmount;
    }

    public void setFundingAmount(Double fundingAmount) {
        this.fundingAmount = fundingAmount;
    }
    
    
}
