//java program to check profit or loss

import java.util.Scanner;

public class ProfitLoss {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        int cp = sc.nextInt();

        System.out.print("Enter selling price: ");
        int sp = sc.nextInt();

        if (sp > cp) {
            System.out.println("Profit of " + (sp - cp));
        } else if (cp > sp) {
            System.out.println("Loss of " + (cp - sp));
        } else {
            System.out.println("No Profit No Loss");
        }

        sc.close();
    }
}
