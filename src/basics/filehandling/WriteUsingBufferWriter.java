package basics.filehandling;
import java.io.*;

public class WriteUsingBufferWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/basics/filehandling/files/2_ExperimentFile.txt", true);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("Writing using buffer reader");
        bf.close();
    }
}
