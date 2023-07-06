package com.mycompany.streams_prac_06;
import java.util.*;
import java.io.*;

public class Customer implements Serializable {
    private String customerID;
    private String name;
    private Product productDetails;

    public Customer(String name, Product productDetails) {
        this.customerID = generateCustomerID();
        this.name = name;
        this.productDetails = productDetails;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public Product getProductDetails() {
        return productDetails;
    }

    private String generateCustomerID() {
        int count = CustomerData.getCustomerCount() + 1;
        String formattedCount = String.format("%03d", count);
        return "C" + formattedCount;
    }
}

class CustomerData {
    private static List<Customer> customers = new ArrayList<>();

    public static void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public static List<Customer> getCustomers() {
        return customers;
    }

    public static int getCustomerCount() {
        return customers.size();
    }
}
