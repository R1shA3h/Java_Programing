package com.mycompany.prac7a;
import java.util.*;
public class Prac7A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyArray<Integer> myArray = new MyArray<>(2);
        myArray.add(10);
        myArray.add(20);
        myArray.add(30);
        myArray.add(40);
        myArray.add(50);
        myArray.add(60);
        myArray.display();
        myArray.swap(2, 3);
        myArray.display();
    }
}

