package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Models.Bill;
import com.Models.User;
import com.Resources.ROLE;

public class Main {

    private static User admin = new User(ROLE.ADMIN, "100", "ADMIN", "7005810919", "admin@amdocs.com", "address", new Date(), null) ;  

    public static void main(String[] args) {
        System.out.println("\n************* Welcome to Electricity Billing System *************\n");
        
        startSystem();

    }

    public static void startSystem() {
        System.out.println("start");
    }
}
