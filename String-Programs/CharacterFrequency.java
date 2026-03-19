//java program to check character frequency in string

import java.util.Scanner;

class CharacterFrequency{

  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    for ( int i = 0 ; i < str.length() ; i++){
      int count = 1;

      for ( int j = i + 1 ; j < str.length() ; j++){
        if ( str.charAt(i) == str.charAt(j)){
          count++;
        }
      }

      System.out.println(str.charAt(i) + " = " + count);
    }
  }
}
