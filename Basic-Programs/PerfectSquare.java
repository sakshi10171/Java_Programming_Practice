//java program to check number is perfect square

import java.util.Scanner;

class PerfectSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isSquare = false;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isSquare = true;
                break;
            }
        }

        if (isSquare)
            System.out.println("Perfect Square");
        else
            System.out.println("Not Perfect Square");

        sc.close();
    }
}
