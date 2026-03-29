//java program to check voter is eligible to vote or not

import java.util.Scanner;

public class VoterEligibility {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        sc.close();
    }
}
