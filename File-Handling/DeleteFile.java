//java program to delete a file

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {

        File file = new File("copy.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Failed to delete file");
        }
    }
}
