package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Models.Address;
import com.Models.User;
import com.Resources.ROLE;

public class Main {

    private static User admin = new User(ROLE.ADMIN, "100", "ADMIN", "7005810919", "admin@amdocs.com", new Address(null, null, null, null), new Date()) ;  
    private static List<User> customers ; 


    public static void main(String[] args) {
        System.out.println("\n************* Welcome to Electricity Billing System *************\n");
        customers= new ArrayList<>() ; 
        startSystem();
 

    }

    public static void startSystem() {
        loginUser() ; 
    }

    private static void loginUser() {
        
    }
}
