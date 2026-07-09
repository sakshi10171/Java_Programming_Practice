//Java program to calculate the sum of primary diagonal of a square matrix

import java.util.Scanner;

public class MatrixTrace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int trace = 0;

        for (int i = 0; i < n; i++) {
            trace += matrix[i][i];
        }

        System.out.println("Trace of the matrix = " + trace);

        sc.close();
    }
}
