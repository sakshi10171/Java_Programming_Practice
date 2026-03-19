//java program to check duplicate characters in string

import java.util.Scanner;

class DuplicateCharacters{

  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    System.out.println("Duplicate characters");

    for (int i = 0 ; i < str.length() ; i++){
      int count = 0;

      for (int j = 0 ; j < str.length() ; j++){
        if(str.charAt(i) == str.charAt(j)){
          count++;
        }
      }

      if(count > 1){
        System.out.print(str.charAt(i) + " ");
      }
    }
  }
}
