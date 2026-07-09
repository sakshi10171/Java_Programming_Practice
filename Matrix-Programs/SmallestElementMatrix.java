//Java program to find smallest element from matrix

import java.util.Scanner;

public class SmallestElementMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int smallest = matrix[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }

        System.out.println("Smallest element = " + smallest);

        sc.close();
    }
}
