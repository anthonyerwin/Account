import java.text.NumberFormat;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // Account munozAccount = new Account (250, "Maria", "Munoz", "110 Glades
        // Rodad", "Mytown", "FL", "33445");

        PersonalAcct personalAcct = new PersonalAcct(250, "Maria", "Munoz", "110 Glades Rodad", "Mytown", "FL",
                "33445");
        BusinessAcct businessAcct = new BusinessAcct(600, "Marino", "Munoz", "110 Glades Rodad", "Mytown", "FL",
                "33445");

        Scanner input = new Scanner(System.in);
        double data;
        NumberFormat money = NumberFormat.getCurrencyInstance();

        // System.out.println(munozAccount);
        // System.out.print("Enter deposit amount: ");
        // data = input.nextDouble();
        // munozAccount.deposit(data);
        // System.out.println("Balance is: " + money.format(munozAccount.getBalance()));

        // System.out.print("Enter withdrawal amount: ");
        // data = input.nextDouble();
        // munozAccount.withdrawal(data);
        // System.out.println("Balance is: " + money.format(munozAccount.getBalance()));

        System.out.println(personalAcct);
        System.out.print("Enter withdrawal amount for Personal account: ");
        data = input.nextDouble();
        personalAcct.withdrawal(data);
        System.out.println("Personal Account balance: " + money.format(personalAcct.getBalance()));

        System.out.println(businessAcct);
        System.out.print("Enter withdrawal amount for Business account: ");
        data = input.nextDouble();
        businessAcct.withdrawal(data);
        System.out.println("Business Account balance: " + money.format(businessAcct.getBalance()));

        input.close();
    }

}
