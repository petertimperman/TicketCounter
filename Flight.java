package com.petertimperman;

import java.math.BigDecimal;

/**
 * Created by PeterTimperman on 5/11/18.
 */
public class Flight {


    private String origin;
    private String destination;
    private BigDecimal price;
    private BigDecimal hours;



    private int id;

    public Flight(String origin, String destination, BigDecimal price, BigDecimal hours, int id ) {
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.hours = hours;
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getHours() {
        return hours;
    }

    public void setHours(BigDecimal hours) {
        this.hours = hours;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
