package basics.filehandling;

import java.io.*;


public class ReadUsingBufferReader {
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader fr = new FileReader("src/basics/filehandling/files/2_ExperimentFile.txt");
        BufferedReader bf = new BufferedReader(fr);
        while ((ch = bf.read()) != -1)
            System.out.print((char)ch);
        bf.close();
    }
}
