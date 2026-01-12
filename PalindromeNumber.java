//Java program to check whether the number is palindrome or not

import java.util.Scanner;

class PalindromeNumber{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number:");
    int num = sc.nextInt();

    int original = num;
    int reverse = 0;

    if(num < 0){
      System.out.println("Negative numbers are not palindrome");
    }else{

    while (num != 0){
      int digit = num % 10;
      reverse = reverse * 10 + digit;
      num = num / 10;
    }

    if(original == reverse){
      System.out.println("The number is palindrome ");
    }
    else{
      System.out.println("The number is not a palindrome");
    }
    }
    sc.close();
  }
}
