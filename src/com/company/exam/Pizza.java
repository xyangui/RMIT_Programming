package com.company.exam;

public class Pizza {
    private String name;
    private int price;

    public Pizza(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}
