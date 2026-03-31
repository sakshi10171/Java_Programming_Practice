//java program to check password strength

import java.util.Scanner;

public class PasswordStrength {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.next();

        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                hasDigit = true;
                break;
            }
        }

        if (password.length() >= 8 && hasDigit) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }

        sc.close();
    }
}
