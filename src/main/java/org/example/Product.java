package org.example;


public class Product {
    public String name;
    String date;
    String manufacturer;
    String country;
    int price;
    String state;

    Product(String name,String date,String manufacturer,String country,int price,String state) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.state = state;
    }

    public void getInfo() {
        System.out.println(name + " " + date + " " +  manufacturer + " " +  country + " " +  price + " " + state);
    }
}