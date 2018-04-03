package entities;

import java.util.Date;


public class Administrator extends User{

    public Administrator(String name, String username, String telephone, String email, String password, Date dateRegistered) {
        super(name, username, telephone, email, password, dateRegistered);
    }

    @Override
    public String getUserInfo(String StoixeiaUser) {
        return name + " " + telephone + " " + email;
    }
    
}
