package com.Models;

import java.util.Date;

public class Bill {

    private int id  ; 
    private String customerId ; 
    private Date billDate ; 
    private Date dueDate ; 
    private Double billAmt ; 
    private int units ;
    
    public Bill(int id, String customerId, Date billDate, Date dueDate, Double billAmt, int units) {
        this.id = id;
        this.customerId = customerId;
        this.billDate = billDate;
        this.dueDate = dueDate;
        this.billAmt = billAmt;
        this.units = units;
    }

    public Bill() {
        super() ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(Double billAmt) {
        this.billAmt = billAmt;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Bill [id=" + id + ", customerId=" + customerId + ", billDate=" + billDate + ", dueDate=" + dueDate
                + ", billAmt=" + billAmt + ", units=" + units + "]";
    } 
    
    

}
