//Java program to print lower triangular elements of matrix

import java.util.Scanner;

public class LowerTriangle {
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

        System.out.println("Lower Triangular Matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i >= j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
