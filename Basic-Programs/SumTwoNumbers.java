//java program to print sum of two numbers

import java.util.Scanner;

class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));

        sc.close();
    }
}
