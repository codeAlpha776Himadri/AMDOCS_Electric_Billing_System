package com.models ;

public class Bill {
    
    private String id ; 
    private Customer customer ; 
    private double unitRate ; 
    private double units ;
    private double amt ; 
    
    public Bill(String id, Customer customer, double unitRate, double units) {
        this.id =id ; 
        this.customer = customer ;
        this.unitRate= unitRate ; 
        this.units = units ;
        this.amt = (unitRate * units) ; 
    }    
    
    
    public String getId() {
        return this.id ; 
    }
    
    public Customer getCustomer() {
        return this.customer ; 
    }
    
    
}