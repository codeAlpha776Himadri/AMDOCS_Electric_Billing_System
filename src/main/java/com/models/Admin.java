
package com.models ;

import com.services.Helper;

public class Admin extends User {

    private static double unitRate = 2.15 ; 

    public Admin(String username, String password) {
        super(username, password);
    }

    // Calculate the bill for a customer
    public Bill calculateBill(Customer customer, double unitsConsumed) {
        // You can implement your own billing logic here
        // For simplicity, we'll assume a fixed rate per unit
        Bill bill = new Bill(Helper.getRandomNumberString(), customer, unitRate, unitsConsumed) ; 
        return bill ; 
    }
}