package basics.filehandling;

import java.io.*;

public class CreateFileAndDirectory {
    public static void main(String[] args) throws IOException {
        File f = new File("/FileHandling/1_CreateFile");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());

        File d = new File("src/basics/filehandling/files");
        d.mkdir();
    }
}
