//java program to count vowels and consonents from string

import java.util.Scanner;

class CountVowelsConsonents{

  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    int vowels = 0 , consonants = 0;

    for ( int i = 0 ; i < str.length() ; i++){
      char ch = str.charAt(i);

      if(Character.isLetter(ch)){
        if("aeiouAEIOU".indexOf(ch) != -1){
          vowels++;
        }else{
          consonants++;
        }
      }
    }

    System.out.println("Vowels = " + vowels);
    System.out.println("Consonants = " + consonants);
  }
}
