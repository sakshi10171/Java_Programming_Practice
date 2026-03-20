//java program to understand method overloading

import java.util.Scanner;

public class MethodOverloading{

  int add(int a , int b){
    return a + b;
  }

  int add(int a , int b ,  int c){
    return a + b + c;
  }

  public static void main(String args[]){
      MethodOverloading obj = new MethodOverloading();

      System.out.println("Sum of 2 numbers: " + obj.add(10, 20));
      System.out.println("Sum of 3 numbers: " + obj.add(10, 20, 30));

  }
}
