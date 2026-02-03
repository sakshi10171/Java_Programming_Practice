//Java program to check whether number is armstrong or not

import java.util.Scanner;

class Armstrong{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number: ");
    int num = sc.nextInt();

    int original = num;
    int sum = 0;

    while ( num != 0 ){
      int digit = num % 10;
      sum = sum + (digit * digit * digit);
      num = num / 10;
    }

    if ( sum == original ){
      System.out.println("The number is Armstrong number");
    }
    else{
      System.out.println("The number is not a armstrong number");
    }

  sc.close();
  }
}
