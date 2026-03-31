//java program to check the amount withdrawn is in multiple of 100 or not and the balance is sufficient or not

import java.util.Scanner;

public class ATM {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000; // example balance

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount % 100 != 0) {
            System.out.println("Amount must be multiple of 100");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        }

        sc.close();
    }
}
