//java program to check year is century year or not

import java.util.Scanner;

public class CenturyYear {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year % 100 == 0) {
            System.out.println("Century Year");
        } else {
            System.out.println("Not a Century Year");
        }

        sc.close();
    }
}
