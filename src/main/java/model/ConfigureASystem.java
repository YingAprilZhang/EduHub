package model;

import model.UserAccount.UserAccount;
import model.Role.Role;


/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static Business configure(){
        
        Business business = Business.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        
       // UserAccount ua = business.getUserAccountDirectory().createUserAccount("worldManager", "worldManager", new WorldManagerRole());
        
        return business;
    }
    
}
