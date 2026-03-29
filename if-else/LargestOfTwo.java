//java program to check largest number between two numbers

import java.util.Scanner;

public class LargestOfTwo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println(" both numbers are equal " + num1);
        }

        else if (num1 > num2) {
            System.out.println(num1 + " is Largest");
        }

        else {
            System.out.println(num2 + " is Largest");
        }

        sc.close();
    }
}
