//Java program to reverse an array (Using another array)

import java.util.Scanner;

class ReverseArray2{

  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
    int rev[] = new int[n];

    System.out.println("Enter array elements: ");

    for (int i = 0 ; i < n ; i++){
      arr[i] = sc.nextInt();
    }

    for (int i = 0 ; i < n ; i++){
      rev[i] = arr[n - 1 - i];
    }

    System.out.println("Reversed array");

    for (int i = 0 ; i < n ; i++){
      System.out.print(rev[i] + " ");
    }
  }
}
