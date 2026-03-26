//java program to rename file using file handling

import java.io.File;

public class RenameFile{

  public static void main(String args[]){

    File oldFile = new File("output.txt");
    file newFile = new File("renamed.txt");

    if(oldFile.renameTo(newFile)) {
      System.out.println("File renamed successfully");
    } else{
      System.out.println("Rename failed");
    }
  }
}
