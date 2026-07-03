//Java program to check whether the given matrix is identity matrix or not

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isIdentity = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j && matrix[i][j] != 1) {
                    isIdentity = false;
                }

                if (i != j && matrix[i][j] != 0) {
                    isIdentity = false;
                }
            }
        }

        if (isIdentity) {
            System.out.println("The matrix is an Identity Matrix.");
        } else {
            System.out.println("The matrix is not an Identity Matrix.");
        }

        sc.close();
    }
}
