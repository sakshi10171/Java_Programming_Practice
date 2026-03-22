//java program to write data to file 

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile{

  public static void main(String args[]){

    try{
      FileWriter fw = new FileWriter("output.txt");
      fw.write("Hello, this is file handling in java");
      fw.close();

      System.out.println("Data written to file successfully");
    }catch (IOException e){
      System.out.println("Error writing file");
    }
  }
}
