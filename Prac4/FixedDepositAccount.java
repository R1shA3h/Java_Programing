import java.util.*;
public class FixedDepositAccount extends openAccount {
    float lockInPer;
    double fd_amt;
    FixedDepositAccount(int acc_no,int aadhar,String Name,float ROI,float bal,double fd_amt,float lockInPer){
        super(acc_no,aadhar,Name,ROI,bal);
        this.lockInPer=lockInPer;
        this.fd_amt=fd_amt;
    }

    void updateIntrest(){
        System.out.printf("\nUpdating Balance as per lockin period year ");
        if (lockInPer>1 && lockInPer<=2){
            this.fd_amt+=0.06*this.bal;
            System.out.printf("\nThe Updated FD Account Balance is: ",this.fd_amt);
        }
        else if (lockInPer>2 && lockInPer<=5){
            this.fd_amt+=0.065*this.bal;
            System.out.printf("\nThe Updated FD Account Balance is: ",this.fd_amt);
        }
        else if(lockInPer>5){
            this.fd_amt+=0.07*this.bal;
            System.out.printf("\nThe Updated FD Account Balance is: ",this.fd_amt);
        }
    }

    public void closeAccount(){
        super.ROI = 0.04f;
        super.bal-= 0.05*super.bal;
        this.fd_amt=0;
        System.out.printf("\nFD Account Closed!");
    }

    void display(){
        System.out.printf("\nAccount Holder Name : "+this.Name);
        System.out.printf("\nAccount Number : "+this.acc_no);
        System.out.printf("\nBalance : "+this.bal);
    }
}