/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CountryManager;

import java.util.ArrayList;
import java.util.List;
import model.Request.Request;
import model.UserAccount.UserAccount;

/**
 *
 * @author changxu
 */
public class CountryManager extends UserAccount{    
    List<Request> requestQueue;
    
    public CountryManager(){
        requestQueue = new ArrayList<Request>();
    }

    public List<Request> getRequestQueue() {
        return requestQueue;
    }
    
    
}
