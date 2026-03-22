//java program to count lines in a file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCountFile {

  public static void main(String args[]) {

    int count = 0;

    try {

      File file = new File("output.txt");
      Scanner sc = new Scanner(file);

      while (sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }

      sc.close();

      System.out.println("Total lines: " + count);
    } catch (IOException e) {
      System.out.println("File not found");
    }
  }
}
