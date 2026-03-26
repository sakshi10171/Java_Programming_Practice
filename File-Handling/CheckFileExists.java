//java program to check file exists or not

import java.io.File;

public class CheckFileExists{

  public static void main(String args[]){

    File file = new File("output.txt");

    if(file.exists()) {
      System.out.println("File exists");
    } else{
      System.out.println("File does not exists");
    }
  }
}
