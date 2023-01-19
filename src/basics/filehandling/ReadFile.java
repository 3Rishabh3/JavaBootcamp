package basics.filehandling;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("src/basics/filehandling/files/2_ExperimentFile.txt");
        int i;
        do {
            i = fin.read();
            if(i != -1)
                System.out.print((char)i);
        }while (i != -1);
    }
}
