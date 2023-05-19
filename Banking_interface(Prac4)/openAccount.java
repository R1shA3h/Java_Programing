import java.util.*;
public class openAccount {
    int acc_no,aadhar;
    String Name;
    float ROI,bal;

    openAccount(int acc_no,int aadhar,String Name,float ROI,float bal){
        this.acc_no=acc_no;
        this.aadhar=aadhar;
        this.Name=Name;
        this.ROI=ROI;
        this.bal=bal;
    }
    void deposit(int Amount){
        this.bal+=Amount;
        System.out.printf("\nThe Account Balance after Deposit is:",bal,"\n");
    }
    void withdraw(int Amount){
        this.bal-=Amount;
        System.out.printf("\nThe Account Balance after withdrawal is:",bal,"\n");
    }

    void updateIntrest(){
        System.out.printf("\nDepositing 4% intrest to the Account","\n");
        this.bal*=0.04*this.bal;
        System.out.printf("\nThe Updated Balance : ",this.bal,"\n");
    }
    public void closeAccount(){
        this.acc_no=0;
        this.aadhar=0;
        this.Name="";
        this.ROI=0;
        System.out.printf("\nThe Withdrawed Amount is: ",this.bal,"\n");
        this.bal=bal;
        System.out.printf("\nAccount Closed.","\n");
    }
    void display(){
        System.out.printf("\nAccount Holder Name : "+this.Name,"\n");
        System.out.printf("\nAccount Number : "+this.acc_no,"\n");
        System.out.printf("\nBalance : "+this.bal,"\n");
    }
}