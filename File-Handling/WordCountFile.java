//java program to count words from a file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCountFile{

  public static void main(String args[]){

    int count = 0;

    try {

      File file = new File("output.txt");
      Scanner sc = new Scanner(file);

      while (sc.hasNext()) {
        sc.next();
        count++;
      }

      sc.close();
      System.out.println("Total words: " + count);

    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }
}
