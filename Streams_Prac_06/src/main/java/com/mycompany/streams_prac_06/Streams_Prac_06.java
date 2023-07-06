package com.mycompany.streams_prac_06;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Streams_Prac_06 implements Serializable{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Product product1 = new Product("P001", "Product 1", 10, 9.99);
        Product product2 = new Product("P002", "Product 2", 5, 19.99);
        Product product3 = new Product("P003", "Product 3", 3, 14.99);

       
        writeProductToFile(product1);
        writeProductToFile(product2);
        writeProductToFile(product3);

        
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter product ID: ");
        String productID = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

       
        Product product = getProductByID(productID);

        if (product != null && product.getQuantity() >= quantity) {
            
            Customer customer = new Customer(customerName, product);

            product.setQuantity(product.getQuantity() - quantity);

            CustomerData.addCustomer(customer);

            writeCustomerToFile(customer);

            updateProductInFile(product);

            System.out.println("Sale recorded successfully!");
        } else {
            System.out.println("Product not found or insufficient quantity!");
        }
    }

    private static void writeProductToFile(Product product) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("product.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(product);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Product getProductByID(String productID) {
    try {
        FileInputStream fileInputStream = new FileInputStream("product.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Product product;
        while (true) {
            try {
                product = (Product) objectInputStream.readObject();
                if (product.getProductID().equals(productID)) {
                    objectInputStream.close();
                    fileInputStream.close();
                    return product;
                }
            } catch (EOFException e) {
                break;
            }
        }
        objectInputStream.close();
        fileInputStream.close();
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    return null;
}


    private static void writeCustomerToFile(Customer customer) {
        try {
            FileWriter fileWriter = new FileWriter("sales.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(customer.getCustomerID() + "," + customer.getName() + "," +
                    customer.getProductDetails().getProductID() + "," +
                    customer.getProductDetails().getName() + "," +
                    customer.getProductDetails().getQuantity() + "," +
                    customer.getProductDetails().getPrice());
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void updateProductInFile(Product product) {
        try {
            FileInputStream fileInputStream = new FileInputStream("product.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream("temp.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            Product tempProduct;
            while (true) {
                try {
                    tempProduct = (Product) objectInputStream.readObject();
                    if (tempProduct.getProductID().equals(product.getProductID())) {
                        tempProduct.setQuantity(product.getQuantity());
                    }
                    objectOutputStream.writeObject(tempProduct);
                } catch (EOFException e) {
                    break;
                }
            }
            objectInputStream.close();
            objectOutputStream.close();
            fileInputStream.close();
            fileOutputStream.close();

            // Rename the temporary file to "product.txt"
            File file = new File("product.txt");
            File tempFile = new File("temp.txt");
            if (file.exists()) {
                file.delete();
            }
            tempFile.renameTo(file);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}