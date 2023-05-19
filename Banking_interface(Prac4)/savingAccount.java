import java.util.*;
public class savingAccount extends openAccount implements Debitable {
    savingAccount(int acc_no,int aadhar,String Name,float ROI,float bal){
        super(acc_no,aadhar,Name,ROI,bal);
    }
    public void withdraw(){
        Scanner sc= new Scanner(System.in);
        float Amount= sc.nextFloat();
        super.bal-=Amount;
        System.out.printf("\n\nThe Withdrawal Amount is: "+Amount);
        System.out.printf("\n\nThe Present Account Balance is"+ this.bal);
    }
    void display(){
        System.out.printf("\nAccount Holder Name : "+this.Name,"\n");
        System.out.printf("\nAccount Number : "+this.acc_no,"\n");
        System.out.printf("\nBalance : "+this.bal,"\n");
    }
}