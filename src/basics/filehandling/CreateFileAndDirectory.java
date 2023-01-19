package basics.filehandling;

import java.io.*;

public class CreateFileAndDirectory {
    public static void main(String[] args) throws IOException {
        File d = new File("src/basics/filehandling/files");
        d.mkdir();

        File f = new File("src/basics/filehandling/files/1_CreateFile.txt");
        f.createNewFile();
    }
}
