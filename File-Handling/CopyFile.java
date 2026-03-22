//java program to copy content of one file into another file

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {

        try {
            File source = new File("output.txt");
            FileWriter fw = new FileWriter("copy.txt");

            Scanner sc = new Scanner(source);

            while (sc.hasNextLine()) {
                fw.write(sc.nextLine() + "\n");
            }

            sc.close();
            fw.close();

            System.out.println("File copied successfully");

        } catch (IOException e) {
            System.out.println("Error copying file");
        }
    }
}
