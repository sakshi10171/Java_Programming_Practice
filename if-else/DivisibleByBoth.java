//java program to check the num is divisible by both 3 and 5 and print fizzbuzz

import java.util.Scanner;

public class DivisibleByBoth {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }

        else if (num % 3 == 0) {
            System.out.println("Fizz");
        }

        else if (num % 5 == 0) {
            System.out.println("Buzz");
        }

        else {
            System.out.println("Neither divisible by 3 and 5");
        }

        sc.close();
    }
}
