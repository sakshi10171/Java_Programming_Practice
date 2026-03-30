//java program to check triangle is valid or not by checking sum of two sides is greater than third side

import java.util.Scanner;

public class TriangleValid {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }

        sc.close();
    }
}
