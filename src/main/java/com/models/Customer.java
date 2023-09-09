package com.models ;

import java.util.List ;

public class Customer extends User {
    private String name;
    private String address ; 


    private List<Bill> previousBills;
    private double currentBill;

    public Customer(String username, String password, String name, String address) {
        super(username, password);
        this.name = name;
        this.previousBills = null;
        this.currentBill = 0.0;
        this.address = address ; 
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public List<Bill> getPreviousBills() {
        return previousBills;
    }

    public void setPreviousBill(Bill previousBill) {
        this.previousBills.add(previousBill) ;
    }

    public double getCurrentBill() {
        return currentBill;
    }

    public void setCurrentBill(double currentBill) {
        this.currentBill = currentBill;
    }
}