package eshop;

import entities.User;
import java.util.ArrayList;

public class EshopData {
    
    private static ArrayList<User> users;

    public EshopData() { 
    users = new ArrayList<User>();
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        EshopData.users = users;
    }
    
    public void addUser(User u){
        users.add(u);
    }
    
    
}
