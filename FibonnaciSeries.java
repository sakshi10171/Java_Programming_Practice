//Java code to print fibonnaci series

import java.util.Scanner;

class FibonnaciSeries{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of terms: ");
    int num = sc.nextInt();

    int a = 0 , b = 1;

    System.out.println("Fibonnaci series:");
    for(int i = 1 ; i <= n; i++){
      System.out.println(a+ " ");
      int next = a + b;
      a = b;
      b = next;
    }

    sc.close();
  }
}

    
