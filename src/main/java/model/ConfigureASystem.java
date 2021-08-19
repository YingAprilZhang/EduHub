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

    public static Business configure() {

        Business business = Business.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        UserAccount ua = business.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", Role.RoleType.SysAdmin);
        UserAccount ua1 = business.getUserAccountDirectory().createUserAccount("edu", "edu", Role.RoleType.CharityEdu);
        UserAccount ua2 = business.getUserAccountDirectory().createUserAccount("fund", "fund", CharityFundingRole.RoleType.CharityFunding);
        UserAccount ua3 = business.getUserAccountDirectory().createUserAccount("com", "com", Role.RoleType.CompanyRole);

        return business;
    }

}
