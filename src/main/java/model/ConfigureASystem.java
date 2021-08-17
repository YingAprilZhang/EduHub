package model;

import model.Role.CharityEducationRole;
import model.Role.CharityFundingRole;
import model.UserAccount.UserAccount;
import model.Role.Role;
import model.Role.SysAdminRole;


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

        
       UserAccount ua = business.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", SysAdminRole.getInstance());
       UserAccount ua1 = business.getUserAccountDirectory().createUserAccount("charityedu", "charityedu", CharityEducationRole.getInstance());
       UserAccount ua2 = business.getUserAccountDirectory().createUserAccount("fund", "fund", CharityFundingRole.getInstance());

        return business;
    }
    
}
