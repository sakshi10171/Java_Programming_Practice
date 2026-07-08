//Java program to calculate sum of each column in matrix

import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < cols; j++) {

            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Sum of Column " + (j + 1) + " = " + sum);
        }

        sc.close();
    }
}
