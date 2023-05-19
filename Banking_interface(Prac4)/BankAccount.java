import java.util.*;
interface Debitable{
    void withdraw();
}
public class BankAccount {
    static int accNumSaving = 11000;
    static int accNumFD = 55000;

    public static void main(String[] args) {
        // TODO code application logic here
        int value = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nInstruction\n1: Saving Account\n2: FD Account\n**-1: to exit**\nEnter value: ");
            value = sc.nextByte();
            if (value == 1) {
                // openaccount
                openAccount obj = new savingAccount(accNumSaving, 121145144, "Rishabh", 0.04f, 101100);
                accNumSaving++;
                obj.display();
                obj.deposit(20000);
            } else if (value == 2) {
                // FD-Account
                System.out.println("Enter lockInPeriod: \n");
                float lockInPeriod = sc.nextFloat();
                System.out.println("Enter FD amount: \n");
                float fd = sc.nextFloat();
                openAccount obj = new FixedDepositAccount(accNumFD, 121145144, "Rishabh", 0.04f, 101100f, lockInPeriod, fd);
                accNumFD++;
                obj.updateIntrest();
                obj.display();
            } else {
                System.out.println("Invalid Input!...\n");
                break;
            }
        } while (value!=-1);
    }
}