//java program to check grade 

import java.util.Scanner;

public class Grade {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the grade: ");
        int grade = sc.nextInt();

        if (grade >= 90) {
            System.out.println("A grade");
        }

        else if (grade >= 75) {
            System.out.println("B grade");
        }

        else if (grade >= 50) {
            System.out.println("C grade");
        }

        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
