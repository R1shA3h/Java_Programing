package com.mycompany.streams_prac_06;
import java.util.*;
import java.io.*;

public class Product implements Serializable {
    private String productID;
    private String name;
    private int quantity;
    private double price;

    public Product(String productID, String name, int quantity, double price) {
        this.productID = productID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


 