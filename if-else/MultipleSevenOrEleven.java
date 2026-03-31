//java program to check a number is multiple of seven or eleven

import java.util.Scanner;

public class MultipleSevenOrEleven {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 7 == 0 || num % 11 == 0) {
            System.out.println("Number is divisible by 7 or 11");
        } else {
            System.out.println("Not divisible by 7 or 11");
        }

        sc.close();
    }
}
