//java program to search word in a file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SearchWord{

  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter word to search: ");
    String word = input.text();

    boolean found = false;

    try {

      File file = new File("output.txt");
      Scanner sc = new Scanner(file);

      while (sc.hasNext()) {
        if (sc.next().equals(word)) {
          found = true;
          break;
        }
      }

      sc.close();

      if (found) {
        System.out.println("Word found in file");
      } else{
        System.out.println("Word not found");
      }

      input.close();

    }
  }
