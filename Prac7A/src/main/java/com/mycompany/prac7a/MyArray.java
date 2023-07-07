package com.mycompany.prac7a;
import java.util.Scanner;
public class MyArray<T> {
    Scanner sc=new Scanner(System.in);
    T arr[];
    int n;
    int size;
       MyArray(int n)
    {
        this.n=n;
         this.arr = (T[]) new Object[n];
        this.size = 0;
    }
    
    
  private void grow()
    {
       int  n1= (int)(n*1.5);
         T newArray[]=(T[])new Object[n1];
         System.arraycopy(arr,0,newArray,0,n);
         arr=newArray;
         n=n1;
         
    }
    void swap(int x1,int x2)
    {
        if(x1>=0 && x1<size && x2>=0 && x2<size)
        {
            T temp=arr[x1];
            arr[x1]=arr[x2];
            arr[x2]=temp;    
        }
        else {
            throw new IndexOutOfBoundsException("Invalid index");
        } 
      
    }
    void add(T x)
    {
       if(size==n)
       {
           grow();
       }
           
    arr[size]=x;
      size++;    
        
        
    }
    void display()
    {
          System.out.println("Array elemnts are\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
  
}
