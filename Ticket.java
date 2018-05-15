package com.petertimperman;

import java.util.ArrayList;

/**
 * Created by PeterTimperman on 5/11/18.
 */
public class Ticket {
    private boolean isChild;
    private String customer;
    private Flight flight;
    private String flyerName;



    public Ticket(String customer, String fylerName, boolean isChild, Flight flight){
        this.customer = customer;
        this.flyerName = flyerName;
        this.isChild = isChild;
        this.flight = flight;

    }

    public boolean isChild() {
        return isChild;
    }

    public void setChild(boolean child) {
        isChild = child;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getFlyerName() {
        return flyerName;
    }

    public void setFlyerName(String flyerName) {
        this.flyerName = flyerName;
    }
}

