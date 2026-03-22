//java program to append file

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile{

  public static void main(String args[]){

    try{

      FileWriter fw = new FileWriter("output.txt", true);
      fw.write("\n Appending new data");
      fw.close();

      System.out.println("Data appended successfully");

    } catch (IOException e) {
      System.out.println("Error appending file");
    }
  }
}
