package com.Models;

public class Address {
    
    private String state ; 
    private String district ; 
    private String locality ; 
    private String pincode ;
    
    public Address(String state, String district, String locality, String pincode) {
        this.state = state;
        this.district = district;
        this.locality = locality;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address [state=" + state + ", district=" + district + ", locality=" + locality + ", pincode=" + pincode
                + "]";
    } 

    

}
